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
		}catch(Exception e) {System.out.println("DB연동오류"+e);}
	}
	//방 저장
	public boolean roomadd(Room room) {
		try {
		String sql="insert into room(roname,roip)values(?,?)";
		ps=con.prepareStatement(sql);
		ps.setString(1, room.getRoname());
		ps.setString(2, room.getRoip());
		ps.executeUpdate(); return true;
		}catch(Exception e) {System.out.println("sql 오류"+e);}
				return false;
	}
	//방번호 호출 메소드
	public int getroomnum() { //가장 최근에 등록된 방 번호 호출
		try {
			String sql = "select max(ronum) from room";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
		}catch(Exception e) {System.out.println("방번호 호출 오류"+e);}
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
		}catch(Exception e) {System.out.println("모든방 호출 오류"+e);}
		return null;
	}
	//방 접속 명단 추가
	public boolean addroomlive(RoomLive roomlive) {
		try {
		String sql = "insert into roomlive(ronum,mId)values(?,?)";
		ps=con.prepareStatement(sql);
		ps.setInt(1, roomlive.getRonum());
		ps.setString(2, roomlive.getmId());
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println("방 접속 명단 추가 오류"+e);}
		return false;
	}
	//채팅방에 접속된 모든 명단 호출
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
		}catch(Exception e) {System.out.println("명단호출 오류"+e);}
		return null;
	}
	//채팅방 접속 명단 삭제
	public boolean roomLiveDelete(String mId) {
		String sql = "delete from roomlive where mid=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, mId);
			ps.executeUpdate();
			return true;
		}catch(Exception e) {System.out.println("명단삭제 오류"+e);}
		return false;
	}
	//접속인원이 0이면 채팅방 삭제
	public boolean roomdelete(int ronum) {
		String sql = "select * from roomlive where ronum=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, ronum);
			rs=ps.executeQuery();
		if(rs.next()) {//만약 해당 방번호로 roomlive에서 검색시 검색결과가 존재하면 방 삭제 x
			return false;
			}else {
				String sql2 = "delete from room where ronum=?";
				ps = con.prepareStatement(sql2);
				ps.setInt(1, ronum);
				ps.executeUpdate();
				return true;
			}
		}catch(Exception e) {System.out.println("채팅방 삭제 실패"+e);}
		return false;
		//검색결과가 없으면 삭제
	}
}