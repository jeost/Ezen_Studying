package Day07;

public class Car2 {

	// 1. 필드
	int speed;
	// 2. 생성자
		// 없어서 기본생성자
	// 3. 메소드
	
		// 현재 필드값 반환 메소드
	int getSpeed() { // 인수 x 반환 x
		return speed;
	}
		// 출력 메소드
	void KeyTurnOn() { // 인수x 반환x
		System.out.println(" 키를 돌립니다. ");
	}
		// 스피드 증가 메소드
	void run() { // 인수 x 반환 x
		for( int i = 10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다. (시속 : " + speed+"km/h");
		}
	}
}
