package application;

//javafx�� ���
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day21_1 extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {

		// �����̳� �����
		VBox box = new VBox();
			//��Ʈ�� �����
		Button button = new Button();
		button.setText("�ݱ�");
		button.setOnAction(e->Platform.exit());
			//	��->�μ�	���ٽ�(�̸� ���� �޼ҵ�)
		//�����̳ʿ� ��Ʈ�� �ֱ�
		box.getChildren().add(button);
		//�� ��ü ����
		Scene scene = new Scene(box, 500, 500); // �����̳� �̸�, ����, ����
		//���������� �� �ֱ�
		stage.setScene(scene);
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args); // start �޼ҵ� ȣ��
	}
}
