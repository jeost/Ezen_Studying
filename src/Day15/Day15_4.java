package Day15;

public class Day15_4 {
	
	public static void main(String[] args) {
		
	
	Music m1 = new Music();
	m1.start();
	
	Chatting c1 = new Chatting();
	Thread thread = new Thread(c1);
	thread.start();
	
	while(true) {
		System.out.println("프로그램 작동중");
		try {Thread.sleep(500);
		
		}catch(Exception e) {
			System.out.println(e);
			}
		}
	}
}
