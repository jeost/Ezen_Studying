package Day07;

public class Day07_1 { // c s

	public static void main(String[] args) { // m s
		//��ü ����
		Calculator myCalc = new Calculator();
		//�޼ҵ� ȣ�� [ �μ� ���� ]
		myCalc.powerOn();
		//�޼ҵ� ȣ�� [ �μ� 2�� ]
		int result1 = myCalc.plus(5, 6); // return�޾� ����
			//plus �޼ҵ忡 5�� 6 ���� ��
			// 11 �޾Ƽ� ������ ����
		System.out.println("result1 : " + result1);
	
		//�޼ҵ� ȣ��[�μ�2��]
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x,y);
		System.out.println("result2 : " + result2);
	} // m e
	
} // c e
