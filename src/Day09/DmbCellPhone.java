package Day09;

public class DmbCellPhone extends CellPhone { // c s
	//����Ŭ������ ����Ŭ���� ����
	//�ʵ�
	int channel;
	//������
	DmbCellPhone(String model, String color, int channal) {
		this.model = model;
		this.color = color;
		// ���� Ŭ������ ���� �ʵ�� ����Ŭ���� �� ����� ȣ��
		this.channel = channel;
	}
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println(" ä�� : " +channel+ "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDMb() {
		System.out.println(" DMB ��� ������ ����ϴ�.");
	}
} // c e
