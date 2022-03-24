package Day08;

public class Day08_1 { // c s

	public static void main(String[] args) { // m s
		// 클래스 내 필드, 메소드(멤버) 접근방법
			// ( static 멤버 x) 객체 생성 후 멤버에 접근
		Calculator calculator = new Calculator();
		System.out.println("객체를 이용한 멤버접근 : " + calculator.pi);
			// (static 멤버 o) 클래스명.멤버 (바로 접근가능)
		System.out.println("객체 없이 멤버접근 : " + calculator.pi);
		double result = 10*10*calculator.pi; //클래스명.정적변수명
		int result2 = calculator.plus(10, 5);
		int result3 = calculator.minus(10, 5);
		System.out.println("result1 : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
	} // m e
} // c e
