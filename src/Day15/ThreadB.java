package Day15;

public class ThreadB extends Thread{
	public boolean stop = false; // ���� ����ġ
	public boolean work = true; // �۾����࿩�� �÷���
	
	@Override
	public void run() {
		while(!stop) { // stop�� false�� ���ѷ���
			if(work) {
				System.out.println("Thread B �۾� ����");
			}else {
				Thread.yield(); // �ٸ� �����忡 �纸
			}
		} // while end
		System.out.println("ThreadB ����");
	}
}
