package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_�޷� {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� : "); int year = scanner.nextInt();
		System.out.println("�� : "); int month = scanner.nextInt();
		//Ķ���� Ŭ���� �� ��ü ȣ��
		�޷�(year, month);
		
	} // m e
	
	//�޷� �޼ҵ�
	public static void �޷�(int year, int month){ // �� s
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		// ���� �� ��
//			int year = calendar.get(calendar.YEAR);
//			int month = (calendar.get(calendar.MONTH)+1);
		while(true) {
		int day = calendar.get(calendar.DAY_OF_MONTH);
		// �ش� ���� 1���� ����ã��
			// ����� ���� Ķ���� ����
			calendar.set(year, month-1, 1); // ���� ���� 1�Ϸ� ����
			
			int sweek = calendar.get(Calendar.DAY_OF_WEEK); //3�� 1���� ���� ���ϱ�
		
			int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH); // 3���� ������ �� ���ϱ�
			
		//���
		System.out.println("****" + year + "��" + month + "�� ****");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		// ���� ���� 1���� ��ġ ���� ���� ä���
		for(int i = 1; i<sweek; i++) { // sweek�� 3
			System.out.print("\t");
		}
		for(int i = 1; i<=eday; i++) { // ������ �� ���� ���
			System.out.print(i+"\t");
			//����ϸ��� �ٹٲ�ó�� �ؾ���[7���]
			if(sweek%7 == 0) {
			System.out.print("\n");	
			}
			sweek++;
		}
		//��ư [ 1. ������ 2. ������ 3. �ٽð˻� ]
		try {
		System.out.println("1. ������ 2. ������ 3. �ٽð˻� 4. ����");
		int ch = scanner.nextInt();
		
		switch (ch) {
		case 1 : month-=1; if( month == 0) {year -= 1; month=12;} break; 
		case 2 : month+=1; if(month == 13) { month = 1; year +=1;} break;
		case 3 : System.out.println("���� : "); year = scanner.nextInt(); System.out.println(" �� : "); month = scanner.nextInt();
		case 4 : return; // �޼ҵ� ����
			}
		}catch (Exception e) { System.out.println("����� �Է�");
			}
		}
	} // �� e
} // c e
