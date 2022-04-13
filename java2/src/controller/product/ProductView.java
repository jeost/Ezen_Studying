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
	    	if(btnactivation.getText().equals("�ŷ���"))
	    		{txtpactivation.setText("���� : �ŷ���"); btnactivation.setText("�ǸſϷ�"); 
	    		ProductDao.productDao.activation(ProductControl.select.getPnum());
	    		ProductControl.select.setPactivation(2); return;}
	    	if(btnactivation.getText().equals("�ǸſϷ�")) 
	    		{txtpactivation.setText("���� : �ǸſϷ�"); btnactivation.setText("�Ǹ���"); 
	    		ProductDao.productDao.activation(ProductControl.select.getPnum());
	    		ProductControl.select.setPactivation(3); return;}
	    	if(btnactivation.getText().equals("�Ǹ���")) 
		    	{txtpactivation.setText("���� : �Ǹ���"); btnactivation.setText("�ŷ���"); 
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
	    	alert.setHeaderText("�����Ͻðڽ��ϱ�?");
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
	    		DecimalFormat decimalFormat = new DecimalFormat("����  : #,##0��");
	    	txtpprice.setText(decimalFormat.format(product.getPprice()));
	    	if(product.getPactivation()==1) {txtpactivation.setText("�Ǹ���");
	    	btnactivation.setText("�ŷ���");}
	    	if(product.getPactivation()==2) {txtpactivation.setText("�ŷ���");
	    	btnactivation.setText("�ǸſϷ�");}
	    	if(product.getPactivation()==3) {txtpactivation.setText("�ǸſϷ�");
	    	btnactivation.setText("�Ǹ���");}
	    	txtpdate.setText(product.getPdate());
	    	//dao�޼ҵ� �̿��� ȸ����ȣ���� id��������
	    	txtmid.setText(MemberDao.memberDao.getmId(product.getMnum()));
	    	
	    	txtpname.setEditable(false);
	    	txtpcontent.setEditable(false);
	    	//��ǰ���ȸ�� ������ ��ȸ���� �������
	    	if(product.getMnum()!=Login.member.getmNum()) {
	    		btndelete.setVisible(false); // ��ư �����
	    		btnupdate.setVisible(false);
	    	}
	    }
}
