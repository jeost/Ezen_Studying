package Day08;

import java.util.Arrays;
import java.util.Scanner;

public class Day08_05 {

	// ����� ��ũ ���α׷� [ 2�� ���� ] 
		// �䱸����
		// ȸ�� �ֿ���: 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
		// �ֿ���: 1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.���¸�� 7.�α׾ƿ�
		// 5.����: 1.���Ⱑ�� 2. �����ȯ 3.��������� 4.�ڷΰ���
		// ���� : ����, ����, ȸ��
			// �ʵ�
				//����: 1.ȸ����ȣ 2.���¹�ȣ 3.�ܾ� 4.���������
				//ȸ��: 1.ȸ����ȣ 2.���̵� 3.��й�ȣ 4.�̸� 5.����ó
				//����: 1.���¹�ȣ 2.������ 3.ȸ����ȣ 4.���������
			// �޼ҵ� 
				//ȸ�� :

	static Scanner scanner = new Scanner(System.in);
	static Member[] member = new Member[100];// ������ �迭����
	static Bank[] bank = new Bank[100];// ������ �迭����
	Bank banks = new Bank();
	static Long[] longs = new Long[100];// �����������
	
	
	public static void main(String[] args) {
		Day08_05 menu = new Day08_05();
		menu.menu();
		
	}// me
	
	void menu() {// �ʱ�޴� 
		while (true) { // ���α׷� ����
			System.out.println("---------------------------����� ��ũ ���α׷�---------------------------");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��"); int ch = scanner.nextInt();
			Member member = new Member();
			if(ch == 1) {// 1.ȸ������
				boolean result = member.SignUp();
				if(result) {
					System.out.println("���Լ��� ȯ���մϴ�");
				}else {
					System.out.println("���Խ���");
				}
			}else if(ch == 2){// 2.�α���
				String[] result = member.iogin();
				if(result == null) {
					System.out.println("�α��ν��� ��ġ�ϴ� ȸ���� �����ϴ�");
				}else {//�α��μ���
					System.out.println("�α��μ���");
					login_menu(result);
				}
			}else if(ch == 3){// 3.���̵�ã��
				member.idfind();
			}else if(ch == 4){// 4.��й�ȣã��
				member.pwfind();
			}else {//�׿�
				System.out.println("�˼����� �ൿ");
			}// ��������	
			
		}//while end
	}// �ʱ�޴� ����
	
	void login_menu(String[] result) {// �α��θ޴�
		while (true) {
			System.out.println("---------------------------����� ��ũ ���α׷�---------------------------");
			System.out.println("1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.���¸��"); int ch = scanner.nextInt();
			Long longs = new Long();
			if(ch == 1) {// 1.���»���
				banks.���»���(result);
			}else if(ch == 2){// 2.�Ա�
				banks.�Ա�(result);
			}else if(ch == 3){// 3.���
				banks.���(result);
			}else if(ch == 4){// 4.��ü
				banks.��ü(result);
			}else if(ch == 5){// 5.����
				login_menus(result);
			}else if(ch == 6){// 6.���¸��
				banks.���¸��(result);
			}else if(ch == 7){// 7.�α׾ƿ�
				break;
			}else {// �׿�
				System.out.println("�˼������ൿ");
			}
		}// while end
	}// �α��� �޴� end
	// 5.����: 1.���Ⱑ�� 2. �����ȯ 3.��������� 4.�ڷΰ���
	void login_menus(String[] result) {
		Long longs = new Long();
		while (true) {
			System.out.println("--------------------------------���� ������--------------------------------");
			System.out.println("1.���Ⱑ�� 2. �����ȯ 3.��������� 4.�ڷΰ���"); int ch = scanner.nextInt();
			if(ch == 1) {// ���Ⱑ��
				longs.Management(result);
			}else if(ch == 2) { // �����ȯ
				longs.Repayment(result);
			}else if(ch == 3) {// ���������
				longs.LoanAmount(result);
			}else if(ch == 4) {// �ڷΰ���
				break;
			}else {//�׿�
				System.out.println("�˼������ൿ");
			}
			
		}
	}
	
	
}// ce
