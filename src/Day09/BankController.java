package Day09;

import java.util.Random;

public class BankController { // c s
			// ����� ��� x
	
	// ���� ���� ��Ʈ�ѷ� Ŭ����
	// M : model[�����Ͱ�]
	// V : view [�����]
	// C : model�� view ���̸� ����
	
	// �信�� ��û�ϴ� ����� ����
		// 1.���»��� [c]
	public String ���»���(String pw, String bankbookO, int bankselect) {
		// 1. �Է¹��� �� ��������
			//���¹�ȣ �ڵ�����
		Random random = new Random();
			//4�ڸ� ����
		String bankbookN = null;
		while(true) {
		int ���� = random.nextInt(10000);
		
		bankbookN = String.format("%04d", ����);
								// �������� ����
									//%d : ���� %4d : ���� 4�ڸ� [�ڸ��� ������ ����ó��] ���� :   15 %04d : ���� 4�ڸ� [�ڸ��� ������ 0 ó��] ���� : 0015
		//�ߺ�üũ
				Boolean �����ߺ� = false;
				for (Bank temp2 : Day09_6_����������α׷�.���¸���Ʈ) {
					if( temp2.getBankbookN().equals(bankbookN)) {
						�����ߺ� = true;
					}
				}if (�����ߺ� == false) {
					break;
				}
		}
		// 2. ��üȭ[�ټ��� ������ �ϳ��� ��ü�� �����]
		Bank temp = null; // �� ��ü ����
			if(bankselect == 1) {
				temp = new Kookmin("0" , pw , bankbookO , 0);
			}else if(bankselect == 2) {
				temp = new Shinhan("0" , pw , bankbookO , 0);
			}else if(bankselect == 3) {
				temp = new Hana("0" , pw , bankbookO , 0);
			}
		// 3. �迭�� ����
			int i = 0;
			for(Bank temp2 : Day09_6_����������α׷�.���¸���Ʈ) {
				if(temp2 == null) { // temp2�� �����̸�
					Day09_6_����������α׷�.���¸���Ʈ[i] = temp; //���� �ε����� ���
					
					return temp.getBankbookN(); // ���¹�ȣ�� �����ϸ�
				}
			}
		return null;}
		// 2.�Ա� [u]
	public boolean �Ա�(String bankbookN, int money) { // �Ա� s
		int i = 0;
		for(Bank temp : Day09_6_����������α׷�.���¸���Ʈ) {
			if(temp != null && temp.getBankbookN().equals(bankbookN)) { // ������ ���¸� ã��
				Day09_6_����������α׷�.���¸���Ʈ[i].setbMoney(temp.getbMoney()+money); // �Ա� ó��	
				return true;
			}i++;
		}
		return false;}
		// 3.��� [u]
	public byte ���(String bankbookN, String pw, int money) { // �Ա� s
		int i = 0;
		for(Bank temp : Day09_6_����������α׷�.���¸���Ʈ) {
			if(temp != null && temp.getBankbookN().equals(bankbookN) && temp.getPw().equals(pw)) { // ������ ���¸� ã�� �ܾ��� ����ϰ� ��й�ȣ�� ������
				if(temp.getbMoney()<money) {
					return 1;
				}else {Day09_6_����������α׷�.���¸���Ʈ[i].setbMoney(temp.getbMoney()-money); // ��� ó��	
					return 2;
				} // else end
			} // if end	
		i++;}// for end
		return 3;
	}
		// 4.��ü [u]
	public byte ��ü(String bankbookN , String pw , String bankbookN2 , int money) {
		int i = 0;
		for(Bank temp : Day09_6_����������α׷�.���¸���Ʈ) {
			if(temp != null && temp.getBankbookN().equals(bankbookN) && temp.getPw().equals(pw)) { // �����»��
				int b = 0;
				for(Bank temp2 : Day09_6_����������α׷�.���¸���Ʈ) {
				if(temp2 != null && temp2.getBankbookN().equals(bankbookN2)) { // �޴»��
					if(temp.getbMoney()<money) { // ���� �����ϸ�
						return 2; // �������ϴ�
					}else { Day09_6_����������α׷�.���¸���Ʈ[i].setbMoney(temp.getbMoney()-money);
							Day09_6_����������α׷�.���¸���Ʈ[b].setbMoney(temp2.getbMoney()+money); // ��ü
						return 1; // ����
					}
				} // if2 end
				
					} // for2 end
			}//if end
		i++;}//for end
		return 4; // ������ ����
		}//��ü end
		// 5.�����¸�� [r]
	public Bank[] ���¸��(String bankbookO) {
			// ������ �������� ���¸� ã�� �迭�� ��� �ѱ��
		Bank[] �����¸�� = new Bank[100]; // �����¸�� �迭 ���� ����
		for( Bank temp : Day09_6_����������α׷�.���¸���Ʈ) {	// ���� ���� �ɷ�����
			if( temp != null && temp.getBankbookO().equals(bankbookO)) { // �̸��� �����ϸ�
				int i = 0;
				for(Bank temp2 : �����¸��) {
					if(temp2 == null) {
						�����¸��[i] = temp; break; // �� ���¸�� �迭 �� ������� ã�� �ֱ�, 1�� ���������� break
					}i++; // if2 end
				} // for2 end
			} // if end
		} // for end
		return �����¸��;}
		// 6.���� [u]
	public boolean ����() {return false;}
	
} // c e
