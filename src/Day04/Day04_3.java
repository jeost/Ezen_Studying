package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 { // c s
	
	public static void main(String[] args) { // m s
		
		Scanner scanner=new Scanner(System.in);
		int player; // ������� ���� ����
		int computer; // ��ǻ���� ���� ����
		int game = 0; // �� ���Ӽ� ����
		int win = 0; // �¸��� ����
		int lose = 0; // �й�� ����
		while(true) { // ���α׷� ���� [ ���ѷ��� ���� ���� : 3�� �Է½� ]
			System.out.println("���������� ����");
			System.out.println("����(0) ����(1) ��(2) ����(3) ���� : ");
			player = scanner.nextInt(); // �Է��� �� ����
			System.out.println(" �Է� : " + player);
			
			Random random = new Random(); // ���� ��ü ����
					//random.nextInt() : int ���� ���� ���� �߻�
					//random.nextInt(n) : 0���� n ������ ������ ���� �߻�
					//random.nextInt(a)+b : b���� (a+b) ������ ���� �� ���� �߻�
			computer = random.nextInt(3); // ������ ����(int��)���� ��������
			if (player == 3) { // ����
				System.out.println(" �������� ");
				System.out.println(" �� ���Ӽ� : " + game);
				if(player > computer) {System.out.println("���� ���� : �÷��̾�");}
				else if(player<computer) {System.out.println("���� ���� : ��ǻ��");}
				else System.out.println("���� : ���º�");
			break;			}
			
			else if(0<=player && player <=2) {
					if (		(player == 0 && computer == 1) ||
					(player == 1 && computer == 2) ||
					(player == 2 && computer == 0)
					) { // �¸�
				win++;
				game++;
				System.out.println("�¸�");
			}else if(player == computer) { // ��� 
				game++;
				System.out.println("���º�");
			}
									
			else { // �й�
					lose++;
					game++;
					System.out.println("�й�");
				}
			System.out.println("�¸� : " + win);
			System.out.println("�й� : " + lose);
			}
			else {System.out.println("�� �� ���� �Է�");}
		} // while 1 end
			 
		
		
		
		
		
	} // m e
} // c e
