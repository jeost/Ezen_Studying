package Day06;

public class Day06_2 { // c s

	public static void main(String[] args) { // m s
		// 1. Ŭ���� ���� �� ��ü ����
		Car myCar = new Car(); // ��ü ����
			// 1. Car : ���ǵ� Ŭ���� ��
			// 2. myCar : ��ü�̸�[ �ƹ��ų� ���� ]
			// 3. new : �޸� �Ҵ� ������
			// 4. Car() ������
		
		// 2. ��ü �� �ʵ� ȣ�� ( . : ���ٿ����� [��ü �� ��� ����]
		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : "+ myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
		System.out.println("����ӵ� : " + myCar.speed);
			// myCar ��ü �� �ʵ� ����
			// ��ü��.�ʵ�� [.�ʵ�] : �ʵ� ȣ��
		
		// 3. ��ü �� �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ� : " + myCar.speed);
		
		// ���ο� �ڵ��� ��ü ����
		Car car = new Car();
		System.out.println("�ι�° �� �ӵ� : " + car.speed);
	} // m e
} // c e