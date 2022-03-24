package Day10;

public class Audio implements RemoteControll{

	// 필드
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
			System.out.println("현재 Audio 볼륨 : "+this.volume);
	}@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
}
