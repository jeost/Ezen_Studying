package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server{ // fxml ���� �ڹٷ� ���� ��Ʈ��
	public class Client { // ��ø Ŭ����
		//������ ������ Ŭ���̾�Ʈ
		
		public Socket socket;
		//������
		public Client(Socket socket) {
			this.socket=socket;
			recieve();
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
						for(Client client : clientlist) {
							client.send(msg);
							}
						}
					}catch(Exception e) {System.out.println("������ �޽��� �ޱ� ����"+e);}
				}
			}; // ��Ƽ������ ��
			//��Ƽ�����带 ������Ǯ�� �ֱ�
			threadPool.submit(runnable);
		}
		//������ �޽��� ������
		public void send(String msg) { //��Ƽ������
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					try {
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(msg.getBytes());
					}catch(Exception e) {System.out.println("������ �޽��� ������ ����"+e);}
				}
			}; // ��Ƽ������ ��
			threadPool.submit(runnable);
		}
	}

    //������ ����� Ŭ���̾�Ʈ ���� �޼ҵ�
    public Vector<Client> clientlist = new Vector<>();
    			//Vector���� ���� : ����ȭ ����(���� �����尡 �����Ұ�� ������ ����)
    //��Ƽ������ ���� ������Ǯ
    public ExecutorService threadPool;
    //�������� ����
    ServerSocket serverSocket;
    //�������� �޼ҵ�
    public void serverstart(String ip, int port) {
    	try {
        	//�������� �޸��Ҵ�
    	serverSocket=new ServerSocket();
    		//�������� ���ε�(ip�� port ����)
    	serverSocket.bind(new InetSocketAddress(ip,port));
    	}catch(Exception e) {System.out.println("�������� ���ε� ����"+e);}
    		//Ŭ���̾�Ʈ ��û ���[��Ƽ������]
    	Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
				while(true) {
					Socket socket = serverSocket.accept();
					clientlist.add(new Client(socket));
					}
				}catch(Exception e) {System.out.println("Ŭ���̾�Ʈ ���� ����"+e);}
			}
		}; // ��Ƽ������ ����
		//������Ǯ �޸� �ʱ�ȭ(�Ҵ�)
		threadPool=Executors.newCachedThreadPool();
		//���� ��Ƽ�����带 ������Ǯ�� �ֱ�
		threadPool.submit(runnable);
    }
    //�������� �޼ҵ�
    public void serverstop() {
    	try {
    	for(Client client: clientlist) {
    		client.socket.close();
    	}
    	serverSocket.close();
    	threadPool.shutdown();
    	}catch(Exception e) {System.out.println("���� ���� ���� "+e);}
    }
    
}


