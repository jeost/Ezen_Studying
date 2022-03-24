package Day10;

public class Television implements RemoteControll, searchable{
	// 클래스명 implements 인터페이스명
	private int volume;
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControll.MAX_VOLUME) {
			this.volume=RemoteControll.MAX_VOLUME; // 최대볼륨설정
		}else if(volume<RemoteControll.MIN_VOLUME) {
			this.volume=RemoteControll.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 tv 볼륨 : " + this.volume);
	}@Override
	
	public void turnOff() {
	System.out.println("tv를 켭니다");	
	
	}@Override
	public void turnOn() {
		System.out.println("tv를 끕니다");
	}
	@Override
	public void search(String url) {
		System.out.println(url +"을 검색합니다.");
	}
	@Override // 디폴트 메소드도 재정의 가능
	public void setMute(boolean mute) {
		RemoteControll.super.setMute(mute);
	}
}
