package Day09;

public class CellPhone { // c s

	// �ʵ�
	String model;
	String color;
	// ������
	
	// �޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void sendVoice(String message) {
		System.out.println("�ڱ�: " + message);
	}
	void recieveVoice(String message) {
		System.out.println("����: " + message);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
} // c e
