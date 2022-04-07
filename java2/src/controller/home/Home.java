package controller.home;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.Main;
import controller.login.Login;
import dao.MemberDao;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;

public class Home implements Initializable{ // ���� �ʱⰪ ���� �޼ҵ�
	
	public static Home home; // �޸� �Ҵ�
	
	public Home() { // ������
		home=this;
	}
	@FXML
	private Label lblloginid;
	@FXML
	private Label lblpoint;
	@FXML
	private Label lblLogout;
	@FXML
	private BorderPane borderpane;
	@FXML
	private Label lblupdate;
	@FXML
	private Label lbldelete;
	@FXML
	private Label lblinfo;
	@FXML
	private Label lblboard;
	@FXML
	private Label lblproduct;
	
	public void loadpage(String page) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page));
			borderpane.setCenter(parent);
		}catch(Exception e) {System.out.println("������ �ε� ����"+e);}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblloginid.setText(Login.member.getmId()+"��");
		lblpoint.setText("����Ʈ : " + Login.member.getmPoint());
		loadpage("/view/chatting.fxml");
	}
	
	@FXML
	public void Logout(MouseEvent e) {
		//login ���� �����
		Login.member = null;
		//������ ��ȯ
		Main.instance.loadpage("/view/login/login.fxml");
	}
	@FXML // ȸ��Ż��
	public void delete(MouseEvent e) {
		// 1. �޽���
		Alert alert = new Alert(AlertType.CONFIRMATION); // Ȯ��/���â
		alert.setHeaderText("���� Ż�� �Ͻðڽ��ϱ�?");
		//��ư Ȯ��
		Optional<ButtonType> optional = alert.showAndWait();
		if(optional.get() == ButtonType.OK) {
			boolean result = MemberDao.memberDao.delete(Login.member.getmNum()); // ���� �α������� ȸ����ȣ ȣ��
			if(result) { // Ż�� ����
				//�α׾ƿ�
				Login.member=null;
				//��������ȯ
				Main.instance.loadpage("/view/login/login.fxml");
			}else { // Ż�� ����
				
			}
		}
	}
	
	@FXML // ȸ������
	public void accinfo(MouseEvent e) {
		loadpage("/view/home/info.fxml");
	}
	@FXML // ȸ������
	public void accupdate(MouseEvent e) {
		loadpage("/view/home/update.fxml");
	}
	@FXML
	public void accboard(MouseEvent e) {
		loadpage("/view/board/board.fxml");
	}
	
	public static String category;
	@FXML
	public void accproduct1(MouseEvent e) { //�����Ƿ�
		loadpage("/view/product/product.fxml"); category="�����Ƿ�";
	}
	@FXML
	public void accproduct2(MouseEvent e) {  //�����Ƿ�
		loadpage("/view/product/product.fxml"); category="�����Ƿ�";
	}
	@FXML
	public void accproduct3(MouseEvent e) { //��Ȱ��ǰ
		loadpage("/view/product/product.fxml"); category="���ӱ��";
	}
	@FXML
	public void accproduct4(MouseEvent e) { //���ӱ��
		loadpage("/view/product/product.fxml"); category="��Ȱ��ǰ";
	}
}
