package application.Day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Day22_2 {
	
	// 1.필드
		private Connection connection; // DB연동 객체 선언 
	// 2.생성자
		public Day22_2 ( ) {
			try { // JAVA외 외부와 연결시 무조건 일반예외 발생 
				// 1. DB 드라이브 클래스 호출 [ DB 회사 마다 다르기때문에 암기X 정리O ]
				Class.forName("com.mysql.cj.jdbc.Driver");
				// 2. DB 연결 
				connection = DriverManager.getConnection(
						// JDBC : JAVA DABABASE CONNECTION
						// jdbc:mysql://IP주소(로컬[본인pc]이면localhost):port번호/DB이름?DB시간설정
						// , 계정명 , "DB비밀번호"
						"jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC" , 
						"root",
						"1234");
				// 3. 확인
				System.out.println("[DB 연동 성공]");
			}catch( Exception e ) {
				System.out.println("[DB 연동 실패] 이유 : "+e);
			}
		}
	
	// 3. 데이터 작성 메소드 
	public boolean write(String 작성자, String 내용) {
		try {
		String sql =  "insert into test(writer,content) values(?,?)";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, 작성자);
		ps.setString(2, 내용);
		
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println("sql 연결 실패" + e);}
		return false;
	}
	public ArrayList<데이터> get(){
		ArrayList<데이터> 데이터목록 = new ArrayList<>();
		try {
		//sql 작성 [데이터 호출]
			//select * (모든필드) from 테이블명;
		String sql = "select * from test";
		//sql 조작 [DB와 연결된 객체와 조작 인터페이스 연결]
		PreparedStatement ps = connection.prepareStatement(sql);
		//sql 실행 [ resultset인터페이스 java.sql 패키지]
		ResultSet rs = ps.executeQuery();
		
		//결과물이 여러개니 반복문
			//한줄씩 객체화
		while(rs.next()) { // 다음 줄이 있으면
			데이터 temp = new 데이터(rs.getInt(1), rs.getString(2), rs.getString(3)) ;
			rs.getInt(1); // 해당 줄[레코드]의 첫번째 필드[세로]값 가져오기
			데이터목록.add(temp); // 데이터 담아주기
		}
		
		//성공시 데이터 목록 반환
		return 데이터목록;
		}catch(Exception e) {System.out.println(e);}
		//실패시
		return null;
	}
}
