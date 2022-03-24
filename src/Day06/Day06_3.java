package Day06;

import java.util.Scanner;

public class Day06_3 { // c s

	public static void main(String[] args) { // m s
	
		Member member = new Member();
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100]; // �ʵ� 4���� ��ü 1���� �ٲ㼭 �ڵ� ����ȭ
		// Member Ŭ������ ������� ��ü(id,pw,name,phone) ���� 100���� ���� ������ �迭 ����
		
		while(true) { // ���α׷� while start[ �������� x ]
			
			System.out.println("-----------ȸ����[Ŭ����]--------------");
			System.out.println("1. ȸ������ 2. �α��� 3. ���̵�ã�� 4 ��й�ȣã��");
			System.out.print(" ���� : "); int ch = scanner.nextInt();
			
			if( ch == 1 ) { // ���� s
				// 1. id, pw, name, phone �Է¹ޱ� => ���� 4��
				// 2. ��ü ����
				// 3. �Է¹��� ���� 4���� ��ü �� �ʵ忡 ����
				System.out.println("���̵� : "); String id = scanner.next();
				System.out.println("��й�ȣ : "); String pw = scanner.next();
				System.out.println("�̸� : "); String name = scanner.next();
				System.out.println("����ó : "); String phone = scanner.next();
				
				member.id=id;
				member.pw=pw;
				member.name=name;
				member.phone=phone;
				
				//* ���̵� �ߺ�üũ
					// 1. �迭 �� ��ü �� �Է��� ���̵�� ������ ���̵� ã��
				boolean idcheck = false; // �ߺ��̸� true
				for( Member temp : memberlist) { // memberlist �迭 �� ��ü���� �ϳ��� temp�� �ݺ� ����
					if ( temp != null && temp.id.equals(id)) { // ���� ��ü �� id�� �Է¹��� id�� ���ٸ�
						System.out.println("������� ���̵� �Դϴ�. ó������ �ٽ�");
						idcheck = true;
						break;
					}
				}
				
				// id�� �ߺ��� �ƴ� ��� ����
				if (idcheck == false) {
				// ���� ��ü�� �����ϴ� �迭�� ����
					// 1. ���� �ε����� ã��
				int i = 0; // �ε��� ��ġ ����
				for( Member temp : memberlist ) {
					if (temp == null ) { // 2. ���� �ε����� ����
						memberlist[i] = member;
						break; // �ѹ� ���������� for Ż��
						} i++; // �ε��� ����
					} // for end
						System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
				}// if end
			} // ���� e
			else if ( ch == 2 ) { // �α��� s
				System.out.println("-------�α��� ������--------"); // �Է¹ޱ�
				System.out.println("���̵� �Է� : "); String loginid = scanner.next();
				System.out.println("��й�ȣ �Է� : "); String loginpw = scanner.next();
				
				// 2. ���� �迭[memberlist] �� ���� ��
				boolean logincheck = false; // true : �α��μ��� false : �α��ν���
				for(Member temp : memberlist) { 
					if ( temp != null && temp.id.equals(loginid) && temp.pw.equals(loginpw)) {
					System.out.println("�α��� ����");
					logincheck = true; // �α���üũ�� true�� ����
					}
				}
				if (logincheck == false) {
					System.out.println("�α��� ����");
					
				} 
			} // �α��� e
			else if ( ch == 3 ) { // idã�� s
				System.out.println("-----���̵� ã�� ������-----");
				System.out.println("�̸� �Է� : "); String sName = scanner.next();
				System.out.println("����ó �Է� : "); String sPhone = scanner.next();
				boolean findcheck = false;
				for(Member temp : memberlist) {
					if ( temp != null && temp.name.equals(sName) && temp.phone.equals(sPhone)) {
						System.out.println("���̵� ã�� ����"); findcheck = true;
						System.out.println("���̵�� " + temp.id + "�Դϴ�.");
						break;
					} // if end
					
				} // for end
				if(findcheck == false) {
					System.out.println("������ ȸ�� ������ �����ϴ�.");
				}
			} // idã�� e
			else if ( ch == 4 ) { // pwã�� s
				System.out.println("-----��й�ȣ ã�� ������-----");
				System.out.println("���̵� �Է� : "); String sId = scanner.next();
				System.out.println("��ȭ��ȣ �Է� : "); String sPhone = scanner.next();
				boolean pwcheck = false;
				for(Member temp : memberlist) {
					if ( temp != null && temp.id.equals(sId) && temp.phone.equals(sPhone)) {
						System.out.println("��й�ȣ ã�� ����");
						System.out.println("��й�ȣ�� " + temp.pw + "�Դϴ�.");
						pwcheck = true;
						break;
					}
				} // for end
				if(pwcheck == false) {
					System.out.println("ȸ�� ������ �ٸ��ϴ�.");
				}
			} // pwã�� e
			else { // �Է��� 1~4 ���� �ٸ� ��
				System.err.println(" �� �� ���� ��ȣ ");
			}	scanner.close();
		} // ���α׷� while end
		
	} // m e
	
} // c e
