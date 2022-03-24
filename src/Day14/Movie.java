package Day14;


public class Movie extends Thread{

	static boolean stop = true; // 실행/종료 제어 역할
	
	public static void Moviestop(boolean stop) {
		if(stop) {System.out.println("영상 재생");}
		else {System.out.println("영상 종료");}
	}
	@Override
	public void run() {
		while(stop) {
			System.out.println("");
		}
	}
}
