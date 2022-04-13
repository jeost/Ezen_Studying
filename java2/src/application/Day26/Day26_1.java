package application.Day26;

import java.net.InetAddress;

public class Day26_1 {

	//네트워크 : 두 대 이상의 컴퓨터들을 연결하고 통신할 수 있는 것
		//통신망 : 전자신호를 통해 통신하는 모든 기기가 서로 통신하기 위한 하나의 망
		//프로토콜 : 컴퓨터 내부 또는 컴퓨터 사이에 데이터를 통신하기 위한 규칙[체계]
			//SMTP : 메일 전송 프로토콜
			//IP : 인터넷 프로토콜
	//TCP/IP
		//TCP : 
	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			System.out.println(inetAddress);
			System.out.println(inetAddress.getHostName());
			System.out.println(inetAddress.getHostAddress());
			
			//네이버 회사 ip주소 확인
			InetAddress naver = InetAddress.getByName("www.naver.com");
			System.out.println("네이버 정보 : " + naver);
			System.out.println("네이버 pc 이름 : " + naver.getHostName());
			System.out.println("네이버 ip주소 : " + naver.getHostAddress());
			
			InetAddress facebook = InetAddress.getByName("www.facebook.com");
			System.out.println("페이스북 : " + facebook);
			System.out.println("페이스북 pc 이름 : " + facebook.getHostName());
			System.out.println("페이스북 ip주소 : " + facebook.getHostAddress());
		}catch(Exception e) { System.out.println(e);}
	}
}
