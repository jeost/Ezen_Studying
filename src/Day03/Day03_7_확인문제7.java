package Day03;

import java.util.Scanner;

public class Day03_7_Ȯ�ι���7 { // c s
	public static void main(String[] args) { // m s
		Scanner scanner=new Scanner(System.in);
		//���� ����[��� ������ ���Ÿ� �ۿ��� ����]
		boolean run = true; // ���� ���� ���� / true=���� false=����
		
		int balance = 0; // ���ݾ� ����
		
		while(run) { //while(���ǽ�) { }: ���ѷ���
			System.out.println("-------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("-------------------");
			System.out.println("����>"); int ���� = scanner.nextInt();
			if( ���� == 1 ) { // �Է°��� 1
				System.out.println("���ݾ� : "); int ���ݾ� = scanner.nextInt();
				balance += ���ݾ�; //�Ա�
			}
			else if( ���� == 2) { // �Է°��� 2
				System.out.println("��ݾ� : "); int ��ݾ� = scanner.nextInt();
				 
				//���� ��ݾ�>���ݾ��̸� �ܾ׺���
				if (��ݾ�>balance) { System.out.println("�˸�)�ܾ��� �����մϴ�.");}
				//�ƴϸ� ��ݽ���
				balance -= ��ݾ�; //���
			}
			else if( ���� == 3) { // �Է°��� 3
				System.out.printf("�ܰ� : %d" , balance ); 
				
			}
			else if( ���� == 4) { // �Է°��� 4
				break; // while ���ѷ��� Ż��
			}
			else { //�� ��
			System.out.println("����");
			}
		}// while owari
		
		
		System.out.println("���α׷� ����");
		
	} // m e
} // c e
