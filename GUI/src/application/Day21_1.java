package application;

//javafx만 사용
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day21_1 extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {

		// 컨테이너 만들기
		VBox box = new VBox();
			//컨트롤 만들기
		Button button = new Button();
		button.setText("닫기");
		button.setOnAction(e->Platform.exit());
			//	값->인수	람다식(이름 없는 메소드)
		//컨테이너에 컨트롤 넣기
		box.getChildren().add(button);
		//씬 객체 생성
		Scene scene = new Scene(box, 500, 500); // 컨테이너 이름, 가로, 세로
		//스테이지에 씬 넣기
		stage.setScene(scene);
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args); // start 메소드 호출
	}
}
