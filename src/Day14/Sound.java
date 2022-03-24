package Day14;


public class Sound extends Thread{
	
	static boolean stop = true; // 실행 여부 true시작 false종료
	public static boolean soundstop;
	
	public static void soundstop(boolean stop) {
		if(stop) {
			System.out.println("소리재생시작");
		}else {
			System.out.println("소리재생종료");
		}
	}
	@Override
	public void run() {
		while(stop) { // stop이 true면 무한루프
			System.out.println("소리 재생중");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
