package Day14;

import java.awt.Toolkit;

public class Day14_1 {

	public static void main(String[] args) {
		
		//필드
		
		//생성자
		
		//메소드
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i<5; i++) {
			toolkit.beep(); 
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Runnable beepTask = new Beeptask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		
		
	}
}
