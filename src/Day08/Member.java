package Day08;

import java.util.Arrays;

public class Member {
	//1.�ʵ�
	private int bno;
	private String id;
	private String pw;
	private String name;
	private String phone;
	//2.������
	public Member() {// ������ڻ���
		
	}
	public Member(String id, String pw, String name,String phone, int bno) {
		super();
		this.bno = bno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	//3.�޼ҵ�
	
	//1.ȸ������
	public boolean SignUp() {
		//�Է¹ޱ�
		System.out.println("-----------------------ȸ������ ������------------------------");
		System.out.println("���̵�: "); 	String id = Day08_05.scanner.next();
		//�ߺ�üũ
		for(Member temp : Day08_05.member) {
			if(temp != null && temp.id.equals(id)) {
				System.out.println("���̵� �ߺ�����ϴ�");
				return false;
			}
		}//�ߺ�üũ for end
		System.out.println("��й�ȣ: ");	String pw = Day08_05.scanner.next();
		System.out.println("�̸�: ");		String name = Day08_05.scanner.next();
		System.out.println("����ȣ: ");	String phone = Day08_05.scanner.next();
		//ȸ����ȣ
		int bno =0; //ȸ����ȣ 
		int i = 0; // �ݺ�Ƚ��
		for(Member temp : Day08_05.member) {
			if(temp == null) {
				if( i == 0) {
					bno = 1;
					break;
				}
				bno = Day08_05.member[i - 1].bno + 1;
				break;
			}
			i++;
		}// ȸ�� ��ȣ end
		//��ü ����
		Member member = new Member(id, pw, name, phone, bno);
		//����
		int j = 0; // ȸ���ε��� ã�� �ݺ�Ƚ��
		for(Member temp : Day08_05.member) {// ȸ���ε��� ã�� �ݺ�
			if(temp == null) {
				Day08_05.member[j] = member;
				System.out.println("ȸ������ ȸ����ȣ��: " + bno);
				return true;
			}
			j++;
		}
		return false;		
	}
	//2.�α���
	public String[] iogin() {
		System.out.println("-----------------------------�α��� ������----------------------------------");
		System.out.println("���̵�: "); 	String id = Day08_05.scanner.next();
		System.out.println("��й�ȣ: ");	String pw = Day08_05.scanner.next();

		for(Member temp : Day08_05.member) { // �α��� üũ
			if(temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {// ���̵� ��ġ ��й�ȣ��ġ
				String[] t = {temp.id, temp.name, temp.bno + "", temp.pw};
				return t;
			}else {
				return null;
			}
		}// �α��� üũ end
		return null;
	}
	
	//3.���̵�ã��
	public void idfind () {
		System.out.println("-----------------------------���̵� ã��--------------------------------");
		System.out.println("�̸�: "); 		String name = Day08_05.scanner.next();
		System.out.println("��ȭ��ȣ: ");		String phone = Day08_05.scanner.next();
		
		for(Member temp : Day08_05.member) {// �ش���� ã�� �ݺ���
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {// �̸� ��ȭ��ȣ��ġ�ϸ�
				System.out.println("����� ���̵�: " + temp.id);
				return;
			}
		}
		System.out.println("ȸ���� �ƴմϴ�");
	}
	
	//4.��й�ȣã��
	public void pwfind () {
		System.out.println("-----------------------------���̵� ã��--------------------------------");
		System.out.println("���̵�: "); 		String id = Day08_05.scanner.next();
		System.out.println("��ȭ��ȣ: ");		String phone = Day08_05.scanner.next();
		
		for(Member temp : Day08_05.member) {// �ش���� ã�� �ݺ���
			if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {// �̸� ��ȭ��ȣ��ġ�ϸ�
				System.out.println("����� ��й�ȣ: " + temp.pw);
				return;
			}
		}
		System.out.println("ȸ���� �ƴմϴ�");
	}
	
}
