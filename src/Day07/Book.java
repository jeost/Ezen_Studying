package Day07;

public class Book { // c s
	// - �ʵ� : ISBN(������ȣ) , ������ , �۰� , �����뿩���� , �뿩ȸ��
	String ISBN; // ������ȣ
	String bName; // ������
	String bWriter; // �۰�
	Boolean bRental; // �뿩����
	String mId; // �뿩ȸ��id
	
	
	// - ������ : �������(�޼ҵ�ȣ���) ��� �ʵ带 �޴� ������(������Ͽ�)
	public Book() {	
	}


	public Book(String iSbn, String bName, String bWriter, Boolean bRental, String mId) {
		
		ISBN = iSbn;
		this.bName = bName;
		this.bWriter = bWriter;
		this.bRental = bRental;
		this.mId = mId;
	}
	
	// - �޼ҵ� : 1. �����˻� , 2. ������� , 3. �����뿩 , 4. �����ݳ� , 5. ������� , 6. ��������
	void �����˻�() { // �˻� s
		System.out.println(" �˻� �ܾ� �Է� : "); String bName = Day07_5_BookApplication.scanner.next();
		for(Book temp : Day07_5_BookApplication.books) { // for s
			if ( temp != null && temp.bName.equals(bName)) { // if s
				System.out.println(bName+"�� �����Դϴ�.");
				System.out.print("��ȣ : "+temp.ISBN+"\t");
				System.out.print("�۰� : "+temp.bWriter+"\t");
				if(temp.bRental) {
					System.out.println("�뿩 ����");
				}else {
					System.out.println("�뿩 �Ұ�");
				}
				
			} // if e
		}// for e
		System.out.println("�˻��� å�� �����ϴ�.");
	} // �˻� e

	void �������() { // ��� s
		System.out.println("----���� ���----");
		System.out.println("ISBN\t������\t�۰�\t�뿩���ɿ���");
		for(Book temp : Day07_5_BookApplication.books) {
			if (temp.ISBN!=null) { // ��ĭ�� �ƴϸ�
				System.out.println(temp.ISBN+"\t"+temp.bName+"\t"+temp.bWriter+"\t"+temp.bRental);
			}
			else if(temp!=null) { // ��ĭ�̸�
				return;
			}
		}
		
	} // ��� e
	
	void �����뿩(String loginid) { // �뿩 s
		System.out.println("���� ISBN : "); String iSbn = Day07_5_BookApplication.scanner.next();
		for(Book temp : Day07_5_BookApplication.books) { // for s
			if ( temp != null && temp.ISBN.equals(iSbn) && temp.bRental) { // ���� ������
				System.out.println(" �뿩 ���� ");
				temp.bRental=false; temp.mId=loginid;
				return;
			}else { // ������
				System.out.println(" �뿩 �Ұ� ");
				return;
			}
		} // for e
		System.out.println("�ش��ϴ� ������ �����ϴ�.");
	} // �뿩 e
	
	void �����ݳ�(String loginid) {//�ݳ� s
		System.out.println("---�����ݳ� ������---"); 
	
	�����뿩���(loginid); { // �뿩��� s
		System.out.println("----�뿩�ѵ��� ���----");
		System.out.println("ISBN\t������\t�۰�\t�뿩���ɿ���");
		
		for(Book temp : Day07_5_BookApplication.books) {
			System.out.println(temp.ISBN+"\t"+temp.bName+"\t"+temp.bWriter+"\t"+temp.bRental);
			if (temp.ISBN!=null && temp.mId.equals(loginid)) { // ��ĭ�� �ƴϸ鼭 ���̵� ��ġ�ϸ�
				temp.bRental=true; temp.mId=null; 
				System.out.println("�ݳ� �Ϸ�");
				return;
			}
			else if(temp!=null) { // ��ĭ�̸�
				return;
			}
		}
		
	}// �뿩��� e
	}//�ݳ� e
	void �����뿩���(String loginid) {
		
	}


	void �������() { // ��� s
		System.out.println("����� ������ �Է� : "); String bName = Day07_5_BookApplication.scanner.next();
		System.out.println("������ ISBN �Է� : "); String iSbn = Day07_5_BookApplication.scanner.next();
		//ISBN �ߺ�üũ
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.ISBN.equals(iSbn)) {
				System.out.println("���� ������� ISBN�Դϴ�."); return; // ������� �޼ҵ� ����(��Ͻ���)
			}
		}
		System.out.println("������ �۰��� �Է� : "); String bWriter = Day07_5_BookApplication.scanner.next();
		
		//������ ��ġ��
		Book book = new Book(iSbn , bName , bWriter , true , null);
		System.out.println(" ����� �Ϸ�Ǿ����ϴ�."); System.out.println("--��ϵ� ���� ����--");
		System.out.println("���� ��ȣ : "+ iSbn); System.out.println("���� : " +bName);
		System.out.println("�۰� : "+bWriter); return;
	} // ��� e
	
	void ��������() {
		
	}
} // c e