package Day10;

public class Television implements RemoteControll, searchable{
	// Ŭ������ implements �������̽���
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
		System.out.println("���� tv ���� : " + this.volume);
	}@Override
	
	public void turnOff() {
	System.out.println("tv�� �մϴ�");	
	
	}@Override
	public void turnOn() {
		System.out.println("tv�� ���ϴ�");
	}
	@Override
	public void search(String url) {
		System.out.println(url +"�� �˻��մϴ�.");
	}
	@Override // ����Ʈ �޼ҵ嵵 ������ ����
	public void setMute(boolean mute) {
		RemoteControll.super.setMute(mute);
	}
}
