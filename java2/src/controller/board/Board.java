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
		//db���� ��� �Խñ� ��������
		ObservableList<dto.Board> boardlist = BoardDao.boardDao.list();
		//tableview�� �߰�
		TableColumn tc = boardTable.getColumns().get(0); // ù��° �� ȣ��
		tc.setCellValueFactory(new PropertyValueFactory<>("bnum"));
		
		tc = boardTable.getColumns().get(1);
		tc.setCellValueFactory(new PropertyValueFactory<>("btitle"));
		
		tc = boardTable.getColumns().get(2);
		tc.setCellValueFactory(new PropertyValueFactory<>("bwrite"));
		
		tc = boardTable.getColumns().get(3);
		tc.setCellValueFactory(new PropertyValueFactory<>("bdate"));
		
		tc = boardTable.getColumns().get(4);
		tc.setCellValueFactory(new PropertyValueFactory<>("bview"));
		boardTable.setItems(boardlist); // ���̺��(fxid).setItems(ObservableList); : ���̺� ǥ���� ����Ʈ ����
		
		//tableview���� �ش� ���� Ŭ������ �� �̺�Ʈ
		boardTable.setOnMouseClicked(e->{
			//���̺��� Ŭ���� ��ü�� �ӽð�ü�� ���
			board=boardTable.getSelectionModel().getSelectedItem(); // Ŭ���� board ��ü ȣ��
			//��ȸ�� ����
			
			//������ ��ȯ
			Home.home.loadpage("/view/board/boardview.fxml");
		});
		
		
		
	}

}
