package Day10;

public interface RemoteControll { // �������̽� ����
	
	//��� ����
		// 1. ����ʵ�
	public int MAX_VOLUME = 10; // �ִ� ����
	public int MIN_VOLUME = 0; // �ּ� ����
		// 2. �߻�޼ҵ�* : ����o����x
	public void turnOn(); // �߰�ȣ ����(����x)
	public void turnOff();
	public void setVolume(int volume);
		// 3. ����Ʈ�޼ҵ� : ����o����o
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó��");
		}else {
			System.out.println("���� ����");
		}
	}
		// 4. �����޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
