package Day07;

public class Member { // c s

	// 1. �ʵ�
	int mno;	// ȸ����ȣ [�ڵ����� �Է�, �ߺ�x]
	String id;	// ���̵� [�ߺ�x]
	String password;	// ��й�ȣ
	String name;	// �̸�
	String phone;	// ����ó
	// 2. ������ [ �����ڸ� == Ŭ������ ]
		// 1. �������
	public Member() {}
		// 2. ��� �ʵ带 �޴� ������
	public Member(int mno, String id, String password, String name, String phone) {
		this.mno = mno;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	// 3. �޼ҵ�
		//ȸ������ ó�� [�μ�x ��ȯo ���Լ����� true ���н� false]
	boolean ȸ������() { // �Է¹ޱ�
		System.out.println("-------ȸ������ ������---------");
		System.out.println("���̵� �Է����ּ��� : "); String id = 		Day07_5_BookApplication.scanner.next();
		// ���̵� �ߺ�üũ
				for(Member temp : Day07_5_BookApplication.members) {
					if( temp != null && temp.id.equals(id)) { // ������ �ƴϸ鼭 �Է¹��� id�� �ߺ��̸�
						System.out.println("���� ������� ���̵� �Դϴ�.");
						return false;
					}
				} // �ߺ�üũ e
		System.out.println("��й�ȣ�� �Է����ּ��� : "); String password = Day07_5_BookApplication.scanner.next();
		System.out.println("�̸��� �Է����ּ��� : "); String name = 		 Day07_5_BookApplication.scanner.next();
		System.out.println("����ó�� �Է����ּ��� : "); String phone = 	 Day07_5_BookApplication.scanner.next();
		
		// ȸ����ȣ �ڵ��ο�[���� �ֱ� ȸ��+1]
		
		int j = 0;
		for(Member temp : Day07_5_BookApplication.members) {
			if ( temp == null) { // null�� ã������ 
				if( j == 0) {mno = 1;} // ù ȸ���� 1�� ����(���ϸ� �ؿ��� -1 �ε��� �����ؼ� ����)
				mno=Day07_5_BookApplication.members[j-1].mno +1; break;
			}		// null �ٷ� �� ȸ��[������ ȸ��] ��ȣ�� +1
		}
		// ������ 1�� ��ü�� ��ġ��
		Member member = new Member(mno, id, password, name, phone);
		
		// �迭�� �� ���� ã�Ƽ� �� ��ü[ȸ��] �ֱ�
		int i = 0; for(Member temp : Day07_5_BookApplication.members) { // ȸ������ s
			if ( temp == null ) { // ���������
				Day07_5_BookApplication.members[i] = member;
				return true;}
			i++;
		}// ȸ������ e
		return false;
	}
		
		//�α��� [�μ�x ��ȯo �α��μ����� ������ id ��ȯ, ���н� null��ȯ]
	String �α���() {
		System.out.println("-------�α��� ������---------");
		System.out.println("���̵� �Է����ּ��� : "); String id = Day07_5_BookApplication.scanner.next();
		System.out.println("��й�ȣ�� �Է����ּ��� : "); String password = Day07_5_BookApplication.scanner.next();
		for(Member temp : Day07_5_BookApplication.members) { // for s
			if ( temp != null && temp.id.equals(id) && temp.password.equals(password)) { // if s
				// ������ �ƴϸ鼭 id�� password�� �����ϸ�
				return temp.id;} // if e
		} // for e
		return null;
	} // �α��� e
	
		//���̵�ã�� [�μ�x ��ȯx]
	void ���̵�ã��() { // idã�� s �̸��� ��ȣ �����ϸ� ���̵����
		System.out.println("-------���̵� ã�� ������---------");
		System.out.println("�̸��� �Է����ּ��� : "); String name = Day07_5_BookApplication.scanner.next();
		System.out.println("����ó�� �Է����ּ��� : "); String phone = Day07_5_BookApplication.scanner.next();
		for(Member temp : Day07_5_BookApplication.members) { // for s
			if( temp != null && temp.name.equals(name) && temp.phone.equals(phone)) { // ���� �����ϸ�
			System.out.println("���̵�� " + temp.id + "�Դϴ�.");
				return;	
			}
		} // for e
		System.out.println("������ ȸ�������� �����ϴ�.");
	} // idã�� e
	
		//��й�ȣã�� [�μ�x ��ȯx]
	void ��й�ȣã��() { // pwã�� s
		System.out.println("-------��й�ȣ ã�� ������---------");
		System.out.println("id�� �Է����ּ��� : "); String id = Day07_5_BookApplication.scanner.next();
		System.out.println("����ó�� �Է����ּ��� : "); String phone = Day07_5_BookApplication.scanner.next();
		for(Member temp : Day07_5_BookApplication.members) {// for s
			if( temp != null && temp.id.equals(id) && temp.phone.equals(phone)) { // ���� �����ϸ�
				System.out.println("��й�ȣ�� " + temp.password + "�Դϴ�.");
				return;
			}
		} // for e
	} // pwã�� e
		//ȸ��Ż��
		//ȸ������
} // c e
