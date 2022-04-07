package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import controller.login.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Chatting implements Initializable{
	  @FXML
	    private Button btnconnect;

	    @FXML
	    private TextArea txtcontent;

	    @FXML
	    private TextField txtname;

	    @FXML
	    private TextField txtip;

	    @FXML
	    private TextField txtport;

	    @FXML
	    private TextField txtmsg;

	    @FXML
	    private Button btnsend;

	    Socket socket; // ���� ����
	    
	    //Ŭ���̾�Ʈ ���� �޼ҵ�
	    public void ClientStart() {
	    	//��Ƽ������
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    		try {
	    			socket = new Socket("127.0.0.1",1234);
	    			send(Login.member.getmId()+"���� �����߽��ϴ�");
	    			recieve(); // ���Ӱ� ���ÿ� �޴� �޼ҵ� ���ѷ���
	    			}catch(Exception e) {}
	    		}
	    	};
	    	thread.start(); // ��Ƽ������ ����
	    }
	    //Ŭ���̾�Ʈ ���� �޼ҵ�
	    public void ClientStop() {try{socket.close();}catch(Exception e) {}}
	    //�������� �޽��� ������ �޼ҵ�
	    public void send(String msg) {
	    	Thread thread = new Thread() {
	    		public void run() {
	    		try {
	    			OutputStream outputStream = socket.getOutputStream();
	    			outputStream.write(msg.getBytes());
	    			outputStream.flush(); // ��Ʈ�� �� ��ü �����(�ʱ�ȭ)
	    			}catch(Exception e) {}
	    		}
	    	};
	    }
	    //�������� �޽��� �ޱ� �޼ҵ�
	    public void recieve() {
	    	while(true) {
	    		try {
	    			InputStream inputStream = socket.getInputStream();
	    			byte[] bytes = new byte[1000];
	    			inputStream.read(bytes);
	    			String msg = new String(bytes);
	    			txtcontent.appendText(msg);
	    		}catch(Exception e) {}
	    	}
	    }
	    @FXML
	    void connect(ActionEvent event) {
	    	if(btnconnect.getText().equals("ä�ù� ����")) {//��ư�� ä�ù� �����̸�
	    		
	    		//Ŭ���̾�Ʈ ���� �޼ҵ�
	    		
	    		txtcontent.appendText("--ä�ù� ����--\n");
	    		btnconnect.setText("ä�ù� ������");
	    		txtmsg.setEditable(true); // ä���Է�â ��������
		    	txtcontent.setDisable(false); // ä��â ��밡��
		    	btnsend.setDisable(false); // ���۹�ư ��밡��
		    	txtmsg.requestFocus(); // ä���Է�â���� Ŀ�� �ű��
	    	}else {//��ư�� ä�ù� ������ �ƴϸ�
	    		
	    		ClientStop();//Ŭ���̾�Ʈ ���� �޼ҵ�
	    		
	    		txtcontent.appendText("--ä�ù� ����--\n");
	    		btnconnect.setText("ä�ù� ����");
	    		txtmsg.setEditable(false); // ä���Է�â ��������
		    	txtcontent.setDisable(true); // ä��â ������
		    	btnsend.setDisable(true); // ���۹�ư ������
	    	}
	    }
	    @FXML
	    void send(ActionEvent event) {
	    	String msg = txtmsg.getText()+"\n";
	    	send(msg);
	    	txtmsg.setText(""); // ������ �� �޽��� �Է�â �����
	    	txtmsg.requestFocus(); // ������ �� �޽����Է�â���� ��Ŀ��(Ŀ��) �̵�
	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    //ä�� �������� �ʱⰪ
	    	txtmsg.setText("ä��â ���� �� ��밡��");
	    	txtmsg.setEditable(false); // ä���Է�â ��������
	    	txtcontent.setDisable(true); // ä��â ������
	    	btnsend.setDisable(true); // ���۹�ư ������
	    }
}
