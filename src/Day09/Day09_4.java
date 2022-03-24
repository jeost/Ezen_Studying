package Day09;

public class Day09_4 {

	public static void main(String[] args) {
		// p.296~297
		int r=10;
		// 슈퍼클래스로 객체 생성
		Calculator calculator = new Calculator();
		// 슈퍼클래스로 만든 객체로 메소드를 호출
		System.out.println(" 원 넓이 : " + calculator.areaCircle(r));
		System.out.println();
		
		// 서브클래스로 객체 생성
		Computer computer = new Computer();
		System.out.println(" 원 넓이 : " + computer.areaCircle(r));
	}
}