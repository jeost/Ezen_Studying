package Day15;

public class TargetThread extends Thread{
	//����ó��
	@Override
	public void run() {
		for(long i = 0; i<10000000; i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {e.printStackTrace();}
			
		}for(long i=0; i<10000000; i++) {	}
	}
}
