package Day09;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); // 슈퍼클래스 내 생성자 호출[코드 줄이기]
	}
	//메소드
	@Override
	public boolean roll() { // 타이어 회전 메소드 구현
		++accumulatedRotation; // 누적 회전수 1 증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "KumhoTire 수명 : " + (maxRotation-accumulatedRotation)+"회");
			return true; // 정상회전
		}else {
			System.out.println("***" + location+ " KumhoTire 펑크 ***");
			return false; // 펑크
		}
	}
} // c e