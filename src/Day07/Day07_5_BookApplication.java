package Day07;

import java.util.Scanner;

public class Day07_5_BookApplication { // c s
		//��� �޼ҵ忡�� �������� main �ۿ� ����
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[100];
	static Book[] books = new Book[100];
	public static void main(String[] args) { // m s
		Day07_5_BookApplication application = new Day07_5_BookApplication();	// �޼ҵ� ȣ��
		application.menu();
		
	} // m e
	
	// 1. �ʱ� �޴� �޼ҵ�
		// ��ü ����(�޸��Ҵ�) -> �޼ҵ� ȣ��
		
		
	void menu() {// menu s
		while (true) {
			System.out.println("-----------���� �뿩 ���α׷�------------");
			System.out.println("1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã��"); int ch1 = scanner.nextInt();
			Member member = new Member(); // 1~4 ���ο��� ��� 
			if (ch1 == 1) { // ȸ������
				boolean result = member.ȸ������();
				if(result) { System.out.println("ȸ������ ����");}
				else {System.out.println("�α��� ����");}
			}else if (ch1 == 2) { // �α��� 1. �Ϲ�ȸ�� �޼ҵ� 2. ������ �޼ҵ�
			String result = member.�α���(); // �α��� �޼ҵ� ȣ��
			if(result == null) { // �α��ν���
				System.out.println("������ ȸ�������� �����ϴ�");
			}
			else if(result.equals("admin")) { // �����ڸ� �����ڸ޴� ȣ��
				System.out.println(result + "�� �������");
				adminmenu();
			}
			else { // �Ϲ���
				System.out.println("����" + result);
				membermenu(result);
			}
			}else if (ch1 == 3) { // idã��
			member.���̵�ã��();
			}else if (ch1 == 4) { // pwã��
			member.��й�ȣã��();
			}else {System.out.println(" �� �� ���� �Է� ");}
			} // menu e
		}
	
	// 2. �Ϲ� ȸ�� �޴� �޼ҵ�
	void membermenu(String loginid) { // m menu s �μ��� �������� ����
		while(true) {
			Book book = new Book();
			System.out.println("---------�޴�----------");
			System.out.println("1. �����˻� , 2. ������� , 3. �����뿩 , 4. �����ݳ� , 5. �α׾ƿ�"); int ch = scanner.nextInt();
			if (ch == 1) { 
				book.�����˻�();
			}else if (ch == 2) { 
				book.�������();
			}else if (ch == 3) { 
				book.�����뿩(loginid);
			}else if (ch == 4) { 
				book.�����ݳ�(loginid);
			}else if (ch == 5) {
				return;
			}else {System.out.println("�� �� ���� �Է�");}
		}
	} // m menu e
	// 3. ������ �޴� �޼ҵ�
	void adminmenu() { // admin s
		while(true) { // while s
		Book book = new Book();
		System.out.println("----------������ �޴�----------");
		System.out.println(" 1. ������� , 2. ������� , 3. �������� , 4. �α׾ƿ�"); int ch = scanner.nextInt();
		if (ch == 1) { 
			book.�������();
		}else if (ch == 2) { 
			book.�������();
		}else if (ch == 3) { 
			book.��������();
		}else if (ch == 4) { 
			return;
		}else {System.out.println("�� �� ���� �Է�");}
	
		} // while e
	} // admin e
} // c e
