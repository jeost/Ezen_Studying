package Day14;


public class Sound extends Thread{
	
	static boolean stop = true; // ���� ���� true���� false����
	public static boolean soundstop;
	
	public static void soundstop(boolean stop) {
		if(stop) {
			System.out.println("�Ҹ��������");
		}else {
			System.out.println("�Ҹ��������");
		}
	}
	@Override
	public void run() {
		while(stop) { // stop�� true�� ���ѷ���
			System.out.println("�Ҹ� �����");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
