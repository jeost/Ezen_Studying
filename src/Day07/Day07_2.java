package Day07;

public class Day07_2 { // c s
	public static void main(String[] args) { // m s
		//p. 223~224 : 리턴값 없는 메소드(void)
		
		// 1. 객체 선언
		Car mycar = new Car();
		// 2. 메소드 호출 [인수 1개]
		mycar.setGas(5);
		
		// 3. 메소드 호출 [ 인수x 반환값 = true or false ]
		if(mycar.isLeftGas() ) {
			System.out.println("달립니다.");
		}
		
		// 4. 메소드 호출 [ 인수 x ]
		mycar.run();
		
		// 5. 메소드 호출
		if(mycar.isLeftGas() ) {
			System.out.println("gas를 주입할 필요 없음");
		}else {
			System.out.println("gas를 주입하세요");
		}
		
	} // m e
} // c e
