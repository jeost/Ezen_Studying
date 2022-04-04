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
		lblconfirm.setText(""); // 첫 실행시 문구 숨기기
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
    	System.out.println("뒤로가기 버튼을 눌렀습니다.");
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
    	
    	//유효성검사
    		//id중복체크
    	boolean result2 = MemberDao.memberDao.idcheck(id);
    	if(result2) {
    		lblconfirm.setText("실패 : 사용중인 아이디");
    		return;
    	}
    		//비밀번호체크
    	if(pw.length()<4 || pw.length()>10 || pwc.length()<4 || pwc.length()>10) {
    		lblconfirm.setText("비밀번호의 길이는 4부터 10까지입니다."); return;
    	}
    
    if(!pw.equals(pwc)) { // 비밀번호 검사시 일치하지 않으면
		lblconfirm.setText("비밀번호가 일치하지 않습니다.");
		return;}
    		//이메일체크
    if(email.indexOf("@")==-1) { // @가 없으면
    	lblconfirm.setText("올바른 이메일 형식이 아닙니다."); return;
    }
    		//주소체크
    if(!(address.contains("시") && address.contains("구") && address.contains("동"))) {
    	lblconfirm.setText("시, 구, 동을 포함해주세요"); return;
    }
    	//모든 유효성검사 통과시 DB에 저장
    		//객체화 [ 회원번호없음, id, pw, email, address,  포인트없음, since
    	Member member = new Member(0, id, pw, email, address, 0, since);
    	//DB객체 내 메소드 호출
    	boolean result = MemberDao.memberDao.signUp(member);
    	if(result) { //회원가입 성공시
    		//메시지창 출력 [Alert : 메시지(알람) 클래스]
    		Alert alert = new Alert(AlertType.INFORMATION); // 메시지 객체
    		alert.setTitle("알림"); // 메시지 제목 설정
    		alert.setHeaderText("메시지 내용 테스트");
    		alert.setContentText("회원가입 성공");
    		alert.showAndWait(); // 메시지 실행
    		//로그인 페이지로 화면전환
    		Login.instance.loadpage("view/login/loginpane");
    	}else {
    		System.out.println("가입 실패"); return;
    	}
    }
    void login(ActionEvent event) {
    	//컨트롤 입력 값 호출
    	String id = txtid.getText();
    	String pw = txtpassword.getText();
    	//db객체내 메소드 호출
    	boolean result = MemberDao.memberDao.login(id, pw);
    	//결과 확인
    	if(result) { // 로그인 성공시
    		System.out.println("로그인 성공");
    	}else {
    		System.out.println("동일한 회원정보가 없습니다");
    	}
    }
}







