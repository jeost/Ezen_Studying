package controller.login;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import dao.MemberDao;
import dto.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Signuppane implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText(""); // ù ����� ���� �����
	}
	
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnback;

    @FXML
    private Label lblconfirm;

    @FXML
    private PasswordField txtpasswordconfirm;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtaddress;

    @FXML
    void back(ActionEvent event) {
    	System.out.println("�ڷΰ��� ��ư�� �������ϴ�.");
    	Login.instance.loadpage("/view/login/loginpane.fxml");
    }

    @FXML
    void signup(ActionEvent event) {
    	String id  = txtid.getText();
    	String pw  = txtpassword.getText();
    	String pwc = txtpasswordconfirm.getText();
    	String email  = txtemail.getText();
    	String address = txtaddress.getText();
    	
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	String since = format.format(new Date());
    	
    	//��ȿ���˻�
    		//id�ߺ�üũ
    	boolean result2 = MemberDao.memberDao.idcheck(id);
    	if(result2) {
    		lblconfirm.setText("���� : ������� ���̵�");
    		return;
    	}
    		//��й�ȣüũ
    	if(pw.length()<4 || pw.length()>10 || pwc.length()<4 || pwc.length()>10) {
    		lblconfirm.setText("��й�ȣ�� ���̴� 4���� 10�����Դϴ�."); return;
    	}
    
    if(!pw.equals(pwc)) { // ��й�ȣ �˻�� ��ġ���� ������
		lblconfirm.setText("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		return;}
    		//�̸���üũ
    if(email.indexOf("@")==-1) { // @�� ������
    	lblconfirm.setText("�ùٸ� �̸��� ������ �ƴմϴ�."); return;
    }
    		//�ּ�üũ
    if(!(address.contains("��") && address.contains("��") && address.contains("��"))) {
    	lblconfirm.setText("��, ��, ���� �������ּ���"); return;
    }
    	//��� ��ȿ���˻� ����� DB�� ����
    		//��üȭ [ ȸ����ȣ����, id, pw, email, address,  ����Ʈ����, since
    	Member member = new Member(0, id, pw, email, address, 0, since);
    	//DB��ü �� �޼ҵ� ȣ��
    	boolean result = MemberDao.memberDao.signUp(member);
    	if(result) { //ȸ������ ������
    		//�޽���â ��� [Alert : �޽���(�˶�) Ŭ����]
    		Alert alert = new Alert(AlertType.INFORMATION); // �޽��� ��ü
    		alert.setTitle("�˸�"); // �޽��� ���� ����
    		alert.setHeaderText("�޽��� ���� �׽�Ʈ");
    		alert.setContentText("ȸ������ ����");
    		alert.showAndWait(); // �޽��� ����
    		//�α��� �������� ȭ����ȯ
    		Login.instance.loadpage("view/login/loginpane");
    	}else {
    		System.out.println("���� ����"); return;
    	}
    }
    void login(ActionEvent event) {
    	//��Ʈ�� �Է� �� ȣ��
    	String id = txtid.getText();
    	String pw = txtpassword.getText();
    	//db��ü�� �޼ҵ� ȣ��
    	boolean result = MemberDao.memberDao.login(id, pw);
    	//��� Ȯ��
    	if(result) { // �α��� ������
    		System.out.println("�α��� ����");
    	}else {
    		System.out.println("������ ȸ�������� �����ϴ�");
    	}
    }
}







