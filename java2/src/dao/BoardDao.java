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
	//�ʵ�
	private Connection conn; // DB ���� Ŭ����
	private PreparedStatement ps; // ����� DB �� sql ���� �������̽�
	private ResultSet rs;  // SQL ��� ���ڵ带 �������� �������̽�
	
	public static BoardDao boardDao = new BoardDao(); // �޸� �Ҵ� ��ü
	//������
	public BoardDao() { // ��ü ������ �ٷ� DB�����Ϸ��� �����ڿ��� ����
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC", "root", "1234");
		}catch(Exception e) {
			System.out.println("��ü���� ���� : "+e);
		}
	}
	//�޼ҵ�
		//�� ����
	public boolean write(Board board) {
		try {
		//sql �ۼ�
			String sql = "insert into board(btitle,bcontent,bwrite)values(?,?,?)";
		//sql ����
			ps = conn.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBwrite());
		//sql ����
			ps.executeUpdate();
		//sql ���
			return true;
		}catch(Exception e) {
			System.out.println("�۾��� SQL ���� "+e);
		}
		return false;
	}
		//�� ���
	public ObservableList<Board> list() {
		ObservableList<Board> boardlist = FXCollections.observableArrayList();
		try {
		String sql = "select * from board order by bnum desc";
		
		ps = conn.prepareStatement(sql);
		
		rs = ps.executeQuery();
		
		while(rs.next()) { // ���� ���ڵ尡 ���� �� ���� �ݺ�
			//��üȭ
			Board board = new Board(rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
					rs.getInt(6));
			//��ü�� ����Ʈ�� ���
			boardlist.add(board);
		}
		//������ ����Ʈ ��ȯ
		return boardlist;
		}catch(Exception e) {System.out.println(e);}
		return null;
	}
		//�� ����
	public boolean delete(int bnum) {
		try {
			//sql �ۼ�
			String sql = "delete from board where bnum=?";
			//sql ����
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bnum);
			//sql ����
			ps.executeUpdate();
			//sql ���
			return true;
		}catch(Exception e) {
			System.out.println("�� ���� ����"+e);
		}
		return false;
	}
		//�� ����
	public boolean update(int bnum, String title, String content) {
		try {
			//sql�ۼ�
			String sql = "update board set btitle=?, bcontent=? where bnum=?";
			//sql����
			ps=conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, bnum);
			//sql����
			ps.executeUpdate();
			//sql���
			return true;
		}catch(Exception e) {
			System.out.println("�� ���� ����"+e);
		}
		return false;
	}
	
	//��� �ۼ� �޼ҵ�
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
			System.out.println("��� �ۼ� ����"+e);
		}
		return false;
	}
	//��� ȣ�� �޼ҵ�
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
			System.out.println("��� ȣ�� ����"+e);
		}return null;
	}
}
