package application.Day26;

import java.net.InetAddress;

public class Day26_1 {

	//��Ʈ��ũ : �� �� �̻��� ��ǻ�͵��� �����ϰ� ����� �� �ִ� ��
		//��Ÿ� : ���ڽ�ȣ�� ���� ����ϴ� ��� ��Ⱑ ���� ����ϱ� ���� �ϳ��� ��
		//�������� : ��ǻ�� ���� �Ǵ� ��ǻ�� ���̿� �����͸� ����ϱ� ���� ��Ģ[ü��]
			//SMTP : ���� ���� ��������
			//IP : ���ͳ� ��������
	//TCP/IP
		//TCP : 
	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			System.out.println(inetAddress);
			System.out.println(inetAddress.getHostName());
			System.out.println(inetAddress.getHostAddress());
			
			//���̹� ȸ�� ip�ּ� Ȯ��
			InetAddress naver = InetAddress.getByName("www.naver.com");
			System.out.println("���̹� ���� : " + naver);
			System.out.println("���̹� pc �̸� : " + naver.getHostName());
			System.out.println("���̹� ip�ּ� : " + naver.getHostAddress());
			
			InetAddress facebook = InetAddress.getByName("www.facebook.com");
			System.out.println("���̽��� : " + facebook);
			System.out.println("���̽��� pc �̸� : " + facebook.getHostName());
			System.out.println("���̽��� ip�ּ� : " + facebook.getHostAddress());
		}catch(Exception e) { System.out.println(e);}
	}
}
