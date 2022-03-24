package Day07;

public class Calculator { // c s

	void powerOn() { // 인수 x 반환 x
		System.out.println("전원을 켭니다.");
	}
	
	int plus( int x , int y ) {
		int result = x+y;
		return result; // 함수 호출한 곳으로 반환
	}
	
	
	double divide(int x, int y) { //인수o반환o
//  리턴타입	메소드명	//(인수1, 인수2) {실행코드; return 실수값}
		double result = (double)x / (double)y;
			// 강제 형변환 해야 소숫점 나와도 커버가능
		return result; // 결과값이 메소드 호출한곳으로 이동
	}
	void powerOff() { //인수x반환x
		//리턴타입 메소드명 () {}
		System.out.println("전원을 끕니다.");
	}
} // c e
