package dto;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import controller.Server;

public class Client {
	//서버에 들어오는 클라이언트
	
	public Socket socket;
	//생성자
	public Client(Socket socket) {
		this.socket=socket;
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
					for(Client client : Server.clientlist) {
						client.send(msg);
						}
					}
				}catch(Exception e) {System.out.println(e);}
			}
		}; // 멀티스레드 끝
		//멀티스레드를 스레드풀에 넣기
		Server.threadPool.submit(runnable);
	}
	//서버가 메시지 보내기
	public void send(String msg) { //멀티스레드
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream();
					outputStream.write(msg.getBytes());
				}catch(Exception e) {}
			}
		}; // 멀티스레드 끝
		Server.threadPool.submit(runnable);
	}
}
