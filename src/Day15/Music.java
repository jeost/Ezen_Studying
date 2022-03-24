package Day15;

public class Music extends Thread{
	@Override
	public void run() {
		//병렬처리 실행
		while(true) {
			
			System.out.println("출력중");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
