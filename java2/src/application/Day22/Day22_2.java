package application.Day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Day22_2 {
	
	// 1.�ʵ�
		private Connection connection; // DB���� ��ü ���� 
	// 2.������
		public Day22_2 ( ) {
			try { // JAVA�� �ܺο� ����� ������ �Ϲݿ��� �߻� 
				// 1. DB ����̺� Ŭ���� ȣ�� [ DB ȸ�� ���� �ٸ��⶧���� �ϱ�X ����O ]
				Class.forName("com.mysql.cj.jdbc.Driver");
				// 2. DB ���� 
				connection = DriverManager.getConnection(
						// JDBC : JAVA DABABASE CONNECTION
						// jdbc:mysql://IP�ּ�(����[����pc]�̸�localhost):port��ȣ/DB�̸�?DB�ð�����
						// , ������ , "DB��й�ȣ"
						"jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC" , 
						"root",
						"1234");
				// 3. Ȯ��
				System.out.println("[DB ���� ����]");
			}catch( Exception e ) {
				System.out.println("[DB ���� ����] ���� : "+e);
			}
		}
	
	// 3. ������ �ۼ� �޼ҵ� 
	public boolean write(String �ۼ���, String ����) {
		try {
		String sql =  "insert into test(writer,content) values(?,?)";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, �ۼ���);
		ps.setString(2, ����);
		
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println("sql ���� ����" + e);}
		return false;
	}
	public ArrayList<������> get(){
		ArrayList<������> �����͸�� = new ArrayList<>();
		try {
		//sql �ۼ� [������ ȣ��]
			//select * (����ʵ�) from ���̺��;
		String sql = "select * from test";
		//sql ���� [DB�� ����� ��ü�� ���� �������̽� ����]
		PreparedStatement ps = connection.prepareStatement(sql);
		//sql ���� [ resultset�������̽� java.sql ��Ű��]
		ResultSet rs = ps.executeQuery();
		
		//������� �������� �ݺ���
			//���پ� ��üȭ
		while(rs.next()) { // ���� ���� ������
			������ temp = new ������(rs.getInt(1), rs.getString(2), rs.getString(3)) ;
			rs.getInt(1); // �ش� ��[���ڵ�]�� ù��° �ʵ�[����]�� ��������
			�����͸��.add(temp); // ������ ����ֱ�
		}
		
		//������ ������ ��� ��ȯ
		return �����͸��;
		}catch(Exception e) {System.out.println(e);}
		//���н�
		return null;
	}
}
