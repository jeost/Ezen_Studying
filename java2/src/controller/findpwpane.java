package controller;

import java.net.URL;
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
import javafx.scene.control.TextField;

public class findpwpane implements Initializable{
	
	   @FXML
	    private Button btnfindpw;

	    @FXML
	    private Button btnback;

	    @FXML
	    private Label lblconfirm;

	    @FXML
	    private TextField txtemail;

	    @FXML
	    private TextField txtid;

	    @FXML
	    void back(ActionEvent event) {

	    }

	    @FXML
	    void findpw(ActionEvent event) {
	    	String id = txtid.getText();
	    	String email = txtemail.getText();
	    	
	    	String pw=MemberDao.memberDao.findPw(id, email);
	    	
	    	if(pw!=null) {
	    		Member.sendMail(email, pw);
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setHeaderText("해당 이메일로 비밀번호를 전송했습니다");
	    		alert.showAndWait();
	    	}else {
	    		lblconfirm.setText("입력정보 오류");
	    	}
	    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
}
