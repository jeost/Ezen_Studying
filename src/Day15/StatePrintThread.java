package Day15;

public class StatePrintThread extends Thread{
	
	//필드
	private Thread targetThread;
	//생성자
	public StatePrintThread(Thread targetThread) {
	this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
	Thread.State state = targetThread.getState();
	System.out.println("타겟 스레드의 상태 : " +state);
	
	if(state == Thread.State.NEW) {
		targetThread.start();
		}
	if(state == Thread.State.TERMINATED) {
		break;}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
	}
}
