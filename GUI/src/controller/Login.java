package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Text;

public class Login implements Initializable {
	
	public static Login login;
	
	public Login() {
		login = this;
	}

    @FXML
    private ImageView imageview;

    @FXML
    private MediaView mediaview;

    @FXML
    private Text text;

    @FXML
    private BorderPane borderpane;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		 //1. 동영상 삽입하기
			// 1. 동영상파일 객체화
		Media media = new Media(getClass().getResource("/img/video.mp4").toString());
	      
        // 2) 미디어 뷰 객체에 동영상 넣기
     MediaPlayer mediaPlayer = new MediaPlayer(media);
        // 3) 미디어뷰에 미디어 플레이어 넣기
     mediaview.setMediaPlayer(mediaPlayer);
        // 4) 미디어 플레이어 시작
     mediaPlayer.play();
     System.out.println(mediaPlayer);
			
			loadpage("/view/loginpane.fxml");
			
	}
	
	public void loadpage( String page ) {
		try {
			Parent parent = FXMLLoader.load( getClass().getResource(page) );
			borderpane.setCenter(parent);
		}catch( Exception e ) { System.out.println("해당 파일이 없습니다. "+e);}
		
		
	}
	
	
	
}
