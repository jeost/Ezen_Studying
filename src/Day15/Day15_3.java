package Day15;

import java.util.Scanner;

public class Day15_3 {
	
	public static void main(String[] args) {
		Car car = new Car();
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.println("1. ���� 2. ����");
		int ch = scanner.nextInt();
		
		if ( ch == 1) {
			//������ȣ �Է¹ޱ�
			String carNum = scanner.next();
			//�Է¹��� ������ȣ�� Controller �� �޼ҵ�� �ѱ��
			Controller.����(carNum);
			//�޼ҵ� ����� ���� ��� ���
			boolean result1 = Controller.����(carNum);
		}else if (ch == 2) {
			//������ȣ �Է¹ޱ�
			//�Է¹��� ������ȣ�� Controller �� �޼ҵ�� �ѱ��
			//�޼ҵ� ����� ���� ��� ���
		}
		} // while e
	} // m e
} // c s
