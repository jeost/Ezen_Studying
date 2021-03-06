package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import controller.login.Login;
import dto.Member;

public class MemberDao {
	private Connection con; // DB연동시 사용 클래스
	private PreparedStatement ps; // 연결된 DB 내 sQL 조작시 사용
	private ResultSet rs; // 결과물 조작
	
	public static MemberDao memberDao  = new MemberDao(); // DB 연동 객체
	
	public MemberDao() {
		try {
		//DB연동
			Class.forName("com.mysql.cj.jdbc.Driver");//1. DB 드라이버 가져오기
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC", "root", "1234");//2. DB 주소 연결
		}catch(Exception e) {System.out.println(e);}
	}
	
	//메소드
		//아이디 중복체크 (아이디를 인수로 받아 db에 존재하는지 체크)
		public boolean idcheck(String id) {
			try {
			//SQL 작성
				//검색 : select*from member where 조건(필드명=값)
			String sql = "select * from member where mId=?";
			//SQL 조작
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			//SQL 실행
			rs = ps.executeQuery(); // 검색 실행
			//SQL 결과
			if(rs.next()) { // 중복이 있으면 true 반환 없으면 false 반환
				return true;
				}
			}catch(Exception e) {System.out.println(e);}
			return false;
		}
	
		//회원가입
	public boolean signUp(Member member) {
		
		try {
		// 1. SQL작성 [ 회원번호(자동)제외 모든 필드 삽입
		String sql = "insert into member(mId,mpassword,mEmail,mAddress,mPoint,mSince,lastlogindate)values(?,?,?,?,?,?,?)";
		// 2. SQL조작
		ps = con.prepareStatement(sql); // prepare어쩌고 인터페이스 내 연결된 db에 sql 넣기
		ps.setString(1, member.getmId());
		ps.setString(2, member.getmPw());
		ps.setString(3, member.getmEMail());
		ps.setString(4, member.getmAddress());
		ps.setInt(5, member.getmPoint());
		ps.setString(6, member.getmSince());
		ps.setString(7, member.getmLdate());
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println(e);}
		return false;}
		//로그인
	public boolean login(String id, String pw)  { // and랑 or 사용가능
		//sql 작성
		try {
		String sql = "select * from member where mId=? and mpassword=?";
		//sql 조작
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		//sql 실행
		rs = ps.executeQuery(); // select 실행 -> resultSet
		//sql 결과
		if(rs.next()) { // select시 결과물이 있으면(아디비번 맞으면) true 없으면 false
			return true;
			}
		}catch(Exception e) {System.out.println(e);}
		return false;}
	public boolean lLogin(String id) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String today = format.format(new Date());
		Member temp = getmember(id);
		System.out.println(temp.getmLdate());
		if(!temp.getmLdate().equals(today)) { //마지막 로그인날짜랑 오늘이 같지 않으면
    	String sql="update member set lastlogindate=? where mid=?";
		try {
		ps=con.prepareStatement(sql);
		ps.setString(1, today);
		ps.setString(2, id);
		ps.executeUpdate();
		return true;
			}catch(Exception e) {System.out.println("마지막로그인 오류 "+e);}
		}
		return false;
	}
		//아이디찾기
	public String findId(String eMail) {
		try {
		//SQL 작성
		String sql = "select * from member where mEmail=?";
		//SQL 조작
		ps = con.prepareStatement(sql);
		ps.setString(1, eMail);
		//SQL 실행
		rs=ps.executeQuery();  // select 실행문
		//SQL 결과
		if(rs.next()) { // 실행결과의 다음 값이 존재하면
			return  rs.getString(2);
		}
		}catch(Exception e) {System.out.println(e);}
		return null;}
		//비밀번호찾기
	public String findPw(String id, String eMail) {
		String sql = "select * from member where mId=? and mEmail=?";
		try {
		ps=con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, eMail);
		
		rs=ps.executeQuery();
		
		if(rs.next()) {
			return rs.getString(3);
			}
		}catch(Exception e) {System.out.println(e);}
		return null;}
	
	//아이디 인수 후 회원정보 호출
	public Member getmember(String id) {
		try {
			//sql작성
			String sql = "select * from member where mId=?";
			//sql조작
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			//sql실행
			rs = ps.executeQuery();
			//sql결과
			if(rs.next()) {
				Member member = new Member(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6),
						rs.getString(7),
						rs.getString(8)
						);
						return member;
			}
			
		}catch(Exception e) {System.out.println(e);} return null;
	}
	public boolean delete(int mNum) {
		try {
		//sql 작성
			//레코드삭제 : delete from 테이블명 where 조건
		String sql = "delete from member where mNum = ?";
		//sql 조작
		ps = con.prepareStatement(sql);
		ps.setInt(1, mNum);
		//sql 실행
		ps.executeUpdate();
		//sql 결과
		return true;
		}catch(Exception e) {System.out.println(e);} return false;
	}
	
	//회원수정 [ 회원번호[수정대상], 이메일, 주소를 인수로 받아 정보 수정 처리 ]
	public boolean update(int mNum, String eMail, String address) {
		try {
		//SQL 작성
		String sql = "update member set mEmail=?, mAddress=? where mNum=?";
		//SQL 조작
		ps=con.prepareStatement(sql);
		ps.setString(1, eMail); ps.setString(2, address); ps.setInt(3, mNum);
		//SQL 실행
		ps.executeUpdate();
		//SQL 결과
		return true;
		}catch(Exception e) {
			System.out.println("회원수정 오류"+e);
		}
		return false;
	}
	//해당 회원번호로 id 찾기 메소드
	public String getmId(int mnum) {
		try {
		String sql="select mid from member where mnum=?";
		ps=con.prepareStatement(sql);
		ps.setInt(1, mnum);
		rs=ps.executeQuery();
		if(rs.next()) {
			return rs.getString(1);
		}
		}catch(Exception e) {
			System.out.println("id찾기 오류"+e);
		}return null;
	}
	//멤버 출석 포인트 추가
	public void mPoint(String id) {
		try {
			String sql="update member set mpoint=? where mid=?";
			
			ps=con.prepareStatement(sql);
			ps.setInt(1, Login.member.getmPoint()+10);
			ps.setString(2, id);
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("포인트 오류"+e);
		}
	}
	//카테고리별 개수
	public Map<String, Integer> countCategory(){
		Map<String, Integer> map = new HashMap<>();
		try {
		String sql = "select pcategory, count(*) from product group by pcategory";
		ps = con.prepareStatement(sql);
		return map;
		}catch(Exception e) {
			System.out.println("카테고리별 개수 오류 "+e);
		} return null;
	}
	//전체 회원수 반환
	public int countTotal(String tname) {
		String sql = "select count(*) from" +tname;
		try {
			ps=con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
				//조회결과의 첫번째 필드 반환
			}
		}catch(Exception e) {System.out.println("통계 반환 오류 "+e);}
		return 0;
	}
	//날짜별 통계 반환
	public Map<String, Integer>datetotal(String tname, String date){
		Map<String, Integer> map = new HashMap<String, Integer>();
		String sql = "select substring_index( "+date+",' ', 1), count(*) from "+tname+" group by substring_index("+date+", ' ', 1)"; // 날짜랑 시간 공백기준으로 분리해서 자르기
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				map.put(rs.getString(1), rs.getInt(2));
			}
			return map;
		}catch(Exception e) {System.out.println("날짜별 반환 오류 "+e);}
		return null;
	}
	
}
