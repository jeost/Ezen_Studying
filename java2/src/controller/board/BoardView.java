package controller.board;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
import dao.BoardDao;
import dto.Board;
import dto.Reply;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert.AlertType;

public class BoardView implements Initializable{
	
	@FXML
    private Button btnback;

    @FXML
    private TextField txttitle;

    @FXML
    private TextArea txtcontent;

    @FXML
    private Button btnrewrite;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnupdate;

    @FXML
    private Label lblwrite;

    @FXML
    private Label lbldate;

    @FXML
    private Label lblview;

    @FXML
    private TableView<Reply> replytable;
    
    @FXML
    private TextArea txtrecontent;

    
    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/board/board.fxml");
    }
    public void replytableshow() {
    	int bnum = controller.board.Board.board.getBnum(); // 현재 게시물 번호 가져와서 아래에 넣기
    	ObservableList<Reply> replylist = BoardDao.boardDao.replylist(bnum);
    	
    	TableColumn tc = replytable.getColumns().get(0);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rnum"));
    	
    	tc = replytable.getColumns().get(1);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rwrite"));
    	
    	tc = replytable.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rdate"));
    	
    	tc = replytable.getColumns().get(3);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rcontent"));
    	
    	replytable.setItems(replylist);
    }
    @FXML
    void delete(ActionEvent event) {
    	//1. 경고 메세지 띄우기
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setHeaderText("해당 게시물을 삭제하시겠습니까?");
    	Optional<ButtonType> optional = alert.showAndWait();
    	//확인버튼 누르면
    	if(optional.get()==ButtonType.OK) {
    		//삭제 처리
    		BoardDao.boardDao.delete(controller.board.Board.board.getBnum());
    		//페이지 전환
    		Home.home.loadpage("/view/board/board.fxml");
    	}
    	//삭제
    }

    @FXML
    void rewrite(ActionEvent event) {
    	String rcontent = txtrecontent.getText();
    	//현재 로그인된 아이디 정보 가져오기
    	String rwrite=Login.member.getmId();
    	//현재 테이블에서 클릭한 게시물 번호 가져오기
    	int bnum = controller.board.Board.board.getBnum();
    	//객체화
    	Reply reply = new Reply(0, rcontent, rwrite, null, bnum);
    	//db처리
    	boolean result = BoardDao.boardDao.rwrite(reply);
    	
    	if(result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("댓글 등록 성공");
    		alert.showAndWait();
    		txtrecontent.setText("");
    	}else {
    		
    	}
    }
    boolean upcheck = true; // 수정버튼 스위치 변수
    @FXML
    void update(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	if(upcheck) {
    	alert.setHeaderText("게시글을 수정 후 수정완료버튼 누르기");
    	alert.showAndWait();
    	txttitle.setEditable(true);
    	txtcontent.setEditable(true);
    	btnupdate.setText("수정완료");
    	upcheck = false;
    	}else {//수정 완료
    		//db처리
    		BoardDao.boardDao.update(controller.board.Board.board.getBnum(),
    				txttitle.getText(),
    				txtcontent.getText());
    		
    		alert.setHeaderText("수정 완료");
    		alert.showAndWait();
    		txttitle.setEditable(false);
    		txtcontent.setEditable(false);
    		btnupdate.setText("수정");
    		upcheck=true;
    	}
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		replytableshow();
		Board board = controller.board.Board.board; // board 컨트롤 내 테이블에서 선택된 객체 호출
		//각 컨트롤에 선택된 board의 데이터 설정하기
		lblwrite.setText("작성자 : "+board.getBwrite());
		lbldate.setText("작성일 : "+board.getBdate());
		lblview.setText("조회수 : "+board.getBview());
		txttitle.setText(board.getBtitle());
		txtcontent.setText(board.getBcontent());
		
		if(!board.getBwrite().equals(Login.member.getmId())) { // 본인의 글 아니면
			btndelete.setVisible(false); // 삭제 버튼 숨기기
			btnupdate.setVisible(false); // 수정 버튼 숨기기
		}
		txttitle.setEditable(false); // 제목 수정 불가로 만들기
		txtcontent.setEditable(false); // 내용 수정 불가로 만들기
	}
}
