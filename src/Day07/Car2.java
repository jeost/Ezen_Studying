package Day07;

public class Car2 {

	// 1. �ʵ�
	int speed;
	// 2. ������
		// ��� �⺻������
	// 3. �޼ҵ�
	
		// ���� �ʵ尪 ��ȯ �޼ҵ�
	int getSpeed() { // �μ� x ��ȯ x
		return speed;
	}
		// ��� �޼ҵ�
	void KeyTurnOn() { // �μ�x ��ȯx
		System.out.println(" Ű�� �����ϴ�. ");
	}
		// ���ǵ� ���� �޼ҵ�
	void run() { // �μ� x ��ȯ x
		for( int i = 10; i<=50; i+=10) {
			speed = i;
			System.out.println("�޸��ϴ�. (�ü� : " + speed+"km/h");
		}
	}
}
