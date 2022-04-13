package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Product;
import dto.Room;
import dto.RoomLive;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RoomDao {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static RoomDao roomDao = new RoomDao();
	public RoomDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC", "root", "1234");
		}catch(Exception e) {System.out.println("DB��������"+e);}
	}
	//�� ����
	public boolean roomadd(Room room) {
		try {
		String sql="insert into room(roname,roip)values(?,?)";
		ps=con.prepareStatement(sql);
		ps.setString(1, room.getRoname());
		ps.setString(2, room.getRoip());
		ps.executeUpdate(); return true;
		}catch(Exception e) {System.out.println("sql ����"+e);}
				return false;
	}
	//���ȣ ȣ�� �޼ҵ�
	public int getroomnum() { //���� �ֱٿ� ��ϵ� �� ��ȣ ȣ��
		try {
			String sql = "select max(ronum) from room";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
		}catch(Exception e) {System.out.println("���ȣ ȣ�� ����"+e);}
		return 0;
	}
	public ObservableList<Room> roomlist(){
		try {
		ObservableList<Room> roomlist = FXCollections.observableArrayList();
		String sql = "select*from room order by ronum desc";
		ps=con.prepareStatement(sql);
		rs = ps.executeQuery();
		while(rs.next()) {
			Room room = new Room(rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					0);
			roomlist.add(room);
			}return roomlist;
		}catch(Exception e) {System.out.println("���� ȣ�� ����"+e);}
		return null;
	}
	//�� ���� ��� �߰�
	public boolean addroomlive(RoomLive roomlive) {
		try {
		String sql = "insert into roomlive(ronum,mId)values(?,?)";
		ps=con.prepareStatement(sql);
		ps.setInt(1, roomlive.getRonum());
		ps.setString(2, roomlive.getmId());
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println("�� ���� ��� �߰� ����"+e);}
		return false;
	}
	//ä�ù濡 ���ӵ� ��� ��� ȣ��
	public ArrayList<RoomLive> getRoomLiveList(int ronum){
		ArrayList<RoomLive> roomlivelist = new ArrayList<>();
		try {
			String sql = "select*from roomlive where ronum=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, ronum);
			rs=ps.executeQuery();
			while(rs.next()) {
				RoomLive roomlive = new RoomLive(
						rs.getInt(1),
						rs.getInt(2),
						rs.getString(3));
				roomlivelist.add(roomlive);
			}return roomlivelist;
		}catch(Exception e) {System.out.println("���ȣ�� ����"+e);}
		return null;
	}
	//ä�ù� ���� ��� ����
	public boolean roomLiveDelete(String mId) {
		String sql = "delete from roomlive where mid=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, mId);
			ps.executeUpdate();
			return true;
		}catch(Exception e) {System.out.println("��ܻ��� ����"+e);}
		return false;
	}
	//�����ο��� 0�̸� ä�ù� ����
	public boolean roomdelete(int ronum) {
		String sql = "select * from roomlive where ronum=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, ronum);
			rs=ps.executeQuery();
		if(rs.next()) {//���� �ش� ���ȣ�� roomlive���� �˻��� �˻������ �����ϸ� �� ���� x
			return false;
			}else {
				String sql2 = "delete from room where ronum=?";
				ps = con.prepareStatement(sql2);
				ps.setInt(1, ronum);
				ps.executeUpdate();
				return true;
			}
		}catch(Exception e) {System.out.println("ä�ù� ���� ����"+e);}
		return false;
		//�˻������ ������ ����
	}
}