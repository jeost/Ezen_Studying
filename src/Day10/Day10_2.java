package Day10;

public class Day10_2 {
	public static void main(String[] args) {
	

	RemoteControll rc;
	
	rc = new Television();
	
	rc.turnOn(); // tv ����
	rc.turnOff(); // tv ����
	rc.setVolume(10); // tv ���� ���� 
	System.out.println("������ �ڷ�����->�����");
	rc = new Audio();
	rc.turnOn();
	rc.turnOff();
	rc.setVolume(5);
	
	//�͸�����ü
	RemoteControll rc2 = new RemoteControll() {
		
		@Override
		public void turnOn() {
			System.out.println("�������� �մϴ�");
		}
		
		@Override
		public void turnOff() {
			System.out.println("�������� ���ϴ�");
		}
		
		@Override
		public void setVolume(int volume) {
			System.out.println("���� ���� : " + volume);
		}
	};
	
	rc2.turnOn();
	rc2.turnOff();
	rc2.setVolume(10);
	
	//����Ʈ �޼ҵ� ȣ��
	rc2.setMute(true); // �������̽����� �̹� ������ �� �޼ҵ�
	
	//���� �޼ҵ� ȣ��
	RemoteControll.changeBattery(); // ��ü ����
	}		
}
