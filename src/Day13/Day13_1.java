package Day13;

public class Day13_1 {

	public static void main(String[] args) {
		
		System.out.println("���� : " + Math.abs(-5));
		System.out.println("���� : " + Math.abs(-3.14));
		
		System.out.println("�ø��� : " + Math.ceil(5.3)); // �Ҽ��� ù°�ڸ� �ø�
		System.out.println("�ø��� : " + Math.ceil(-5.3));
		
		System.out.println("������ : " + Math.floor(5.3));
		System.out.println("������ : " + Math.floor(-5.3));
		
		System.out.println("�ִ� : " + Math.max(5, 9)); // �� ū��
		System.out.println("�ִ� : " + Math.max(5.3, 2.5));
		
		System.out.println("�ּڰ� : " + Math.min(5, 9)); // �� ���� ��
		System.out.println("�ּڰ� : " + Math.min(5.3, 2.5));
		
		System.out.println("������ : " + Math.random()); // 0~1������ ���� �߻�
		
		System.out.println("����� ������ �Ǽ��� : " + Math.rint(5.3)); // �ݿø����� double���·�
		System.out.println("����� ������ �Ǽ��� : " + Math.rint(5.7));
		
		System.out.println("����� ������ ������ : " + Math.round(5.3)); // �ݿø����� int���·�
		System.out.println("����� ������ ������ : " + Math.round(5.7));
		
		double value = 12.3456;
		double temp1 = value*100;
		long temp2 = Math.round(temp1);
		double v16 = temp2/100.0; // double���¶� �Ҽ����ٿ�����
		System.out.println("v16 = " + v16);
		
		int num = (int)(Math.random()*6)+1;
		System.out.println(" 1~6������ ���� " + num);
	}
}
