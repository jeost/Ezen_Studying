package Day06;

public class Day06_2 { // c s

	public static void main(String[] args) { // m s
		// 1. 클래스 생성 후 객체 생성
		Car myCar = new Car(); // 객체 생성
			// 1. Car : 정의된 클래스 명
			// 2. myCar : 객체이름[ 아무거나 가능 ]
			// 3. new : 메모리 할당 연산자
			// 4. Car() 생성자
		
		// 2. 객체 내 필드 호출 ( . : 접근연산자 [객체 내 멤버 접근]
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : "+ myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
			// myCar 객체 내 필드 접근
			// 객체명.필드명 [.필드] : 필드 호출
		
		// 3. 객체 내 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
		
		// 새로운 자동차 객체 생성
		Car car = new Car();
		System.out.println("두번째 차 속도 : " + car.speed);
	} // m e
} // c e