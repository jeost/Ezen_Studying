package Day14;


public class Movie extends Thread{

	static boolean stop = true; // ����/���� ���� ����
	
	public static void Moviestop(boolean stop) {
		if(stop) {System.out.println("���� ���");}
		else {System.out.println("���� ����");}
	}
	@Override
	public void run() {
		while(stop) {
			System.out.println("");
		}
	}
}
