package controller;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import dao.MemberDao;
import dao.ProductDao;
import dto.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class RecordControl implements Initializable{
	@FXML
	private Label lblmtotal;

    @FXML
    private Label lblptotal;

    @FXML
    private Label lblbtotal;
    
    @FXML
    private BarChart mbc;
    
    @FXML
    private BarChart bbc;
    
    @FXML
    private BarChart pbc;
    
    @FXML
    private PieChart ppc;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//전체 회원수
		int mTotal = MemberDao.memberDao.countTotal("member");
		lblmtotal.setText(mTotal+"명");
		//전체 제품수
		int pTotal = MemberDao.memberDao.countTotal("product");
		lblptotal.setText(pTotal+"개");
		//전체 게시물수
		int bTotal = MemberDao.memberDao.countTotal("board");
		lblbtotal.setText(bTotal+"개");
		
		//날짜별 회원 가입 수
		XYChart.Series series = new XYChart.Series<>(); // xy축 계열 생성
			//날짜별 회원가입 수 체크
			//Map컬렉션 => 키(날짜), 값(가입수) 로 하나의 엔트리 구성
			Map<String, Integer> map = MemberDao.memberDao.datetotal("member","msince"); // DB에서 데이터 가져오기
			//데이터를 계열에 추가
			for(String key : map.keySet()) {
				XYChart.Data data = new XYChart.Data<>(key, map.get(key));
				series.getData().add(data);
				}
			//차트에 넣기
			mbc.getData().add(series);
			
			//계열 생성
			XYChart.Series series2 = new XYChart.Series<>();
			Map<String, Integer> map2 = MemberDao.memberDao.datetotal("board","bdate");
			//데이터 가져오기
			for(String key : map2.keySet()) {
				XYChart.Data data = new XYChart.Data<>(key, map2.get(key));
				//데이터를 계열에 추가
				series2.getData().add(data);
			}
			//차트에 넣기
			bbc.getData().add(series2);
			
			//계열 생성
			XYChart.Series series3 = new XYChart.Series<>();
			
			series3.setName("국어점수"); // * 계열명 
		
			// 2. 데이터 선언 ( x축값 , y축값 )
			XYChart.Data data = new XYChart.Data<>("신동엽" , 10);
			// 3. 계열에 데이터 추가
			series3.getData().add(data);
			
			XYChart.Data data2 = new XYChart.Data<>("강호동" , 20);
			series3.getData().add(data2);
			
			XYChart.Data data3 = new XYChart.Data<>("유재석" , 15);
			series3.getData().add(data3);
			
		// 4. 차트에 계열추가
		pbc.getData().add(series3);
			
		XYChart.Series series4 = new XYChart.Series<>();
			series4.setName("영어점수");

			XYChart.Data data4 = new XYChart.Data<>("신동엽" , 25); // 2. 데이터 선언 ( x축값 , y축값 )
			series4.getData().add(data4); // 3. 계열에 데이터 추가
			
			XYChart.Data data5 = new XYChart.Data<>("강호동" , 40);
			series4.getData().add(data5);
			
			XYChart.Data data6 = new XYChart.Data<>("유재석" , 50);
			series4.getData().add(data6);
			//원형차트 : 카테고리별 개수
			ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
//			ObservableList<PieChart.Data> pielist = FXCollections.observableArrayList();
//				PieChart.Data data7 = new PieChart.Data("남성의류", 10);
//				list.add(data7);
//				PieChart.Data data8 = new PieChart.Data("생활용품", 10);
//				list.add(data8);
//				PieChart.Data data9 = new PieChart.Data("게임기기", 10);
//				list.add(data9);
//			ppc.setData(list);
			Map<String, Integer> map3 = MemberDao.memberDao.countCategory();
			for(String key : map3.keySet()) {
				PieChart.Data temp = new PieChart.Data(key, map3.get(key));
				list.add(temp);
			}
	}	
}
