package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server{ // fxml 없이 자바로 서버 컨트롤
	public class Client { // 중첩 클래스
		//서버에 들어오는 클라이언트
		
		public Socket socket;
		//생성자
		public Client(Socket socket) {
			this.socket=socket;
			recieve();
		}
		//서버로 메시지 받기
		public void recieve() { //멀티스레드
			
			Runnable runnable = new Runnable() { // 익명구현객체
				
				@Override
				public void run() {//추상메소드 구현
					//계속 메시지 받는 상태
					try {
					while(true) {
						InputStream inputStream = socket.getInputStream();
						byte[] bytes = new byte[1000];
						inputStream.read(bytes); // 입력스트림으로 바이트 읽어오기
						String msg = new String(bytes);
						//서버가 받은 메시지를 접속된 모든 클라이언트로 보내기
						for(Client client : clientlist) {
							client.send(msg);
							}
						}
					}catch(Exception e) {System.out.println("서버가 메시지 받기 실패"+e);}
				}
			}; // 멀티스레드 끝
			//멀티스레드를 스레드풀에 넣기
			threadPool.submit(runnable);
		}
		//서버가 메시지 보내기
		public void send(String msg) { //멀티스레드
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					try {
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(msg.getBytes());
					}catch(Exception e) {System.out.println("서버가 메시지 보내기 실패"+e);}
				}
			}; // 멀티스레드 끝
			threadPool.submit(runnable);
		}
	}

    //서버에 연결된 클라이언트 저장 메소드
    public Vector<Client> clientlist = new Vector<>();
    			//Vector쓰는 이유 : 동기화 지원(여러 스레드가 접근할경우 대기상태 지원)
    //멀티스레드 관리 스레드풀
    public ExecutorService threadPool;
    //서버소켓 선언
    ServerSocket serverSocket;
    //서버실행 메소드
    public void serverstart(String ip, int port) {
    	try {
        	//서버소켓 메모리할당
    	serverSocket=new ServerSocket();
    		//서버소켓 바인딩(ip랑 port 설정)
    	serverSocket.bind(new InetSocketAddress(ip,port));
    	}catch(Exception e) {System.out.println("서버소켓 바인딩 실패"+e);}
    		//클라이언트 요청 대기[멀티스레드]
    	Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
				while(true) {
					Socket socket = serverSocket.accept();
					clientlist.add(new Client(socket));
					}
				}catch(Exception e) {System.out.println("클라이언트 연결 실패"+e);}
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
    	}catch(Exception e) {System.out.println("서버 종료 실패 "+e);}
    }
    
}


