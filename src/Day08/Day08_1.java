package Day08;

public class Day08_1 { // c s

	public static void main(String[] args) { // m s
		// Ŭ���� �� �ʵ�, �޼ҵ�(���) ���ٹ��
			// ( static ��� x) ��ü ���� �� ����� ����
		Calculator calculator = new Calculator();
		System.out.println("��ü�� �̿��� ������� : " + calculator.pi);
			// (static ��� o) Ŭ������.��� (�ٷ� ���ٰ���)
		System.out.println("��ü ���� ������� : " + calculator.pi);
		double result = 10*10*calculator.pi; //Ŭ������.����������
		int result2 = calculator.plus(10, 5);
		int result3 = calculator.minus(10, 5);
		System.out.println("result1 : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
	} // m e
} // c e
