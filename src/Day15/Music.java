package Day15;

public class Music extends Thread{
	@Override
	public void run() {
		//����ó�� ����
		while(true) {
			
			System.out.println("�����");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
