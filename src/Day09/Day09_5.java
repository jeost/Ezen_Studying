package Day09;

public class Day09_5 {
	public static void main(String[] args) { // m s
		//1. ��ü ���� [�ڵ��� 1��]
		Car car = new Car();
			// ����� Ÿ�̾ü 4�� => mycar ����
		//2. �޼ҵ� ȣ��
		for(int i=1; i<=5; i++) { // for start
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1: System.out.println("�տ��� HankookTire�� ��ü");
				car.frontLeftTire = new HankookTire("�տ���", 15); // ����Ŭ���� ��ü��=new ����Ŭ����(); �� ����ȯ ����
				break;											// ��, ��� �޾ƾ� ����
				case 2: System.out.println("�տ����� KumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�տ�����", 13);
				break;
				case 3: System.out.println("�տ��� HankookTire�� ��ü");
				car.backLeftTire = new HankookTire("�ڿ���", 14);
				break;
				case 4: System.out.println("�տ��� KumhoTire�� ��ü");
				car.backLeftTire = new KumhoTire("�ڿ�����", 17);
				break;
			}
			System.out.println("-------------------------------");
		} // for end
	} // m e
}
