package Day04;

import java.util.Scanner;

public class Day04_2 { // c s

	public static void main(String[] args) { // m s
		
	// ���Ǳ� ���α׷�
		// 1. �޴��� [ 1.�ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ]
			// �޴��ǿ��� ��ǰ ���� �� ��ٱ��Ͽ� �ֱ�
			// ��� �����ϸ� �˸� ( ������ )
		// 2. �ʱ� ��� [ ��ǰ �� 10���� ]
		// 3. ������ �ݾ��� �Է¹޾� ������ ��ŭ ������ �ܵ� ���
			// 1. ������ �ݾ׺��� ���ž��� �� ũ�� ���� ��� [ �ݾ� ���� ]
		
		// ���뺯��[ ��� ��ȣ ������ ����ϴ� ������ ]
		Scanner scanner = new Scanner(System.in); // 1. �Է°�ü
		int �ݶ� = 10; int ȯŸ = 10; int ���̴� = 10; // 2. �����
		int �ݶ󱸸� = 0; int ȯŸ���� = 0; int ���̴ٱ��� = 0; // 3. ��ٱ���
		
		// ���α׷� ���� [ ���ѷ��� ]
		while(true) { System.out.println(" �޴� ");
		System.out.println(" 1.�ݶ�[300] 2. ȯŸ[200] 3. ���̴�[100] 4. ����");
		System.out.print("���� : "); int select = scanner.nextInt();
		
		if(select == 1) { // �ݶ� start
			if( �ݶ� == 0 ) { System.err.println(" ��� ���� ");}
			else {System.out.println(" �ݶ� ���� ");
			�ݶ󱸸�++;
			�ݶ�--;
			}
			
		} // �ݶ� end
		else if(select == 2) { // ȯŸ start
				if( ȯŸ == 0 ) { System.err.println(" ��� ���� ");}
				else {System.out.println(" ȯŸ ���� ");
				ȯŸ����++;
				ȯŸ--;
				}
			
		} // ȯŸ end
		else if(select == 3) { // ���̴� start
			if( ���̴� == 0 ) { System.err.println(" ��� ���� ");}
			else {System.out.println(" ���̴� ���� ");
			���̴ٱ���++;
			���̴�--;
			}
		} // ���̴� end
		else if(select == 4) { // ���� start
			
			System.out.println(" ��ٱ��� ");
			System.out.println("��ǰ��\t����\t�ݾ�");
			if (�ݶ󱸸� !=0) {System.out.println("�ݶ�\t"+�ݶ󱸸�+"\t"+�ݶ󱸸�*300);}
			if (ȯŸ���� !=0) {System.out.println("ȯŸ\t"+ȯŸ����+"\t"+ȯŸ����*200);}
			if (���̴ٱ��� !=0) {System.out.println("���̴�\t"+���̴ٱ���+"\t"+���̴ٱ���*100);}
			System.out.println("�� ������ : " + (�ݶ󱸸�*300+ȯŸ����*200+���̴ٱ���*100));
			System.out.println("----------------");
			System.out.println(" 1. ���� 2. ���"); int ����2 = scanner.nextInt();
			
			if( ����2 == 1 ) { // ����
				// �ݾ� �Է¹ޱ�
				// �ݾ�<������ => �����Ұ� => �ݾ� �� �Է�
				// �ݾ�>=������ => �������� => ��ٱ��� �ʱ�ȭ
				int ������ = �ݶ󱸸�*300+ȯŸ����*200+���̴ٱ���*100;
				System.out.println("�ݾ� �Է� : ");
				int �ݾ� = scanner.nextInt();
				if( �ݾ�<������ ) { //�������н� s
					System.err.println(" ���� ����, �ݾ� ���Է�. "); �ݾ� = scanner.nextInt();
								} // �������н� e
				else if(�ݾ�>=������) { // �������� s
					System.out.println(" ���� ����. ");
					�ݶ󱸸� = 0; ���̴ٱ��� = 0; ȯŸ���� = 0;
					System.out.println(" �ܵ� : " + (�ݾ�-������)+"��");
					break;
									} // �������� e
							} // ���� end
			else if( ����2 == 2 ) { // ���
				System.out.println(" �˸�) ���Ÿ�� ����");
				�ݶ� += �ݶ󱸸�; ���̴� += ���̴ٱ���; ȯŸ += ȯŸ����; // ���� ������
				�ݶ󱸸� = 0; ���̴ٱ��� = 0; ȯŸ���� = 0; // ���ż� �ʱ�ȭ
			
								} // ��� end
			else {System.err.println("�� �� ���� �Է�. ����� �ʿ�");}
						} // ���� end
		else System.err.println("�� �� ���� �Է�");
		} // while end
	} // m e
	
} // c e
