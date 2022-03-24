package Day09;

public class Day09_5 {
	public static void main(String[] args) { // m s
		//1. 객체 생성 [자동차 1대]
		Car car = new Car();
			// 설계된 타이어객체 4개 => mycar 포함
		//2. 메소드 호출
		for(int i=1; i<=5; i++) { // for start
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1: System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15); // 슈퍼클래스 객체명=new 서브클래스(); 로 형변환 가능
				break;											// 단, 상속 받아야 가능
				case 2: System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
				case 3: System.out.println("앞왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
				case 4: System.out.println("앞왼쪽 KumhoTire로 교체");
				car.backLeftTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("-------------------------------");
		} // for end
	} // m e
}
