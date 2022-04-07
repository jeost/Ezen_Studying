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
    public static Product select; // 선택된 버튼의 상품 저장
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//모든 제품 가져오기
		show(null); // 화면 처음 열렸을땐 검색어 null 넣기
	}
	 @FXML
	 void search(ActionEvent event) { // 검색버튼 눌렀을 때
		 String search = txtsearch.getText(); // 검색창 입력값 가져오기
		 show(search); // 입력한 검색어 show메소드로 넘기기
	 }
	 void show(String search) {
		 
		 if(vbox.getChildren().isEmpty()==false) { // vbox가 비어있지 않으면
			 vbox.getChildren().remove(0); // 삭제
		 }
		 ArrayList<Product> productlist=ProductDao.productDao.list(Home.category, search);
			//제품이 여러개일 때
	    	GridPane gridPane = new GridPane();
	    		//여백 설정
	    		gridPane.setPadding(new Insets(100));
	    		gridPane.setHgap(100);
	    		gridPane.setVgap(100);
	    	int i = 0; // 인덱스용 변수
	    	//반복문
	    	for(int row = 0; row<productlist.size()/3; row++) { // 행
	    		for(int col = 0; col<3; col++) { // 열
	    			ImageView imageView = new ImageView(new Image(productlist.get(i).getPimg()));
	    				imageView.setFitWidth(250);
	    				imageView.setFitHeight(250);
	    			Button button = new Button(null, imageView);
	    				//버튼 배경제거
	    				button.setStyle("-fx-background-color:transparent");
	    				//버튼 id값넣기[제품 식별]
	    				button.setId(i+"");
	    				//버튼 클릭이벤트
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
	    	if(remain!=0) { // 나머지가 존재하면
	    		for( int col = 0 ; col<remain ; col++ ) { // 열
					ImageView imageView = new ImageView( new Image(productlist.get(i).getPimg() ) );
						imageView.setFitWidth(250);		// 이미지 가로길이 
						imageView.setFitHeight(200); 	// 이미지 세로길이
					Button button = new Button( null , imageView );
						button.setStyle("-fx-background-color:transparent");
						button.setId( i+"" );
						button.setOnAction( e -> { 
							int id = Integer.parseInt(  e.toString().split(",")[0].split("=")[2] );
							select = productlist.get(id);
							Home.home.loadpage("/view/product/ProductView.fxml");
						} );	
					gridPane.add( button  , col , row+1 ); // 마지막행에 나머지값 만큼 버튼 추가해서 그리드에 추가
					i++; //인덱스 증가
	    		}
	    	}
	    	vbox.getChildren().add(gridPane);
	 }
}
