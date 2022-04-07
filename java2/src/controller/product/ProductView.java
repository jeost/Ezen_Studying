package controller.product;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
import dao.MemberDao;
import dao.ProductDao;
import dto.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ProductView implements Initializable{
	 @FXML
	    private TextField txtpcontent;

	    @FXML
	    private TextField txtpname;

	    @FXML
	    private ImageView img;

	    @FXML
	    private Button btnback;

	    @FXML
	    private Button btndelete;

	    @FXML
	    private Button btnupdate;

	    @FXML
	    private Label txtpactivation;

	    @FXML
	    private Label txtpdate;

	    @FXML
	    private Label txtmid;

	    @FXML
	    private Label txtpprice;

	    @FXML
	    private Button btnactivation;

	    @FXML
	    void activation(ActionEvent event) {
	    	if(btnactivation.getText().equals("거래중"))
	    		{txtpactivation.setText("상태 : 거래중"); btnactivation.setText("판매완료"); 
	    		ProductDao.productDao.activation(ProductControl.select.getPnum());
	    		ProductControl.select.setPactivation(2); return;}
	    	if(btnactivation.getText().equals("판매완료")) 
	    		{txtpactivation.setText("상태 : 판매완료"); btnactivation.setText("판매중"); 
	    		ProductDao.productDao.activation(ProductControl.select.getPnum());
	    		ProductControl.select.setPactivation(3); return;}
	    	if(btnactivation.getText().equals("판매중")) 
		    	{txtpactivation.setText("상태 : 판매중"); btnactivation.setText("거래중"); 
		    	ProductDao.productDao.activation(ProductControl.select.getPnum());
		    	ProductControl.select.setPactivation(1); return;}
	    }
	    @FXML
	    void back(ActionEvent event) {
	    	Home.home.loadpage("/view/product/product.fxml");
	    }

	    @FXML
	    void delete(ActionEvent event) {
	    	Alert alert = new Alert(AlertType.CONFIRMATION);
	    	alert.setHeaderText("삭제하시겠습니까?");
	    	Optional<ButtonType> optional = alert.showAndWait();
	    	if(optional.get()==ButtonType.OK) {
	    		ProductDao.productDao.delete(ProductControl.select.getPnum());

	    			Home.home.loadpage("/view/product/product.fxml");

	    	}
	    }

	    @FXML
	    void update(ActionEvent event) {
	    	Home.home.loadpage("/view/product/productupdate.fxml");
	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	Product product = ProductControl.select;
	    	
	    	img.setImage(new Image(product.getPimg()));
	    	txtpname.setText(product.getPname());
	    	txtpcontent.setText(product.getPcontent());
	    		DecimalFormat decimalFormat = new DecimalFormat("가격  : #,##0원");
	    	txtpprice.setText(decimalFormat.format(product.getPprice()));
	    	if(product.getPactivation()==1) {txtpactivation.setText("판매중");
	    	btnactivation.setText("거래중");}
	    	if(product.getPactivation()==2) {txtpactivation.setText("거래중");
	    	btnactivation.setText("판매완료");}
	    	if(product.getPactivation()==3) {txtpactivation.setText("판매완료");
	    	btnactivation.setText("판매중");}
	    	txtpdate.setText(product.getPdate());
	    	//dao메소드 이용해 회원번호에서 id가져오기
	    	txtmid.setText(MemberDao.memberDao.getmId(product.getMnum()));
	    	
	    	txtpname.setEditable(false);
	    	txtpcontent.setEditable(false);
	    	//제품등록회원 본인이 조회하지 않을경우
	    	if(product.getMnum()!=Login.member.getmNum()) {
	    		btndelete.setVisible(false); // 버튼 숨기기
	    		btnupdate.setVisible(false);
	    	}
	    }
}
