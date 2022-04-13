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
		//������������ ����
		while(true) {
			socket.connect(new InetSocketAddress("127.0.0.1",5000));
			System.out.println("������ ���� ����");
			
			Scanner scanner = new Scanner(System.in);
				//�������� ������ ������ : Stream �̿�
			System.out.println("������ ���� �޼��� : "); String msg = scanner.nextLine();
				//���� ��� ��Ʈ�� ��������
			OutputStream outputStream = socket.getOutputStream();
				//��������
			outputStream.write(msg.getBytes());
			
			//�����κ��� ������ �ޱ�
				//������ �Է� ��Ʈ��
			InputStream inputstream = socket.getInputStream();
			byte[] bytes = new byte[1000];
			inputstream.read(bytes);
			System.out.println("������ ���� �޼��� : "+new String(bytes));
			}
		}catch(Exception e) {System.out.println(e);}
	}
}
