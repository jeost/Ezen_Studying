package Day09;
//슈퍼 클래스로 사용
public class Tire { // c s
	//필드
	public int maxRotation; // 최대 회전수
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//메소드
	public boolean roll() { // 타이어 회전 메소드 구현
		++accumulatedRotation; // 누적 회전수 1 증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation-accumulatedRotation)+"회");
			return true; // 정상회전
		}else {
			System.out.println("***" + location+ " Tire 펑크 ***");
			return false; // 펑크
		}
	}
} // c e
