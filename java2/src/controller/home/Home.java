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

public class Home implements Initializable{ // 실행 초기값 설정 메소드
	
	public static Home home; // 메모리 할당
	
	public Home() { // 생성자
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
		}catch(Exception e) {System.out.println("페이지 로드 오류"+e);}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblloginid.setText(Login.member.getmId()+"님");
		lblpoint.setText("포인트 : " + Login.member.getmPoint());
		loadpage("/view/chatting.fxml");
	}
	
	@FXML
	public void Logout(MouseEvent e) {
		//login 정보 지우기
		Login.member = null;
		//페이지 전환
		Main.instance.loadpage("/view/login/login.fxml");
	}
	@FXML // 회원탈퇴
	public void delete(MouseEvent e) {
		// 1. 메시지
		Alert alert = new Alert(AlertType.CONFIRMATION); // 확인/취소창
		alert.setHeaderText("정말 탈퇴 하시겠습니까?");
		//버튼 확인
		Optional<ButtonType> optional = alert.showAndWait();
		if(optional.get() == ButtonType.OK) {
			boolean result = MemberDao.memberDao.delete(Login.member.getmNum()); // 현재 로그인중인 회원번호 호출
			if(result) { // 탈퇴 성공
				//로그아웃
				Login.member=null;
				//페이지전환
				Main.instance.loadpage("/view/login/login.fxml");
			}else { // 탈퇴 실패
				
			}
		}
	}
	
	@FXML // 회원정보
	public void accinfo(MouseEvent e) {
		loadpage("/view/home/info.fxml");
	}
	@FXML // 회원수정
	public void accupdate(MouseEvent e) {
		loadpage("/view/home/update.fxml");
	}
	@FXML
	public void accboard(MouseEvent e) {
		loadpage("/view/board/board.fxml");
	}
	
	public static String category;
	@FXML
	public void accproduct1(MouseEvent e) { //남성의류
		loadpage("/view/product/product.fxml"); category="남성의류";
	}
	@FXML
	public void accproduct2(MouseEvent e) {  //여성의류
		loadpage("/view/product/product.fxml"); category="여성의류";
	}
	@FXML
	public void accproduct3(MouseEvent e) { //생활용품
		loadpage("/view/product/product.fxml"); category="게임기기";
	}
	@FXML
	public void accproduct4(MouseEvent e) { //게임기기
		loadpage("/view/product/product.fxml"); category="생활용품";
	}
}
