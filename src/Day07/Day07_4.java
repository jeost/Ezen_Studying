package Day07;

public class Day07_4 {
	// p.229 외부호출
	public static void main(String[] args) {
		
		Car2 myCar = new Car2(); // 객체 선언
		//시동걸기 메소드 호출
		myCar.KeyTurnOn(); // 인수x 반환x
		
		//출발 메소드 호출
		myCar.run(); // 인수x 반환x
		
		//속도확인 메소드 호출
		int speed = myCar.getSpeed(); // 인수x 반환o
		System.out.println("현재 속도 :" + speed + "km/h");
	}
}
