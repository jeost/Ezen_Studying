package Day09;

public class Day09_2 { // c s
	public static void main(String[] args) { // m s
	
		// p.290 ~ 292 ����
		// 1. ����Ŭ������ ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		// 2. ����Ŭ������ ��ü ����
		System.out.println(" �� : " + dmbCellPhone.model);
		System.out.println(" ���� : " + dmbCellPhone.color);
		
		// 3. ����Ŭ������ ������� ��ü�� ���� �������
		System.out.println(" ä�� : " + dmbCellPhone.channel);
		
		// 4. ����Ŭ������ ������� ��ü�� ����Ŭ���� �� ���[�޼ҵ�] ����
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.recieveVoice("�ȳ��ϼ���");
		dmbCellPhone.sendVoice("�ݰ����ϴ�");
		dmbCellPhone.hangUp();
		
		//�޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDMb();
	} // m e
} // c e
