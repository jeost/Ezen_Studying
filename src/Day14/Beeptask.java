package Day14;

import java.awt.Toolkit;

public class Beeptask implements Runnable{
	@Override
	//싱글스레드
	public void run() { // runnable interface 내부 run메소드
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++)
			toolkit.beep();
		try {
		Thread.sleep(500);
		}catch(Exception e) {}
	}
	//멀티스레드
	Thread thread2 = new BeepThread();{
	
	
	for(int i = 0; i<5; i++) {
		System.out.println("띵");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//익명 객체 [ 멀티 스레드 ]
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i<5; i++)
				toolkit.beep();
			try {
			Thread.sleep(500);
			}catch(Exception e) {}
		}
	};
	
//	public static void main(String[] args) {
//		System.out.println("Main 메소드 안에 있는 스레드 이름 : " + Thread.currentThread().getName());
//															// 현 코드를 읽는 스레드 호출  이름 호출
//		System.out.println("작업 스레드 이름 : "+ Thread.getName());
//		
//	}
//	
}
}
