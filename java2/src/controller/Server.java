package controller;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import dto.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Server implements Initializable{

    @FXML
    private Button btnserver;

    @FXML
    private TextArea txtserver;
    //서버에 연결된 클라이언트 저장 메소드
    public static Vector<Client> clientlist = new Vector<>();
    			//Vector쓰는 이유 : 동기화 지원(여러 스레드가 접근할경우 대기상태 지원)
    //멀티스레드 관리 스레드풀
    public static ExecutorService threadPool;
    //서버소켓 선언
    ServerSocket serverSocket;
    //서버실행 메소드
    public void serverstart() {
    	try {
        	//서버소켓 메모리할당
    	serverSocket=new ServerSocket();
    		//서버소켓 바인딩(ip랑 port 설정)
    	serverSocket.bind(new InetSocketAddress("127.0.0.1",1234));
    	}catch(Exception e) {System.out.println(e);}
    		//클라이언트 요청 대기[멀티스레드]
    	Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
				while(true) {
					Socket socket = serverSocket.accept();
					clientlist.add(new Client(socket));
					}
				}catch(Exception e) {System.out.println(e);}
			}
		}; // 멀티스레드 종료
		//스레드풀 메모리 초기화(할당)
		threadPool=Executors.newCachedThreadPool();
		//위의 멀티스레드를 스레드풀에 넣기
		threadPool.submit(runnable);
    }
    //서버종료 메소드
    public void serverstop() {
    	try {
    	for(Client client: clientlist) {
    		client.socket.close();
    	}
    	serverSocket.close();
    	threadPool.shutdown();
    	}catch(Exception e) {System.out.println(e);}
    }
    
    
    @FXML
    void server(ActionEvent event) {
    	if(btnserver.getText().equals("서버 실행")) { //버튼의 텍스트가 서버 실행 이면
    		serverstart(); // 서버 실행 메소드 실행
    		//텍스트목록에 내용 추가
    		txtserver.appendText("서버를 실행합니다\n");
    		//버튼의 텍스트 변경
    		btnserver.setText("서버 중지");
    	}else { // 버튼의 텍스트가 서버 실행이 아니면
    		txtserver.appendText("서버를 중지합니다\n");
    		serverstop();
    		btnserver.setText("서버 실행");
    	}
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	txtserver.setDisable(true);
    }
}


