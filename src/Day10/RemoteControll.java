package Day10;

public interface RemoteControll { // 인터페이스 선언
	
	//멤버 구성
		// 1. 상수필드
	public int MAX_VOLUME = 10; // 최대 볼륨
	public int MIN_VOLUME = 0; // 최소 볼륨
		// 2. 추상메소드* : 선언o구현x
	public void turnOn(); // 중괄호 생략(구현x)
	public void turnOff();
	public void setVolume(int volume);
		// 3. 디폴트메소드 : 선언o구현o
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		}else {
			System.out.println("무음 해제");
		}
	}
		// 4. 정적메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
