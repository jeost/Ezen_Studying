package Day15;

public class Chatting implements Runnable{
	@Override
	public void run() {
		//����ó�� ����
		while(true) {
			System.out.println("ä����");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
