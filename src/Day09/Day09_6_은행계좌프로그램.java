package Day09;

import java.util.ResourceBundle.Control;
import java.util.Scanner;

public class Day09_6_����������α׷� { // c s

	//����������α׷�[���]
		//����[super]
		//����,����,�ϳ�����[sub]
		//�� ��� : 1.���»��� 2.�Ա� 3.��� 4.��ü 5.�����¸�� 6.����
	public static Bank[] ���¸���Ʈ = new Bank[100]; // main �ۿ��� �����ؼ� �׻� ���ְ�
	public static void main(String[] args) { // m s
		Scanner scanner = new Scanner(System.in);
		
		while(true) { // while s
			System.out.println("---------���� �ý���---------");
			System.out.println("1.���»��� 2.�Ա� 3.��� 4.��ü 5.�����¸�� 6.����"); int select = scanner.nextInt();
			BankController bankController = new BankController();
			if(select == 1) {
				System.out.println("���µ�� ������");
				System.out.println("��й�ȣ �Է� : "); String pw = scanner.next();
				System.out.println("������ : "); String bankbookO = scanner.next();
				System.out.println("���༱�� : 1.���� 2.���� 3.�ϳ�"); int bankselect = scanner.nextInt();
				String ���¹�ȣ = bankController.���»���(pw, bankbookO, bankselect); // �޼ҵ� ��ȯ ���� ���¹�ȣ or null
				if ( ���¹�ȣ != null ) { // ���¹�ȣ�� null�� �ƴϸ�
					System.out.println("���� ���� �Ϸ�");
				}else { // ���¹�ȣ�� null�̸�
					System.out.println("���µ�� ����");
				}
			}else if(select == 2) {
				System.out.println("�Ա� ������");
				System.out.println(" �Ա��� ���¹�ȣ �Է� : "); String bankbookN = scanner.next();
				System.out.println(" �Աݾ� �Է� : ");		int money = scanner.nextInt();
				boolean �Աݿ���=bankController.�Ա�(bankbookN , money);
				if(�Աݿ���) {System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");}
				else {System.out.println("�Ա��� �����Ͽ����ϴ�.");}
				
			}else if(select == 3) {
				System.out.println("��� ������");
				System.out.println("���¹�ȣ : "); String bankbookN = scanner.next(); 
				System.out.println("��й�ȣ : "); String pw = scanner.next();
				System.out.println("��ݾ� : "); int money = scanner.nextInt();
				byte result = bankController.���(bankbookN, pw, money);
				if(result == 1) {
					System.out.println("�ܾ� ����");
				}else if(result == 2) {
					System.out.println("��� ����");
				}else if(result == 3) {
					System.out.println("�Է����� ����");
				}
			}else if(select == 4) {
				System.out.println("��ü ������");
				System.out.println("����� ���� �Է� : "); String bankbookN = scanner.next();
				System.out.println("��й�ȣ �Է� : "); String pw = scanner.next();
				System.out.println("��ü�� ���� �Է� : "); String bankbookN2 = scanner.next();
				System.out.println("��ü�� �Է� : "); int money = scanner.nextInt();
				byte result = bankController.��ü(bankbookN , pw , bankbookN2 , money);
				if(result == 1) {
					System.out.println("��ü ����");
				}else if(result == 2) {
					System.out.println("�ݾ��� �����մϴ�.");
				}else if(result == 3) {
					System.out.println("��� ���°� �����ϴ�.");
				}else if(result == 4) {
					System.out.println("�� ���� ������ �ٸ��ϴ�.");
				}
			}else if(select == 5) {
				System.out.println("�� ���¸�� ������");
				System.out.println("������ : "); String bankbookO = scanner.next();
				Bank[] �����¸�� = bankController.���¸��(bankbookO);
				System.out.println(bankbookO+"���� ���¸�� ");
				int i =1;
				for(Bank temp : �����¸��) {
					if( temp != null) {
						System.out.println(i+"�� ���¹�ȣ : " +temp.getBankbookN());
					}
				}
			}else if(select == 6) {
				System.out.println("���� ������");
			}else {
				System.out.println("�� �� ���� �Է�");
			}
			
		} // while e
		
	} // m e
	
} // c e
