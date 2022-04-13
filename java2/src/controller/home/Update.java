package controller.home;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import controller.login.Login;
import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Update implements Initializable{
	@FXML
	private TextField txtemail;
	@FXML
	private TextField txtaddress;
	@FXML
	private Button btnupdate;
	@FXML
	private Label lblid;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtemail.setText(Login.member.getmEMail());
		txtaddress.setText(Login.member.getmAddress());
	}
	@FXML public void update(ActionEvent e) {
		String email=txtemail.getText();
		String address=txtaddress.getText();
		
		boolean result = MemberDao.memberDao.update(Login.member.getmNum(), email, address);
		if(result) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("회원번호 수정 완료");
			alert.setContentText("다시 로그인해주세요");
			alert.showAndWait();
			Main.instance.loadpage("/view/login/login.fxml");
			Login.member=null; // 로그아웃처리
		}else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("회원번호 수정 실패");
			alert.showAndWait();
		}
	}
}
