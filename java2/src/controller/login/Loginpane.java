package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Loginpane implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText("");
	}
	
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnfindid;

    @FXML
    private Button btnfindpassword;

    @FXML
    private Label lblconfirm;

    @FXML
    void accfindid(ActionEvent event) {
    	System.out.println(" 아이디찾기 페이지로 이동 ");
    	Login.instance.loadpage("/view/login/findid.fxml");
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println(" 패스워드찾기 페이지로 이동 ");
    	Login.instance.loadpage("/view/login/findpw.fxml");
    }

    @FXML
    void accsignup(ActionEvent event) {
    	System.out.println(" 회원가입 페이지로 이동 ");
    	// *회원가입 버튼을 누르면 login컨트롤클래스 내 borderpane 컨테이너 center 페이지 변경
    	// 문제 : 다른 클래스내 컨테이너 호출 
//    		Login login = new Login(); // 새로운 컨테이너 생성 [ x ]
//    		login.loadpage("/view/signuppane.fxml"); // [ x ]
    	// 해결방안 : 기존 컨테이너 가져오는 방법 !!!! -> this
    	Login.instance.loadpage("/view/login/signuppane.fxml");
    }

    @FXML
    void login(ActionEvent event) {
    	String id = txtid.getText();
    	String pw = txtpassword.getText();
    	
    	boolean result = MemberDao.memberDao.login(id, pw);
    	
    	if(result) {
    		//로그인 성공시 성공한 회원정보 저장
    		Login.member = MemberDao.memberDao.getmember(id);
    		Main.instance.loadpage("/view/home/home.fxml"); 
    		boolean result1 = MemberDao.memberDao.lLogin(id); // 마지막 로그인날짜랑 오늘이 같지 않으면
	    	if(result1) MemberDao.memberDao.mPoint(id);
    		System.out.println("로그인처리");
    	}else {
    		lblconfirm.setText("동일한 회원정보 없음");
    	}
    	
    }
	
	
}










