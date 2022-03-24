package Day15;

public class Day15_7 {
	public static void main(String[] args) {
//		ThreadA threadA = new ThreadA();
//		ThreadB threadB = new ThreadB();
//		
//		threadA.start();
//		threadB.start();
//		
//		try { Thread.sleep(3000);}
//		catch(InterruptedException e) {}
//		threadA.work = false;
//		
//		try { Thread.sleep(3000);}
//		catch(InterruptedException e) {}
//		threadA.work = true;
//		
//		try { Thread.sleep(3000);}
//		catch(InterruptedException e) {}
//		threadA.stop = true;
//		threadB.stop = true;
//		
//		threadA.stop(); // 비권장 메소드
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		}catch(InterruptedException e) {
			
		}
		
		System.out.println("1~100 합 : " + sumThread.getSum());
	}
}
