package Day15;

public class ThreadB extends Thread{
	public boolean stop = false; // 종료 스위치
	public boolean work = true; // 작업진행여부 플래그
	
	@Override
	public void run() {
		while(!stop) { // stop이 false면 무한루프
			if(work) {
				System.out.println("Thread B 작업 내용");
			}else {
				Thread.yield(); // 다른 스레드에 양보
			}
		} // while end
		System.out.println("ThreadB 종료");
	}
}
