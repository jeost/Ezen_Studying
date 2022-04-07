package application.Day26;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Day26_Client {
	public static void main(String[] args) {
	
		Socket socket = new Socket();
		try {
		//서버소켓으로 연결
		while(true) {
			socket.connect(new InetSocketAddress("127.0.0.1",5000));
			System.out.println("서버와 연결 성공");
			
			Scanner scanner = new Scanner(System.in);
				//서버에게 데이터 보내기 : Stream 이용
			System.out.println("서버에 보낼 메세지 : "); String msg = scanner.nextLine();
				//소켓 출력 스트림 가져오기
			OutputStream outputStream = socket.getOutputStream();
				//내보내기
			outputStream.write(msg.getBytes());
			
			//서버로부터 데이터 받기
				//소켓의 입력 스트림
			InputStream inputstream = socket.getInputStream();
			byte[] bytes = new byte[1000];
			inputstream.read(bytes);
			System.out.println("서버가 보낸 메세지 : "+new String(bytes));
			}
		}catch(Exception e) {System.out.println(e);}
	}
}
