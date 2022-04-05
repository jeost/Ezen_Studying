package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Board;
import dto.Reply;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoardDao {
	//필드
	private Connection conn; // DB 연동 클래스
	private PreparedStatement ps; // 연결된 DB 내 sql 조작 인터페이스
	private ResultSet rs;  // SQL 결과 레코드를 가져오는 인터페이스
	
	public static BoardDao boardDao = new BoardDao(); // 메모리 할당 객체
	//생성자
	public BoardDao() { // 객체 생성시 바로 DB연동하려고 생성자에서 연동
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC", "root", "1234");
		}catch(Exception e) {
			System.out.println("객체생성 에러 : "+e);
		}
	}
	//메소드
		//글 쓰기
	public boolean write(Board board) {
		try {
		//sql 작성
			String sql = "insert into board(btitle,bcontent,bwrite)values(?,?,?)";
		//sql 조작
			ps = conn.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBwrite());
		//sql 실행
			ps.executeUpdate();
		//sql 결과
			return true;
		}catch(Exception e) {
			System.out.println("글쓰기 SQL 오류 "+e);
		}
		return false;
	}
		//글 목록
	public ObservableList<Board> list() {
		ObservableList<Board> boardlist = FXCollections.observableArrayList();
		try {
		String sql = "select * from board order by bnum desc";
		
		ps = conn.prepareStatement(sql);
		
		rs = ps.executeQuery();
		
		while(rs.next()) { // 다음 레코드가 없을 때 까지 반복
			//객체화
			Board board = new Board(rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
					rs.getInt(6));
			//객체를 리스트에 담기
			boardlist.add(board);
		}
		//성공시 리스트 반환
		return boardlist;
		}catch(Exception e) {System.out.println(e);}
		return null;
	}
		//글 삭제
	public boolean delete(int bnum) {
		try {
			//sql 작성
			String sql = "delete from board where bnum=?";
			//sql 조작
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bnum);
			//sql 실행
			ps.executeUpdate();
			//sql 결과
			return true;
		}catch(Exception e) {
			System.out.println("글 삭제 실패"+e);
		}
		return false;
	}
		//글 수정
	public boolean update(int bnum, String title, String content) {
		try {
			//sql작성
			String sql = "update board set btitle=?, bcontent=? where bnum=?";
			//sql조작
			ps=conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, bnum);
			//sql실행
			ps.executeUpdate();
			//sql결과
			return true;
		}catch(Exception e) {
			System.out.println("글 삭제 실패"+e);
		}
		return false;
	}
	
	//댓글 작성 메소드
	public boolean rwrite(Reply reply) {
		try {
		String sql = "insert into reply(rcontent,rwrite,bnum)";
		ps=conn.prepareStatement(sql);
		ps.setString(1, reply.getRcontent());
		ps.setString(2, reply.getRwrite());
		ps.setInt(3, reply.getBnum());
		ps.executeUpdate();
		return true;
		}catch(Exception e) {
			System.out.println("댓글 작성 실패"+e);
		}
		return false;
	}
	//댓글 호출 메소드
	public ObservableList<Reply> replylist(int bnum){
		ObservableList<Reply> replylist = FXCollections.observableArrayList();
		try {
			String sql = "select * from reply where bnum=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bnum);
			rs = ps.executeQuery();
			while(rs.next()) {
				Reply reply = new Reply(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5));
				replylist.add(reply);
			}return replylist;
		}catch(Exception e) {
			System.out.println("댓글 호출 실패"+e);
		}return null;
	}
}
