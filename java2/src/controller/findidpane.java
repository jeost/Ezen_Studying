package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class findidpane implements Initializable{

	 @FXML
	    private Button btnfindid;

	    @FXML
	    private Button btnback;

	    @FXML
	    private Label lblconfirm;

	    @FXML
	    private TextField txtemail;

	    @FXML
	    void back(ActionEvent event) {

	    }

	    @FXML
	    void findid(ActionEvent event) {
	    	String email=txtemail.getText();
	    	String id = MemberDao.memberDao.findId(email);
	    	
	    	if(id!=null)  { // id�� �����ϸ�
	    		//�˶�
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setHeaderText("���̵� : " + id);
	    		alert.showAndWait();
	    	}else { // null�̸�
	    		lblconfirm.setText("�ش� �̸����� ���̵� ������ �����ϴ�");
	    	}
	    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
}
