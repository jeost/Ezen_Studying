package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controller.login.Login;
import dao.RoomDao;
import dto.Room;
import dto.RoomLive;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert.AlertType;

public class Chatting implements Initializable{
	  @FXML
	    private Button btnconnect;

	    @FXML
	    private TextArea txtcontent;

	    @FXML
	    private TextField txtname;

	    @FXML
	    private TextField txtip;

	    @FXML
	    private TextField txtport;

	    @FXML
	    private TextField txtmsg;

	    @FXML
	    private Button btnsend;

	    @FXML
	    private TableView<Room> roomtable;

	    @FXML
	    private TextField txtroomname;

	    @FXML
	    private Button btnadd;

	    @FXML
	    private TextArea txtmidlist;

	    @FXML
	    private Label lblselect;
	    

	    //서버소켓 밖에서 선언
	    public Server server;
	    public static Room selectroom;
	    
	    public void show() {
	    	//모든 방 목록 가져오기
	    	ObservableList<Room> roomlist = RoomDao.roomDao.roomlist();
	    	//첫번째 필드 가져와서 방번호로 설정
	    	TableColumn tc = roomtable.getColumns().get(0);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("ronum"));
	    	//두번째 필드를 가져와서 방이름으로 설정
	    	tc = roomtable.getColumns().get(1);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("roname"));
	    	//세번째 필드를 가져와서 방인원으로 설정
	    	tc = roomtable.getColumns().get(2);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("mcount"));
	    	//테이블뷰에 리스트 넣기
	    	roomtable.setItems(roomlist);
	    	//해당 테이블뷰 클릭시 동작[람다식]
	    	roomtable.setOnMouseClicked(e->{
	    	selectroom=	roomtable.getSelectionModel().getSelectedItem();
	    	lblselect.setText("현재 선택한 방 : "+selectroom.getRoname());
	    	btnconnect.setDisable(false);
	    	});
	    }
	    @FXML
	    void add(ActionEvent event) { // 방 개설 버튼 눌렀을때
	    	//방 이름 입력된거 가져오기
	    	String roomName=txtroomname.getText();
	    	if(roomName.length()<4) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
		    	alert.setHeaderText("방 이름은 4글자 이상");
		    	alert.showAndWait();
	    		return;
	    	}
	    	//방 객체 생성
	    	Room room = new Room(0,roomName,"127.0.0.1",0);
	    	//db처리
	    	RoomDao.roomDao.roomadd(room);
	    	//해당 방 서버 start
	    	server=new Server(); // 메모리할당
	    	server.serverstart(room.getRoip(), RoomDao.roomDao.getroomnum());
	    	System.out.println(room.getRoip()); System.out.println(RoomDao.roomDao.getroomnum());
	    	txtroomname.setText(""); // 입력창 공백으로 변경
	    	show();//테이블 새로고침하기
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setHeaderText("방 개설 완료, 방 번호 : "+RoomDao.roomDao.getroomnum());
	    	alert.showAndWait();
	    	
	    }

	    public void midshow() {
	    	ArrayList<RoomLive> roomlivelist = RoomDao.roomDao.getRoomLiveList(selectroom.getRonum());
	    	txtmidlist.setText("");
	    	for(RoomLive temp : roomlivelist ) {
	    		txtmidlist.appendText(temp.getmId()+"\t");
	    	}
	    }
	    @FXML
	    void msg(ActionEvent event) {//입력창에서 입력 후 엔터 눌렀을때
	    	String msg = Login.member.getmId()+":"+txtmsg.getText()+"\n";
	    	send(msg);
	    	txtmsg.setText("");
	    	txtmsg.requestFocus();
	    	midshow();
	    }

	    Socket socket; // 소켓 선언
	    
	    //클라이언트 실행 메소드
	    public void ClientStart(String ip, int port) {
	    	//멀티스레드
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    		try {
	    			socket = new Socket(ip,port);
	    			send(Login.member.getmId()+"님이 입장했습니다");
	    			recieve(); // 접속과 동시에 받는 메소드 무한루프
	    			}catch(Exception e) {System.out.println("클라이언트 시작 오류"+e); ClientStop();}
	    		}
	    	};
	    	thread.start(); // 멀티스레드 실행
	    }
	    //클라이언트 종료 메소드
	    public void ClientStop() {try{socket.close();}catch(Exception e) {System.out.println("클라이언트 종료 실패"+e);}}
	    //서버에게 메시지 보내기 메소드
	    public void send(String msg) {
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    		try {
	    			OutputStream outputStream = socket.getOutputStream();
	    			outputStream.write(msg.getBytes());
	    			outputStream.flush(); // 스트림 내 객체 지우기(초기화)
	    			}catch(Exception e) {System.out.println("서버에 메시지 보내기 실패"+e); ClientStop();}
	    		}
	    	};
	    	thread.start();
	    }
	    //서버에게 메시지 받기 메소드
	    public void recieve() {
	    	while(true) {
	    		try {
	    			InputStream inputStream = socket.getInputStream();
	    			byte[] bytes = new byte[1000];
	    			inputStream.read(bytes);
	    			String msg = new String(bytes);
	    			txtcontent.appendText(msg);
	    		}catch(Exception e) {System.out.println("서버에게 메시지 받기 실패"+e); ClientStop(); break;}
	    	}
	    }
	    @FXML
	    void connect(ActionEvent event) {
	    	if(btnconnect.getText().equals("채팅방 입장")) {//버튼이 채팅방 입장이면
	    		
	    		ClientStart(selectroom.getRoip(),selectroom.getRonum()); //클라이언트 실행 메소드
	    		//현재 방 접속명단 추가
	    		RoomLive roomlive = new RoomLive(0, selectroom.getRonum(), Login.member.getmId());
	    		RoomDao.roomDao.addroomlive(roomlive);
	    		
	    		txtcontent.appendText("--채팅방 입장--\n");
	    		btnconnect.setText("채팅방 나가기");
	    		txtmsg.setText("");
	    		txtmsg.setDisable(false); // 채팅입력창 수정가능
		    	txtcontent.setDisable(false); // 채팅창 사용가능
		    	btnsend.setDisable(false); // 전송버튼 사용가능
		    	txtmsg.requestFocus(); // 채팅입력창으로 커서 옮기기
		    	//채팅하면서 방 개설 막기
		    	txtroomname.setDisable(true);
		    	btnadd.setDisable(true);
		    	roomtable.setDisable(true);
	    	}else {//버튼이 채팅방 나가기라면
	    		
	    		ClientStop();//클라이언트 종료 메소드
	    		
	    		txtcontent.appendText("--채팅방 퇴장--\n");
	    		btnconnect.setText("채팅방 입장");
	    		txtmsg.setDisable(true); // 채팅입력창 수정금지
		    	txtcontent.setDisable(true); // 채팅창 사용금지
		    	btnsend.setDisable(true); // 전송버튼 사용금지
		    	txtroomname.setDisable(false);
		    	btnadd.setDisable(false); // 방 개설 사용 가능하게
		    	roomtable.setDisable(false);
		    	//방 접속 명단에서 삭제
		    	RoomDao.roomDao.roomLiveDelete(Login.member.getmId());
		    	//접속 명단이 0명이면 방 삭제
		    		//방이 삭제되면 서버소켓 종료
		    	boolean result = RoomDao.roomDao.roomdelete(selectroom.getRonum());
		    	if(result) {server.serverstop();}
		    	//테이블뷰에서 선택된 방 초기화
		    	selectroom=null;
		    	//선택한 방 레이블 초기화
		    	lblselect.setText("현재 선택된 방 : ");
		    	show(); // 방 목록 테이블 새로고침
	    	}
	    }
	    @FXML
	    void send(ActionEvent event) {
	    	String msg = Login.member.getmId()+":"+txtmsg.getText()+"\n";
	    	send(msg);
	    	txtmsg.setText(""); // 보내기 후 메시지 입력창 지우기
	    	txtmsg.requestFocus(); // 보내기 후 메시지입력창으로 포커스(커서) 이동
	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    //채팅 열렸을때 초기값
	    	txtmsg.setText("채팅창 입장 후 사용가능");
	    	txtmsg.setDisable(true); // 채팅입력창 수정금지
	    	txtcontent.setDisable(true); // 채팅창 사용금지
	    	btnsend.setDisable(true); // 전송버튼 사용금지
	    	btnconnect.setDisable(true); //입장버튼 사용금지
	    	txtmidlist.setDisable(true);
	    	show();
	    }
	    
}
