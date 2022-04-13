package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controller.login.Login;
import dao.RoomDao;
import dto.Room;
import dto.RoomLive;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert.AlertType;

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

	    @FXML
	    private TableView<Room> roomtable;

	    @FXML
	    private TextField txtroomname;

	    @FXML
	    private Button btnadd;

	    @FXML
	    private TextArea txtmidlist;

	    @FXML
	    private Label lblselect;
	    

	    //�������� �ۿ��� ����
	    public Server server;
	    public static Room selectroom;
	    
	    public void show() {
	    	//��� �� ��� ��������
	    	ObservableList<Room> roomlist = RoomDao.roomDao.roomlist();
	    	//ù��° �ʵ� �����ͼ� ���ȣ�� ����
	    	TableColumn tc = roomtable.getColumns().get(0);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("ronum"));
	    	//�ι�° �ʵ带 �����ͼ� ���̸����� ����
	    	tc = roomtable.getColumns().get(1);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("roname"));
	    	//����° �ʵ带 �����ͼ� ���ο����� ����
	    	tc = roomtable.getColumns().get(2);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("mcount"));
	    	//���̺�信 ����Ʈ �ֱ�
	    	roomtable.setItems(roomlist);
	    	//�ش� ���̺�� Ŭ���� ����[���ٽ�]
	    	roomtable.setOnMouseClicked(e->{
	    	selectroom=	roomtable.getSelectionModel().getSelectedItem();
	    	lblselect.setText("���� ������ �� : "+selectroom.getRoname());
	    	btnconnect.setDisable(false);
	    	});
	    }
	    @FXML
	    void add(ActionEvent event) { // �� ���� ��ư ��������
	    	//�� �̸� �ԷµȰ� ��������
	    	String roomName=txtroomname.getText();
	    	if(roomName.length()<4) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
		    	alert.setHeaderText("�� �̸��� 4���� �̻�");
		    	alert.showAndWait();
	    		return;
	    	}
	    	//�� ��ü ����
	    	Room room = new Room(0,roomName,"127.0.0.1",0);
	    	//dbó��
	    	RoomDao.roomDao.roomadd(room);
	    	//�ش� �� ���� start
	    	server=new Server(); // �޸��Ҵ�
	    	server.serverstart(room.getRoip(), RoomDao.roomDao.getroomnum());
	    	System.out.println(room.getRoip()); System.out.println(RoomDao.roomDao.getroomnum());
	    	txtroomname.setText(""); // �Է�â �������� ����
	    	show();//���̺� ���ΰ�ħ�ϱ�
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setHeaderText("�� ���� �Ϸ�, �� ��ȣ : "+RoomDao.roomDao.getroomnum());
	    	alert.showAndWait();
	    	
	    }

	    public void midshow() {
	    	ArrayList<RoomLive> roomlivelist = RoomDao.roomDao.getRoomLiveList(selectroom.getRonum());
	    	txtmidlist.setText("");
	    	for(RoomLive temp : roomlivelist ) {
	    		txtmidlist.appendText(temp.getmId()+"\t");
	    	}
	    }
	    @FXML
	    void msg(ActionEvent event) {//�Է�â���� �Է� �� ���� ��������
	    	String msg = Login.member.getmId()+":"+txtmsg.getText()+"\n";
	    	send(msg);
	    	txtmsg.setText("");
	    	txtmsg.requestFocus();
	    	midshow();
	    }

	    Socket socket; // ���� ����
	    
	    //Ŭ���̾�Ʈ ���� �޼ҵ�
	    public void ClientStart(String ip, int port) {
	    	//��Ƽ������
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    		try {
	    			socket = new Socket(ip,port);
	    			send(Login.member.getmId()+"���� �����߽��ϴ�");
	    			recieve(); // ���Ӱ� ���ÿ� �޴� �޼ҵ� ���ѷ���
	    			}catch(Exception e) {System.out.println("Ŭ���̾�Ʈ ���� ����"+e); ClientStop();}
	    		}
	    	};
	    	thread.start(); // ��Ƽ������ ����
	    }
	    //Ŭ���̾�Ʈ ���� �޼ҵ�
	    public void ClientStop() {try{socket.close();}catch(Exception e) {System.out.println("Ŭ���̾�Ʈ ���� ����"+e);}}
	    //�������� �޽��� ������ �޼ҵ�
	    public void send(String msg) {
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    		try {
	    			OutputStream outputStream = socket.getOutputStream();
	    			outputStream.write(msg.getBytes());
	    			outputStream.flush(); // ��Ʈ�� �� ��ü �����(�ʱ�ȭ)
	    			}catch(Exception e) {System.out.println("������ �޽��� ������ ����"+e); ClientStop();}
	    		}
	    	};
	    	thread.start();
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
	    		}catch(Exception e) {System.out.println("�������� �޽��� �ޱ� ����"+e); ClientStop(); break;}
	    	}
	    }
	    @FXML
	    void connect(ActionEvent event) {
	    	if(btnconnect.getText().equals("ä�ù� ����")) {//��ư�� ä�ù� �����̸�
	    		
	    		ClientStart(selectroom.getRoip(),selectroom.getRonum()); //Ŭ���̾�Ʈ ���� �޼ҵ�
	    		//���� �� ���Ӹ�� �߰�
	    		RoomLive roomlive = new RoomLive(0, selectroom.getRonum(), Login.member.getmId());
	    		RoomDao.roomDao.addroomlive(roomlive);
	    		
	    		txtcontent.appendText("--ä�ù� ����--\n");
	    		btnconnect.setText("ä�ù� ������");
	    		txtmsg.setText("");
	    		txtmsg.setDisable(false); // ä���Է�â ��������
		    	txtcontent.setDisable(false); // ä��â ��밡��
		    	btnsend.setDisable(false); // ���۹�ư ��밡��
		    	txtmsg.requestFocus(); // ä���Է�â���� Ŀ�� �ű��
		    	//ä���ϸ鼭 �� ���� ����
		    	txtroomname.setDisable(true);
		    	btnadd.setDisable(true);
		    	roomtable.setDisable(true);
	    	}else {//��ư�� ä�ù� ��������
	    		
	    		ClientStop();//Ŭ���̾�Ʈ ���� �޼ҵ�
	    		
	    		txtcontent.appendText("--ä�ù� ����--\n");
	    		btnconnect.setText("ä�ù� ����");
	    		txtmsg.setDisable(true); // ä���Է�â ��������
		    	txtcontent.setDisable(true); // ä��â ������
		    	btnsend.setDisable(true); // ���۹�ư ������
		    	txtroomname.setDisable(false);
		    	btnadd.setDisable(false); // �� ���� ��� �����ϰ�
		    	roomtable.setDisable(false);
		    	//�� ���� ��ܿ��� ����
		    	RoomDao.roomDao.roomLiveDelete(Login.member.getmId());
		    	//���� ����� 0���̸� �� ����
		    		//���� �����Ǹ� �������� ����
		    	boolean result = RoomDao.roomDao.roomdelete(selectroom.getRonum());
		    	if(result) {server.serverstop();}
		    	//���̺�信�� ���õ� �� �ʱ�ȭ
		    	selectroom=null;
		    	//������ �� ���̺� �ʱ�ȭ
		    	lblselect.setText("���� ���õ� �� : ");
		    	show(); // �� ��� ���̺� ���ΰ�ħ
	    	}
	    }
	    @FXML
	    void send(ActionEvent event) {
	    	String msg = Login.member.getmId()+":"+txtmsg.getText()+"\n";
	    	send(msg);
	    	txtmsg.setText(""); // ������ �� �޽��� �Է�â �����
	    	txtmsg.requestFocus(); // ������ �� �޽����Է�â���� ��Ŀ��(Ŀ��) �̵�
	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    //ä�� �������� �ʱⰪ
	    	txtmsg.setText("ä��â ���� �� ��밡��");
	    	txtmsg.setDisable(true); // ä���Է�â ��������
	    	txtcontent.setDisable(true); // ä��â ������
	    	btnsend.setDisable(true); // ���۹�ư ������
	    	btnconnect.setDisable(true); //�����ư ������
	    	txtmidlist.setDisable(true);
	    	show();
	    }
	    
}
