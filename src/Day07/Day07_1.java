package Day07;

public class Day07_1 { // c s

	public static void main(String[] args) { // m s
		//객체 선언
		Calculator myCalc = new Calculator();
		//메소드 호출 [ 인수 없음 ]
		myCalc.powerOn();
		//메소드 호출 [ 인수 2개 ]
		int result1 = myCalc.plus(5, 6); // return받아 저장
			//plus 메소드에 5랑 6 전달 후
			// 11 받아서 변수에 저장
		System.out.println("result1 : " + result1);
	
		//메소드 호출[인수2개]
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x,y);
		System.out.println("result2 : " + result2);
	} // m e
	
} // c e
