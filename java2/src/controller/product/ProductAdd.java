package controller.product;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
import dao.ProductDao;
import dto.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class ProductAdd implements Initializable{
    @FXML
    private Button btnadd;

    @FXML
    private TextField txtpname;

    @FXML
    private TextField txtpcontent;

    @FXML
    private Button btnimg;

    @FXML
    private TextField txtpprice;

    @FXML
    private RadioButton opt1;

    @FXML
    private ToggleGroup category;

    @FXML
    private RadioButton opt2;

    @FXML
    private RadioButton opt3;

    @FXML
    private RadioButton opt4;

    @FXML
    private ImageView img;

    @FXML
    private Button btn;

    @FXML
    private Button btnback;

    @FXML
    private Label txtpath;

    @FXML
    void accadd(ActionEvent event) {
    	Home.home.loadpage("");
    }


    @FXML
    void add(ActionEvent event) {
    	// 1. 컨트롤에 입력된 데이터 가져오기
    	String pname = txtpname.getText();
    	String pcontent  = txtpcontent.getText();
    	int pprice = Integer.parseInt(txtpprice.getText());
    		//카테고리
    	String pcategory = null;
    		if(opt1.isSelected()) { // 만약 opt1라는 fxid 컨트롤이 선택되면
    			pcategory = "남성의류";
    		}if(opt2.isSelected()) {pcategory="여성의류";}
    		if(opt3.isSelected()) {pcategory="게임기기";}
    		if(opt4.isSelected()) {pcategory="생활용품";}
    	int mnum = Login.member.getmNum();
    	// 2. 객체화
    	Product product = new Product(0, pname, pimage, pcontent, pcategory, pprice, 1, null, mnum);
    	// 3. DB처리
    	boolean result = ProductDao.productDao.add(product);
    	// 4. 결과처리
    	if(result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("제품 등록 완료");
    		alert.showAndWait();
    		Home.home.loadpage("/view/product/product.fxml");
    	}else {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("제품 등록 실패");
    		alert.showAndWait();
    	}
    }

    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/product/product.fxml");
    }
    private String pimage = null; // 메소드 밖에서 선언
    @FXML
    void imgadd(ActionEvent event) { // 이미지등록
    	//파일 선택 클래스
    	FileChooser filechooser = new FileChooser();
    	//파일 선택(필터) 형식
    		filechooser.getExtensionFilters().add(new ExtensionFilter("이미지파일:image file", "*png", "*jpeg","*jpg","*gif"));
    	//새 윈도우 창(stage) 열기
    	File file = filechooser.showOpenDialog(new Stage());
    	
    	//선택한 파일의 경로
    	txtpath.setText("파일 경로 : "+file.getPath());
    	//파일경로 표시
    	pimage = file.toURI().toString();
    		
    	//미리보기 이미지컨트롤에 띄우기
    	Image image = new Image(pimage);
    	img.setImage(image);
    	
    	//선택한 파일을 현재 프로젝트 폴더로 복사해오기
    	try {
    	//1. 파일 입력 스트림
    	FileInputStream inputStream = new FileInputStream(file); 
    	//2. 파일 출력 스트림
    	File copyfile = new File("C:/Users/정준영/git/ezen_web_2022_A/java2/src/img/"+file.getName());
    			FileOutputStream outputStream = new FileOutputStream(copyfile);
    	//3. 바이트 배열 선언
    		byte[] bytes = new byte[1024*1024*256]; // 256메가
    	//4. 반복문을 이용한 inputStream 다 읽어오기
    		int size;
    		while((size=inputStream.read(bytes))>0) { // 읽어온 바이트가 0보다 작으면 반복문 종료
    			outputStream.write(bytes, 0, size);
    		}
    		//용량 크면 스트림 종료 필수
    		inputStream.close();
    		outputStream.close();
    		//파일명 db 저장
    		pimage = copyfile.toURI().toString();
    	}catch(Exception e) {
    		System.out.println("파일입출력 오류 "+e);
    	}
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    }
}
