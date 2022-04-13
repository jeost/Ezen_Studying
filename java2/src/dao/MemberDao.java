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
	private Connection con; // DB������ ��� Ŭ����
	private PreparedStatement ps; // ����� DB �� sQL ���۽� ���
	private ResultSet rs; // ����� ����
	
	public static MemberDao memberDao  = new MemberDao(); // DB ���� ��ü
	
	public MemberDao() {
		try {
		//DB����
			Class.forName("com.mysql.cj.jdbc.Driver");//1. DB ����̹� ��������
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC", "root", "1234");//2. DB �ּ� ����
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
		String sql = "insert into member(mId,mpassword,mEmail,mAddress,mPoint,mSince,lastlogindate)values(?,?,?,?,?,?,?)";
		// 2. SQL����
		ps = con.prepareStatement(sql); // prepare��¼�� �������̽� �� ����� db�� sql �ֱ�
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
		//�α���
	public boolean login(String id, String pw)  { // and�� or ��밡��
		//sql �ۼ�
		try {
		String sql = "select * from member where mId=? and mpassword=?";
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
	public boolean lLogin(String id) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String today = format.format(new Date());
		Member temp = getmember(id);
		System.out.println(temp.getmLdate());
		if(!temp.getmLdate().equals(today)) { //������ �α��γ�¥�� ������ ���� ������
    	String sql="update member set lastlogindate=? where mid=?";
		try {
		ps=con.prepareStatement(sql);
		ps.setString(1, today);
		ps.setString(2, id);
		ps.executeUpdate();
		return true;
			}catch(Exception e) {System.out.println("�������α��� ���� "+e);}
		}
		return false;
	}
		//���̵�ã��
	public String findId(String eMail) {
		try {
		//SQL �ۼ�
		String sql = "select * from member where mEmail=?";
		//SQL ����
		ps = con.prepareStatement(sql);
		ps.setString(1, eMail);
		//SQL ����
		rs=ps.executeQuery();  // select ���๮
		//SQL ���
		if(rs.next()) { // �������� ���� ���� �����ϸ�
			return  rs.getString(2);
		}
		}catch(Exception e) {System.out.println(e);}
		return null;}
		//��й�ȣã��
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
	
	//���̵� �μ� �� ȸ������ ȣ��
	public Member getmember(String id) {
		try {
			//sql�ۼ�
			String sql = "select * from member where mId=?";
			//sql����
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			//sql����
			rs = ps.executeQuery();
			//sql���
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
		//sql �ۼ�
			//���ڵ���� : delete from ���̺�� where ����
		String sql = "delete from member where mNum = ?";
		//sql ����
		ps = con.prepareStatement(sql);
		ps.setInt(1, mNum);
		//sql ����
		ps.executeUpdate();
		//sql ���
		return true;
		}catch(Exception e) {System.out.println(e);} return false;
	}
	
	//ȸ������ [ ȸ����ȣ[�������], �̸���, �ּҸ� �μ��� �޾� ���� ���� ó�� ]
	public boolean update(int mNum, String eMail, String address) {
		try {
		//SQL �ۼ�
		String sql = "update member set mEmail=?, mAddress=? where mNum=?";
		//SQL ����
		ps=con.prepareStatement(sql);
		ps.setString(1, eMail); ps.setString(2, address); ps.setInt(3, mNum);
		//SQL ����
		ps.executeUpdate();
		//SQL ���
		return true;
		}catch(Exception e) {
			System.out.println("ȸ������ ����"+e);
		}
		return false;
	}
	//�ش� ȸ����ȣ�� id ã�� �޼ҵ�
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
			System.out.println("idã�� ����"+e);
		}return null;
	}
	//��� �⼮ ����Ʈ �߰�
	public void mPoint(String id) {
		try {
			String sql="update member set mpoint=? where mid=?";
			
			ps=con.prepareStatement(sql);
			ps.setInt(1, Login.member.getmPoint()+10);
			ps.setString(2, id);
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("����Ʈ ����"+e);
		}
	}
	//ī�װ��� ����
	public Map<String, Integer> countCategory(){
		Map<String, Integer> map = new HashMap<>();
		try {
		String sql = "select pcategory, count(*) from product group by pcategory";
		ps = con.prepareStatement(sql);
		return map;
		}catch(Exception e) {
			System.out.println("ī�װ��� ���� ���� "+e);
		} return null;
	}
	//��ü ȸ���� ��ȯ
	public int countTotal(String tname) {
		String sql = "select count(*) from" +tname;
		try {
			ps=con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
				//��ȸ����� ù��° �ʵ� ��ȯ
			}
		}catch(Exception e) {System.out.println("��� ��ȯ ���� "+e);}
		return 0;
	}
	//��¥�� ��� ��ȯ
	public Map<String, Integer>datetotal(String tname, String date){
		Map<String, Integer> map = new HashMap<String, Integer>();
		String sql = "select substring_index( "+date+",' ', 1), count(*) from "+tname+" group by substring_index("+date+", ' ', 1)"; // ��¥�� �ð� ����������� �и��ؼ� �ڸ���
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				map.put(rs.getString(1), rs.getInt(2));
			}
			return map;
		}catch(Exception e) {System.out.println("��¥�� ��ȯ ���� "+e);}
		return null;
	}
	
}
