package Day10;

public class Audio implements RemoteControll{

	// �ʵ�
	private int volume;
	@Override
	public void setVolume(int volume) {
			if(volume > RemoteControll.MAX_VOLUME) {
				this.volume=RemoteControll.MAX_VOLUME; // �ִ뺼������
			}else if(volume<RemoteControll.MIN_VOLUME) {
				this.volume=RemoteControll.MIN_VOLUME;
			}else {
				this.volume=volume;
		}
			System.out.println("���� Audio ���� : "+this.volume);
	}@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
}
