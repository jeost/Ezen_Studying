package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Member;

public class MemberDao {

	private Connection con; // DB������ ��� Ŭ����
	private PreparedStatement ps; // ����� DB �� sQL ���۽� ���
	private ResultSet rs; // ����� ����
	
	public static MemberDao memberDao  = new MemberDao(); // DB ���� ��ü
	
	public MemberDao() {
		try {
		//DB����
			Class.forName("com.mysql.cj.jdbc.Driver");//1. DB ����̹� ��������
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC", "root", "1234");//2. DB �ּ� ����
		}catch(Exception e) {System.out.println(e);}
	}
	
	//�޼ҵ�
		//���̵� �ߺ�üũ (���̵� �μ��� �޾� db�� �����ϴ��� üũ)
		public boolean idcheck(String id) {
			try {
			//SQL �ۼ�
				//�˻� : select*from member where ����(�ʵ��=��)
			String sql = "select * from member where mId=?";
			//SQL ����
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			//SQL ����
			rs = ps.executeQuery(); // �˻� ����
			//SQL ���
			if(rs.next()) { // �ߺ��� ������ true ��ȯ ������ false ��ȯ
				return true;
			}
			}catch(Exception e) {System.out.println(e);}
			return false;
		}
	
		//ȸ������
	public boolean signUp(Member member) {
		try {
		// 1. SQL�ۼ� [ ȸ����ȣ(�ڵ�)���� ��� �ʵ� ����
		String sql = "insert into member(mId,mPw,mEmail,mAddress,mPoint,mSince)values(?,?,?,?,?,?)";
		// 2. SQL����
		ps = con.prepareStatement(sql); // prepare��¼�� �������̽� �� ����� db�� sql �ֱ�
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
		//�α���
	public boolean login(String id, String pw)  { // and�� or ��밡��
		//sql �ۼ�
		try {
		String sql = "select * from member where mId=? and mPw=?";
		//sql ����
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		//sql ����
		rs = ps.executeQuery(); // select ���� -> resultSet
		//sql ���
		if(rs.next()) { // select�� ������� ������(�Ƶ��� ������) true ������ false
			return true;
			}
		}catch(Exception e) {System.out.println(e);}
		return false;}
		//���̵�ã��
	public String findId(String eMail) {
		
		return null;}
		//��й�ȣã��
	public String findPw(String id, String eMail) {return null;}
}
