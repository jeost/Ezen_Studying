package dto;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import controller.Server;

public class Client {
	//������ ������ Ŭ���̾�Ʈ
	
	public Socket socket;
	//������
	public Client(Socket socket) {
		this.socket=socket;
	}
	//������ �޽��� �ޱ�
	public void recieve() { //��Ƽ������
		
		Runnable runnable = new Runnable() { // �͸�����ü
			
			@Override
			public void run() {//�߻�޼ҵ� ����
				//��� �޽��� �޴� ����
				try {
				while(true) {
					InputStream inputStream = socket.getInputStream();
					byte[] bytes = new byte[1000];
					inputStream.read(bytes); // �Է½�Ʈ������ ����Ʈ �о����
					String msg = new String(bytes);
					//������ ���� �޽����� ���ӵ� ��� Ŭ���̾�Ʈ�� ������
					for(Client client : Server.clientlist) {
						client.send(msg);
						}
					}
				}catch(Exception e) {System.out.println(e);}
			}
		}; // ��Ƽ������ ��
		//��Ƽ�����带 ������Ǯ�� �ֱ�
		Server.threadPool.submit(runnable);
	}
	//������ �޽��� ������
	public void send(String msg) { //��Ƽ������
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream();
					outputStream.write(msg.getBytes());
				}catch(Exception e) {}
			}
		}; // ��Ƽ������ ��
		Server.threadPool.submit(runnable);
	}
}
