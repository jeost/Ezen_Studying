package controller.board;

import java.net.URL;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
import dao.BoardDao;
import dto.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class BoardWrite implements Initializable{
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	@FXML
    private Button btnback;

    @FXML
    private TextField txttitle;

    @FXML
    private TextArea txtcontent;

    @FXML
    private Button btnwrite;

    @FXML
	void back(ActionEvent event) {
		Home.home.loadpage("/view/board/board.fxml");
	}
	@FXML
	void write(ActionEvent event) {
		//데이터 가져오기
		String title = txttitle.getText(); // 해당 fxid 객체에서 입력된 내용물 가져오기
		String content = txtcontent.getText();
		String write = Login.member.getmId();
		//객체화 [ 번호, 제목, 내용, 작성자, 작성일(생략), 조회수(생략)
		Board board = new Board(0, title, content, write, null, 0);
		boolean result = BoardDao.boardDao.write(board);
		if(result) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("게시글 작성 완료");
			alert.showAndWait();
			//페이지 전환
			Home.home.loadpage("/view/board/board.fxml");
			}else {Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("게시글 작성 실패[오류]");
			alert.showAndWait();
		}
	}
	
	
}
