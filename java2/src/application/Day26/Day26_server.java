package application.Day26;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Day26_server {
	//��ſ� ���� �����
		//�������� �����
			//����
			//���� : pc���� ��� ������
		//�������� ���ε�
			//������ ip�ּҿ� port��ȣ ����
				//ip : pc �ĺ� ��ȣ
				//port : pc�� ���μ���(���α׷�) �ĺ��ϴ� ��ȣ
					//ip�� 6�������� port ��� ����
	public static void main(String[] args) {
		try { 
		ServerSocket serverSocket = new ServerSocket(); // �������� �����
		//�������� ���ε�
		serverSocket.bind(new InetSocketAddress("127.0.0.1",5000));
		//Ŭ���̾�Ʈ�� ��û ���
		while(true) {
			System.out.println("������ ���� �����");
				//��û�� ������ ����
			Socket socket = serverSocket.accept();
				//������ ������ ���� Ȯ��
			InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("����� Ŭ���̾�Ʈ ���� : " +socketAddress.getHostName());
			
				//Ŭ���̾�Ʈ���� ������ �ޱ�
			InputStream inputStream = socket.getInputStream();
			byte[] bytes = new byte[1000];
			inputStream.read(bytes);
			System.out.println("Ŭ���̾�Ʈ�� ������ �޼��� : "+new String(bytes));
			//Ŭ���̾�Ʈ���� ������ �۽�
			Scanner scanner = new Scanner(System.in);
			System.out.print("Ŭ���̾�Ʈ���� ���� �޼��� : ");
			String msg = scanner.nextLine();
			
			OutputStream outputStream = socket.getOutputStream();
			
			outputStream.write(msg.getBytes());
			}
		
		}catch(Exception e) {System.out.println(e);}
	}
}
