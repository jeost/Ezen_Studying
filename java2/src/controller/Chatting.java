package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import controller.login.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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

	    Socket socket; // 소켓 선언
	    
	    //클라이언트 실행 메소드
	    public void ClientStart() {
	    	//멀티스레드
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    		try {
	    			socket = new Socket("127.0.0.1",1234);
	    			send(Login.member.getmId()+"님이 입장했습니다");
	    			recieve(); // 접속과 동시에 받는 메소드 무한루프
	    			}catch(Exception e) {}
	    		}
	    	};
	    	thread.start(); // 멀티스레드 실행
	    }
	    //클라이언트 종료 메소드
	    public void ClientStop() {try{socket.close();}catch(Exception e) {}}
	    //서버에게 메시지 보내기 메소드
	    public void send(String msg) {
	    	Thread thread = new Thread() {
	    		public void run() {
	    		try {
	    			OutputStream outputStream = socket.getOutputStream();
	    			outputStream.write(msg.getBytes());
	    			outputStream.flush(); // 스트림 내 객체 지우기(초기화)
	    			}catch(Exception e) {}
	    		}
	    	};
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
	    		}catch(Exception e) {}
	    	}
	    }
	    @FXML
	    void connect(ActionEvent event) {
	    	if(btnconnect.getText().equals("채팅방 입장")) {//버튼이 채팅방 입장이면
	    		
	    		//클라이언트 실행 메소드
	    		
	    		txtcontent.appendText("--채팅방 입장--\n");
	    		btnconnect.setText("채팅방 나가기");
	    		txtmsg.setEditable(true); // 채팅입력창 수정가능
		    	txtcontent.setDisable(false); // 채팅창 사용가능
		    	btnsend.setDisable(false); // 전송버튼 사용가능
		    	txtmsg.requestFocus(); // 채팅입력창으로 커서 옮기기
	    	}else {//버튼이 채팅방 입장이 아니면
	    		
	    		ClientStop();//클라이언트 종료 메소드
	    		
	    		txtcontent.appendText("--채팅방 퇴장--\n");
	    		btnconnect.setText("채팅방 입장");
	    		txtmsg.setEditable(false); // 채팅입력창 수정금지
		    	txtcontent.setDisable(true); // 채팅창 사용금지
		    	btnsend.setDisable(true); // 전송버튼 사용금지
	    	}
	    }
	    @FXML
	    void send(ActionEvent event) {
	    	String msg = txtmsg.getText()+"\n";
	    	send(msg);
	    	txtmsg.setText(""); // 보내기 후 메시지 입력창 지우기
	    	txtmsg.requestFocus(); // 보내기 후 메시지입력창으로 포커스(커서) 이동
	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    //채팅 열렸을때 초기값
	    	txtmsg.setText("채팅창 입장 후 사용가능");
	    	txtmsg.setEditable(false); // 채팅입력창 수정금지
	    	txtcontent.setDisable(true); // 채팅창 사용금지
	    	btnsend.setDisable(true); // 전송버튼 사용금지
	    }
}
