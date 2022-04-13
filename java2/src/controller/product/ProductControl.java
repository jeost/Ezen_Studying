package controller.product;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controller.home.Home;
import dao.ProductDao;
import dto.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class ProductControl implements Initializable{
	
    @FXML
    private Button btnadd;

    @FXML
    private ScrollPane scrollpane;

    @FXML
    private VBox vbox;

    @FXML
    private TextField txtsearch;

    @FXML
    private Button btnsearch;

    @FXML
    void accadd(ActionEvent event) {
    	Home.home.loadpage("/view/product/productadd.fxml");
    }
    public static Product select; // ���õ� ��ư�� ��ǰ ����
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//��� ��ǰ ��������
		show(null); // ȭ�� ó�� �������� �˻��� null �ֱ�
	}
	 @FXML
	 void search(ActionEvent event) { // �˻���ư ������ ��
		 String search = txtsearch.getText(); // �˻�â �Է°� ��������
		 show(search); // �Է��� �˻��� show�޼ҵ�� �ѱ��
	 }
	 void show(String search) {
		 
		 if(vbox.getChildren().isEmpty()==false) { // vbox�� ������� ������
			 vbox.getChildren().remove(0); // ����
		 }
		 ArrayList<Product> productlist=ProductDao.productDao.list(Home.category, search);
			//��ǰ�� �������� ��
	    	GridPane gridPane = new GridPane();
	    		//���� ����
	    		gridPane.setPadding(new Insets(100));
	    		gridPane.setHgap(100);
	    		gridPane.setVgap(100);
	    	int i = 0; // �ε����� ����
	    	//�ݺ���
	    	for(int row = 0; row<productlist.size()/3; row++) { // ��
	    		for(int col = 0; col<3; col++) { // ��
	    			ImageView imageView = new ImageView(new Image(productlist.get(i).getPimg()));
	    				imageView.setFitWidth(250);
	    				imageView.setFitHeight(250);
	    			Button button = new Button(null, imageView);
	    				//��ư �������
	    				button.setStyle("-fx-background-color:transparent");
	    				//��ư id���ֱ�[��ǰ �ĺ�]
	    				button.setId(i+"");
	    				//��ư Ŭ���̺�Ʈ
	    				button.setOnAction((e)->{
	    					int id = Integer.parseInt(e.toString().split(",")[0].split("=")[2]);
	    					select = productlist.get(id);
	    					Home.home.loadpage("/view/product/ProductView.fxml");
	    				});
	    		gridPane.add(new Button(), col, row);	
	    		i++;
	    		}
	    	}
	    	int row = productlist.size() / 3;
	    	int remain = productlist.size()%3;
	    	if(remain!=0) { // �������� �����ϸ�
	    		for( int col = 0 ; col<remain ; col++ ) { // ��
					ImageView imageView = new ImageView( new Image(productlist.get(i).getPimg() ) );
						imageView.setFitWidth(250);		// �̹��� ���α��� 
						imageView.setFitHeight(200); 	// �̹��� ���α���
					Button button = new Button( null , imageView );
						button.setStyle("-fx-background-color:transparent");
						button.setId( i+"" );
						button.setOnAction( e -> { 
							int id = Integer.parseInt(  e.toString().split(",")[0].split("=")[2] );
							select = productlist.get(id);
							Home.home.loadpage("/view/product/ProductView.fxml");
						} );	
					gridPane.add( button  , col , row+1 ); // �������࿡ �������� ��ŭ ��ư �߰��ؼ� �׸��忡 �߰�
					i++; //�ε��� ����
	    		}
	    	}
	    	vbox.getChildren().add(gridPane);
	 }
}
