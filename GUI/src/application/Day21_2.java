package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day21_2 extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		//fxml 파일 불러오기
		Parent parent = FXMLLoader.load(getClass().getResource("test.fxml"));
		//씬 객체 생성
		Scene scene = new Scene(parent);
		//스테이지에 씬 넣기
		stage.setScene(scene);
		
		stage.show();
	}
	public static void main(String[] args) {
		
	}
}
