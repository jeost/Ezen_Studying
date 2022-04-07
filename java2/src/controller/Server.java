package controller;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import dto.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Server implements Initializable{

    @FXML
    private Button btnserver;

    @FXML
    private TextArea txtserver;
    //������ ����� Ŭ���̾�Ʈ ���� �޼ҵ�
    public static Vector<Client> clientlist = new Vector<>();
    			//Vector���� ���� : ����ȭ ����(���� �����尡 �����Ұ�� ������ ����)
    //��Ƽ������ ���� ������Ǯ
    public static ExecutorService threadPool;
    //�������� ����
    ServerSocket serverSocket;
    //�������� �޼ҵ�
    public void serverstart() {
    	try {
        	//�������� �޸��Ҵ�
    	serverSocket=new ServerSocket();
    		//�������� ���ε�(ip�� port ����)
    	serverSocket.bind(new InetSocketAddress("127.0.0.1",1234));
    	}catch(Exception e) {System.out.println(e);}
    		//Ŭ���̾�Ʈ ��û ���[��Ƽ������]
    	Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
				while(true) {
					Socket socket = serverSocket.accept();
					clientlist.add(new Client(socket));
					}
				}catch(Exception e) {System.out.println(e);}
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
    	}catch(Exception e) {System.out.println(e);}
    }
    
    
    @FXML
    void server(ActionEvent event) {
    	if(btnserver.getText().equals("���� ����")) { //��ư�� �ؽ�Ʈ�� ���� ���� �̸�
    		serverstart(); // ���� ���� �޼ҵ� ����
    		//�ؽ�Ʈ��Ͽ� ���� �߰�
    		txtserver.appendText("������ �����մϴ�\n");
    		//��ư�� �ؽ�Ʈ ����
    		btnserver.setText("���� ����");
    	}else { // ��ư�� �ؽ�Ʈ�� ���� ������ �ƴϸ�
    		txtserver.appendText("������ �����մϴ�\n");
    		serverstop();
    		btnserver.setText("���� ����");
    	}
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	txtserver.setDisable(true);
    }
}


