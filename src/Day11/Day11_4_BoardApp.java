package Day11;

import java.util.Scanner;

public class Day11_4_BoardApp { // c s
	// �Խ���
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Controller.boardLoad();
		
		while(true) {
			try { // ����ڰ� ���� �Է½� ���ܰ� �߻��� catch�� �̵�
				// ��� �Խù� ���
			System.out.printf("%s\t%s\t%s\t%s\t%s\t \n" , "��ȣ" , "����" , "�ۼ���" , "�ۼ���" , "��ȸ��");
			int i = 0;
			for(Board board : Controller.boardlist) {
				System.out.printf("%s\t%s\t%s\t%s\t%s\t \n" , i, board.getTitle(), board.getWriter(), board.getDate(), board.getViewcount());
			i++;}
			System.out.println("1. ���� 2. ���� ���� : ");
			int ch = scanner.nextInt();
			if( ch == 1) {
				System.out.println(" �Խù� ��� ");	
				scanner.nextLine();
				System.out.println(" ���� : ");	String ���� = scanner.nextLine();
				System.out.println(" ���� : ");	String ���� = scanner.nextLine();
				System.out.println(" �ۼ��� : "); String �ۼ��� = scanner.next();
				System.out.println(" ��й�ȣ[����/������] : "); String ��й�ȣ = scanner.next();
				Controller.write(���� , ���� , �ۼ��� , ��й�ȣ); // �μ� ����
			}
			else if(ch == 2) { // ��� �Խù����� ���
				
				System.out.println("������� �Խù� ��ȣ : "); int num = scanner.nextInt();
				Board temp = Controller.boardlist.get(num); // �ش� �ε����� ��ü�� �� ���ͼ� �ӽð�ü�� ���
				System.out.printf("%s\t%s\t%s\t%s\t%s\t \n", num, temp.getTitle(), temp.getWriter(), temp.getDate(), temp.getViewcount());
				
				//������[���߿�]
				
				//�޴�
				System.out.println("1. �ڷΰ��� 2. ���� 3. ���� 4. ��۾��� ���� : "); int ch2 = scanner.nextInt();
				if(ch2==1) {} // ���θ� �ڷΰ�(������ �ö�)
				else if(ch2==2) { // ����
					System.out.println("������ �Խù� ��й�ȣ �Է� :"); String pw = scanner.next();
					scanner.nextLine();
					System.out.println("������ ���� :"); String title = scanner.nextLine();
					System.out.println("������ ���� :"); String content = scanner.nextLine();
					boolean result = Controller.update(num, pw, title, content); // ������ �ε��� ��ȣ, ��й�ȣ, ����, ���� �Է¹޾� �μ��� ����
					if(result == true) {System.out.println("���� ����");}
					else {System.out.println("��й�ȣ ����");}
				}
				else if(ch2==3) { // ����
					System.out.println("������ �Խù� ��й�ȣ �Է� : "); String pw = scanner.next();
					boolean result = Controller.delete(num, pw); // ������ �ε��� ��ȣ, ��й�ȣ
					if (result == true) System.out.println("���� ����");
					else {System.out.println("��й�ȣ ����");}
				}
				else if(ch2==4) { // ���
					System.out.println("��� ���� �Է� : "); String comment = scanner.nextLine();
					System.out.println("�̸� �Է� : "); String rName = scanner.next();
					System.out.println("��� ��й�ȣ �Է� : "); String rPw = scanner.next();
					Controller.replyWrite(comment, rName, rPw); // �Խù� �ε��� ��ȣ, ��� ����, ��� �ۼ���, ��� ��й�ȣ �Է¹ޱ�
				}
				else {System.out.println("1~4�߿� �Է�");}
			}
			else {}
			}catch(Exception e) {
			System.out.println("�Է� ����" + e); 
			scanner = new Scanner(System.in); // ���� ������ ������ ����� ���� ���� �ޱ�
			}
		} // while e
	}// m e
} // c e
