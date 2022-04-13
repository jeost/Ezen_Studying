package application.Day26;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Day26_server {
	//통신용 서버 만들기
		//서버소켓 만들기
			//서버
			//소켓 : pc간의 통신 종착점
		//서버소켓 바인딩
			//서버에 ip주소와 port번호 설정
				//ip : pc 식별 번호
				//port : pc내 프로세스(프로그램) 식별하는 번호
					//ip당 6만개정도 port 사용 가능
	public static void main(String[] args) {
		try { 
		ServerSocket serverSocket = new ServerSocket(); // 서버소켓 만들기
		//서버소켓 바인딩
		serverSocket.bind(new InetSocketAddress("127.0.0.1",5000));
		//클라이언트의 요청 대기
		while(true) {
			System.out.println("서버가 연결 대기중");
				//요청이 있으면 수락
			Socket socket = serverSocket.accept();
				//수락된 소켓의 정보 확인
			InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("연결된 클라이언트 정보 : " +socketAddress.getHostName());
			
				//클라이언트에게 데이터 받기
			InputStream inputStream = socket.getInputStream();
			byte[] bytes = new byte[1000];
			inputStream.read(bytes);
			System.out.println("클라이언트로 부터의 메세지 : "+new String(bytes));
			//클라이언트에게 데이터 송신
			Scanner scanner = new Scanner(System.in);
			System.out.print("클라이언트에게 보낼 메세지 : ");
			String msg = scanner.nextLine();
			
			OutputStream outputStream = socket.getOutputStream();
			
			outputStream.write(msg.getBytes());
			}
		
		}catch(Exception e) {System.out.println(e);}
	}
}
