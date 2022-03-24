package Day14;


public class 강아지소리 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("멍");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
