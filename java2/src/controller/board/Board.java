package controller.board;

import java.net.URL;
import java.util.ResourceBundle;

import controller.home.Home;
import dao.BoardDao;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class Board implements Initializable{
	
	@FXML
	private TableView<dto.Board> boardTable;
	
	public static dto.Board board;
	@FXML
	private Button btnwrite;
	
	@FXML
	void accwrite(ActionEvent event) {
		Home.home.loadpage("/view/board/BoardWrite.fxml");
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//db에서 모든 게시글 가져오기
		ObservableList<dto.Board> boardlist = BoardDao.boardDao.list();
		//tableview에 추가
		TableColumn tc = boardTable.getColumns().get(0); // 첫번째 열 호출
		tc.setCellValueFactory(new PropertyValueFactory<>("bnum"));
		
		tc = boardTable.getColumns().get(1);
		tc.setCellValueFactory(new PropertyValueFactory<>("btitle"));
		
		tc = boardTable.getColumns().get(2);
		tc.setCellValueFactory(new PropertyValueFactory<>("bwrite"));
		
		tc = boardTable.getColumns().get(3);
		tc.setCellValueFactory(new PropertyValueFactory<>("bdate"));
		
		tc = boardTable.getColumns().get(4);
		tc.setCellValueFactory(new PropertyValueFactory<>("bview"));
		boardTable.setItems(boardlist); // 테이블명(fxid).setItems(ObservableList); : 테이블에 표시할 리스트 설정
		
		//tableview에서 해당 셀을 클릭했을 때 이벤트
		boardTable.setOnMouseClicked(e->{
			//테이블에서 클릭한 객체를 임시객체에 담기
			board=boardTable.getSelectionModel().getSelectedItem(); // 클릭된 board 객체 호출
			//조회수 증가
			
			//페이지 전환
			Home.home.loadpage("/view/board/boardview.fxml");
		});
		
		
		
	}

}
