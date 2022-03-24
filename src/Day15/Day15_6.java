package Day15;

public class Day15_6 {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		
		statePrintThread.start();
	}
}
