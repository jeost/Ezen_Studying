package Day14;


public class È£¶ûÀÌ¼Ò¸® extends Thread{
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("À¸¸£··");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
	}
}
