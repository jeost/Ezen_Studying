package Day08;

import java.util.Arrays;
import java.util.Scanner;

//��������// 5.����: 1.���Ⱑ�� 2. �����ȯ 3.��������� 4.�ڷΰ���
		//1. 
public class Long {
	//�ʵ� 1.name 2.�ܾ�
		private String name = "ĳ��Ż";
		private int balance;
		private String id; // �񱳸� ����
	
	//������
		public Long() {
			
		}
		public Long(String name, int balance, String id) {
			this.name = name;
			this.balance = balance;
			this.id = id;
		}
	//�޼ҵ�
		@SuppressWarnings("null")
		public void Management(String[] result) {
			System.out.println("---------------------------------���Ⱑ��----------------------------------");
			System.out.println(name + "�����ѵ�");
			// pw Ȯ��
			System.out.println("��й�ȣ: "); String pw = Day08_05.scanner.next();
			//��й�ȣ Ȯ���۾�
			boolean pwch = false;
			if(result[3].equals(pw)) {
				pwch = true;
			}else {
				System.out.println("��й�ȣ�� �������� �ʽ��ϴ�.");
				return;
			}
			if(pwch == true) {// ��й�ȣȮ���� �Ϸ�Ǹ�
				System.out.println("����ݾ�: "); int br = Day08_05.scanner.nextInt();
				//4 ��ü����
				Long long2 = new Long(name, br, result[0]);
				// ����
				int i = 0;
				for(Long temp : Day08_05.longs) {// null Ȯ��
					if(temp == null) {// null�� Ȯ�εǸ�
						Day08_05.longs[i] = long2;
						System.out.println("�����ǰ ���Լ���");
						return;
					}
					i++;
				}
				return;
			}
			
			
			
		}//���Ⱑ�� end
		//�����ȯ
		public void Repayment(String[] resul) {
			System.out.println("---------------------���� ��ȯ �޴�-------------------------");
			//�ߺ�Ȯ��
			System.out.println("���� �������� ����");
			System.out.println("�̸�\t�ݾ�\t������");
			int ����� = 0;
			boolean ã�� = false;
			for(Long temp : Day08_05.longs) {
				if(temp != null && resul[0].equals(temp.id)) {
					System.out.println(temp.name+"\t"+temp.balance+"\t"+temp.id);
					����� = temp.balance;
					ã�� = true;
					break;
				}
			}
			
			if(ã�� == true) {
				System.out.println("1.�����ȯ 2.�ڷΰ���"); int ch = Day08_05.scanner.nextInt();
				int �ܾ� = 0;
				//�ܾ�ã��
				for(Bank temp : Day08_05.bank) {
					if(temp != null && temp.getId().equals(resul[0])) {
						�ܾ� = temp.getMoney();// bank ��ü�ȿ� �ִ� �ݾ׻�����
					}
				}
				//����
				if(ch == 1) {
					System.out.println("��ȯ�ݾ�"); int br = Day08_05.scanner.nextInt();// ��ȯ�� �Է¹ޱ�
					if(�ܾ� > br){// �ܾ��� ��ȯ�ݾ׺��� ������
						for(Bank temp : Day08_05.bank) {// �ܾ� ����
							if(temp != null && temp.getId().equals(resul[0])) {
								temp.setMoney(�ܾ� - br);
								break;
							}						
						}// for end
						for(Long temp : Day08_05.longs) {// ����� ��ȯ
							if(temp != null && temp.id.equals(resul[0])) {// ���̵� ����
								temp.balance = temp.balance - br;
								break;
							}
						}
						System.out.println("��ȯ�� �����ϼ̽��ϴ�");
				
					}else {// �ܾ��� ��ȯ�ݺ��� ������
						System.out.println("�ݾ��� �����մϴ�");
					}
					
				}else if(ch == 2) {
					
				}else {
					System.out.println("�˼����� �ൿ");
				}
				
				
			}else {
				System.out.println("�������� �ƴ�");
			}
			
			
			
		}
			public void LoanAmount(String[] resul) {
				for(Long temp : Day08_05.longs) {
					if(temp != null && temp.id.equals(resul[0])) {
						System.out.println("���� ����ݾ���"+ temp.balance + "�� �Դϴ�.");
						return;
				
				}
			}
		}
	
}
