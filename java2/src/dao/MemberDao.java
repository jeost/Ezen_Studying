package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC", "root", "1234");//2. DB 주소 연결
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
		String sql = "insert into member(mId,mPw,mEmail,mAddress,mPoint,mSince)values(?,?,?,?,?,?)";
		// 2. SQL조작
		ps = con.prepareStatement(sql); // prepare어쩌고 인터페이스 내 연결된 db에 sql 넣기
		ps.setString(1, member.getmId());
		ps.setString(2, member.getmPw());
		ps.setString(3, member.getmEMail());
		ps.setString(4, member.getmAddress());
		ps.setInt(5, member.getmPoint());
		ps.setString(6, member.getmSince());
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println(e);}
		return false;}
		//로그인
	public boolean login(String id, String pw)  { // and랑 or 사용가능
		//sql 작성
		try {
		String sql = "select * from member where mId=? and mPw=?";
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
		//아이디찾기
	public String findId(String eMail) {
		
		return null;}
		//비밀번호찾기
	public String findPw(String id, String eMail) {return null;}
}
