package Day07;

public class Day07_4 {
	// p.229 �ܺ�ȣ��
	public static void main(String[] args) {
		
		Car2 myCar = new Car2(); // ��ü ����
		//�õ��ɱ� �޼ҵ� ȣ��
		myCar.KeyTurnOn(); // �μ�x ��ȯx
		
		//��� �޼ҵ� ȣ��
		myCar.run(); // �μ�x ��ȯx
		
		//�ӵ�Ȯ�� �޼ҵ� ȣ��
		int speed = myCar.getSpeed(); // �μ�x ��ȯo
		System.out.println("���� �ӵ� :" + speed + "km/h");
	}
}
