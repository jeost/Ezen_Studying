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
    	int bnum = controller.board.Board.board.getBnum(); // ���� �Խù� ��ȣ �����ͼ� �Ʒ��� �ֱ�
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
    	//1. ��� �޼��� ����
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setHeaderText("�ش� �Խù��� �����Ͻðڽ��ϱ�?");
    	Optional<ButtonType> optional = alert.showAndWait();
    	//Ȯ�ι�ư ������
    	if(optional.get()==ButtonType.OK) {
    		//���� ó��
    		BoardDao.boardDao.delete(controller.board.Board.board.getBnum());
    		//������ ��ȯ
    		Home.home.loadpage("/view/board/board.fxml");
    	}
    	//����
    }

    @FXML
    void rewrite(ActionEvent event) {
    	String rcontent = txtrecontent.getText();
    	//���� �α��ε� ���̵� ���� ��������
    	String rwrite=Login.member.getmId();
    	//���� ���̺��� Ŭ���� �Խù� ��ȣ ��������
    	int bnum = controller.board.Board.board.getBnum();
    	//��üȭ
    	Reply reply = new Reply(0, rcontent, rwrite, null, bnum);
    	//dbó��
    	boolean result = BoardDao.boardDao.rwrite(reply);
    	
    	if(result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("��� ��� ����");
    		alert.showAndWait();
    		txtrecontent.setText("");
    	}else {
    		
    	}
    }
    boolean upcheck = true; // ������ư ����ġ ����
    @FXML
    void update(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	if(upcheck) {
    	alert.setHeaderText("�Խñ��� ���� �� �����Ϸ��ư ������");
    	alert.showAndWait();
    	txttitle.setEditable(true);
    	txtcontent.setEditable(true);
    	btnupdate.setText("�����Ϸ�");
    	upcheck = false;
    	}else {//���� �Ϸ�
    		//dbó��
    		BoardDao.boardDao.update(controller.board.Board.board.getBnum(),
    				txttitle.getText(),
    				txtcontent.getText());
    		
    		alert.setHeaderText("���� �Ϸ�");
    		alert.showAndWait();
    		txttitle.setEditable(false);
    		txtcontent.setEditable(false);
    		btnupdate.setText("����");
    		upcheck=true;
    	}
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		replytableshow();
		Board board = controller.board.Board.board; // board ��Ʈ�� �� ���̺��� ���õ� ��ü ȣ��
		//�� ��Ʈ�ѿ� ���õ� board�� ������ �����ϱ�
		lblwrite.setText("�ۼ��� : "+board.getBwrite());
		lbldate.setText("�ۼ��� : "+board.getBdate());
		lblview.setText("��ȸ�� : "+board.getBview());
		txttitle.setText(board.getBtitle());
		txtcontent.setText(board.getBcontent());
		
		if(!board.getBwrite().equals(Login.member.getmId())) { // ������ �� �ƴϸ�
			btndelete.setVisible(false); // ���� ��ư �����
			btnupdate.setVisible(false); // ���� ��ư �����
		}
		txttitle.setEditable(false); // ���� ���� �Ұ��� �����
		txtcontent.setEditable(false); // ���� ���� �Ұ��� �����
	}
}
