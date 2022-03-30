package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Loginpane implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpw;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnfindid;

    @FXML
    private Button btnfindpw;

    @FXML
    private Label labelconfirm;

    @FXML
    void accfindid(ActionEvent event) {

    }

    @FXML
    void accsignip(ActionEvent event) {
    	Login.login.loadpage("/view/회원가입페이지.fxml");
    }

    @FXML
    void accsignup(ActionEvent event) {

    }

}
