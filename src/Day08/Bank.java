package Day08;

public class Bank { // c s
	//�ʵ�
	private int bNum; // bank number
	private String name; // �̸�
	private int hNum; // human number
	private int money;
	private String bPw; // Bank password
	private String id;
	//������
	
		public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getbPw() {
		return bPw;
	}

	public String getId() {
		return id;
	}

	//�� ������
	public Bank() {}
	
		//[�ʵ� 2��] ������
	public Bank(String name, int money) {}
	
		//[�ʵ� 5��] Ǯ ������
	public Bank(int bNum, String name, int hNum, int money, String bPw, String id) {
		this.bNum = bNum;
		this.name = name;
		this.hNum = hNum;
		this.money = money;
		this.bPw = bPw;
		this.id = id;
	}
	//�޼ҵ�
	
		//	- 1. ���� ����
	void ���»���(String[] result) { // ���»��� s
		System.out.println("-----���� ���� ������-----");
		System.out.println("�̸��� �Է����ּ��� : "); String name = Day08_05.scanner.next();
		System.out.println("��й�ȣ�� �Է����ּ��� : "); String pw = Day08_05.scanner.next();
		 // for s
		int j = 0;
		for(Bank temp : Day08_05.bank) {
			if ( temp == null) { // null�� ã������ 
				if( j == 0) {bNum = 1;}  // ù ȸ���� 1�� ����(���ϸ� �ؿ��� -1 �ε��� �����ؼ� ����)
				else bNum=Day08_05.bank[j-1].bNum +1; break;
			}		// null �ٷ� �� ȸ��[������ ȸ��] ��ȣ�� +1
		}
				//ȸ����ȣ �ο� ��
		id = result[0];
		Bank bank = new Bank(bNum, name, hNum, 0, pw, id); // ������ 1���� �迭�� ��ġ��
		
		 // if e 
				//�迭�� �� ������ �ֱ�
		int i = 0; for(Bank temp :Day08_05.bank) { // ȸ������ s
			if ( temp == null ) { // ���������
				Day08_05.bank[i] = bank; System.out.println(" ���� ������ �Ϸ�Ǿ����ϴ�. ");
				System.out.println("���¹�ȣ : "+bNum);
				return;}
			i++;}
				System.out.println("���� ���� ����");
	
	} // ���»��� e
		//	- 2. �Ա�
	void �Ա�(String[] result) { // �Ա� s
		System.out.println(" �Ա� ������ ");
		System.out.println(" ��й�ȣ�� �Է����ּ��� :"); String pw = Day08_05.scanner.next();
		System.out.println(" �ݾ��� �־��ּ��� "); int money = Day08_05.scanner.nextInt();
		for ( Bank temp : Day08_05.bank) {
			if (temp != null && temp.id==(id) &&temp.bPw.equals(pw)&&money>=0) { //Ȯ�εǸ�
				if ( money > 0) { // �ݾ��� �����
				temp.money+=money; System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�. �ܾ� : " + temp.money); return;
				}
			}
		} System.out.println("����. ��õ�");
	} // �Ա� e
		//	- 3. ���
	void ���(String[] result) { // ��� s
		System.out.println(" ��� ������ ");
		System.out.println(" ��й�ȣ�� �Է����ּ��� : "); String pw = Day08_05.scanner.next();
		System.out.println(" ����� �ݾ��� �Է����ּ��� "); int money = Day08_05.scanner.nextInt();
		if ( money > 0) { // �ݾ��� �����
		for ( Bank temp : Day08_05.bank) {						// Ȯ�εǸ�
			if (temp != null && temp.id==(id)&&temp.bPw.equals(pw) && money>=0 && (temp.money-money)>=0) { 
				temp.money-=money; System.out.println("����� �Ϸ�Ǿ����ϴ�. �ܾ� : " + temp.money); return;
				}
			}
		}
	} // ��� e
		//	- 4. ��ü
	void ��ü(String[] result) { // ��ü s
		System.out.println(" ��ü ������ ");
		System.out.println(" ��й�ȣ�� �Է����ּ��� : "); String pw = Day08_05.scanner.next();
		System.out.println(" ��ü�� �ݾ��� �Է����ּ��� "); int money = Day08_05.scanner.nextInt();
		if ( money > 0) { // �ݾ��� �����
			System.out.println(" ��ü�� ���¹�ȣ�� �Է����ּ��� "); int bNum = Day08_05.scanner.nextInt();
			for ( Bank temp : Day08_05.bank) { // for s	
				if(temp != null &&temp.bPw.equals(pw)&&(temp.money>=money) ) { // Ȯ�εǸ�
					 for(Bank oppo : Day08_05.bank) { //for2 s
						 if(oppo.bNum==bNum) { // ��� ������ ã�Ƽ�
						oppo.money+=money;
						temp.money-=money;
						System.out.println("��ü�� �Ϸ�Ǿ����ϴ�."); return; // �Ա�
						 }
					} // for2 e
				} // if 2 e
				System.out.println("����. ��õ�");
			} // for e
		}// if end
	} // ��ü e
		//	- 5. ���¸��
		//	    - ���� ��ȣ�� �ܾ׸� ǥ��
		void ���¸��(String[] result) {
			System.out.println("---����� ���� ���---");
			for(Bank temp : Day08_05.bank) {
				if(temp != null && temp.id.equals(id)) {
					System.out.println("����"+temp.bNum+ "����" + temp.money + "���� �ֽ��ϴ�.");
				}
			}
		}
} // c e
