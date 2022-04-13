package controller.home;

import java.net.URL;
import java.util.ResourceBundle;

import controller.login.Login;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Info implements Initializable{
	
	@FXML
	private Label lblid;
	
	@FXML
	private Label lblemail;
	
	@FXML
	private Label lbladdress;
	
	@FXML
	private Label lblpoint;
	
	@FXML
	private Label lblsince;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblid.setText(Login.member.getmId());
		lblemail.setText(Login.member.getmEMail());
		lbladdress.setText(Login.member.getmAddress());
		lblpoint.setText(Login.member.getmPoint()+"��");
		lblsince.setText(Login.member.getmSince());
	}
}
