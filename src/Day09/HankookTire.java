package Day09;

public class HankookTire extends Tire { // c s
	//필드
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
	@Override // 슈퍼클래스 내 메소드 재정의
	public boolean roll() { // 타이어 회전 메소드 구현
		++accumulatedRotation; // 누적 회전수 1 증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "HankookTire 수명 : " + (maxRotation-accumulatedRotation)+"회");
			return true; // 정상회전
		}else {
			System.out.println("***" + location+ " HankookTire 펑크 ***");
			return false; // 펑크
		}
	}
} // c e
