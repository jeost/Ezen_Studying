package Day10;

public class Day10_2 {
	public static void main(String[] args) {
	

	RemoteControll rc;
	
	rc = new Television();
	
	rc.turnOn(); // tv 실행
	rc.turnOff(); // tv 종료
	rc.setVolume(10); // tv 볼륨 설정 
	System.out.println("리모콘 텔레비전->오디오");
	rc = new Audio();
	rc.turnOn();
	rc.turnOff();
	rc.setVolume(5);
	
	//익명구현객체
	RemoteControll rc2 = new RemoteControll() {
		
		@Override
		public void turnOn() {
			System.out.println("리모콘을 켭니다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("리모콘을 끕니다");
		}
		
		@Override
		public void setVolume(int volume) {
			System.out.println("현재 볼륨 : " + volume);
		}
	};
	
	rc2.turnOn();
	rc2.turnOff();
	rc2.setVolume(10);
	
	//디폴트 메소드 호출
	rc2.setMute(true); // 인터페이스에서 이미 구현이 된 메소드
	
	//정적 메소드 호출
	RemoteControll.changeBattery(); // 객체 없이
	}		
}
