package Day07;

public class Day07_2 { // c s
	public static void main(String[] args) { // m s
		//p. 223~224 : ���ϰ� ���� �޼ҵ�(void)
		
		// 1. ��ü ����
		Car mycar = new Car();
		// 2. �޼ҵ� ȣ�� [�μ� 1��]
		mycar.setGas(5);
		
		// 3. �޼ҵ� ȣ�� [ �μ�x ��ȯ�� = true or false ]
		if(mycar.isLeftGas() ) {
			System.out.println("�޸��ϴ�.");
		}
		
		// 4. �޼ҵ� ȣ�� [ �μ� x ]
		mycar.run();
		
		// 5. �޼ҵ� ȣ��
		if(mycar.isLeftGas() ) {
			System.out.println("gas�� ������ �ʿ� ����");
		}else {
			System.out.println("gas�� �����ϼ���");
		}
		
	} // m e
} // c e
