package Day15;

public class User2 extends Thread{
	private Calculator calculator;
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	//병렬처리
	public void run() {
		calculator.setMemory(50);
	}
}