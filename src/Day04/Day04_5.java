package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_5 { // c s
	
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		boolean pass = true;
		int[] unum = new int[6]; // 6�� �޸� �Ҵ�
		int[] cnum = new int[6]; // ��ǻ�� ����
		int ���� = 0;
		for ( int i = 0; i<=5 ; i++) { //6ȸ ����
			System.out.println(" 1~45 ������" + i + "��° ���� �Է� : "); number = scanner.nextInt(); // �Է¹ޱ�
			//��ȿ���˻�
			if(number < 1 || number > 45)   {
				System.out.println("1~45 ������ ���ڸ� �Է�.");
				i--; // ���� �Է��� �ƴ϶� i�� �ǵ�����
			pass = false;

				//1���� �۰ų� 45���� ũ�� ���Է�(���� x)
											} // if end
				// �ߺ�üũ
			for(int j = 0; j<6; j++) 	{
				if (number==unum[j]) {// j���� �ε������� �Է°��� ������ ��
					System.out.println("�ߺ�, ���Է�.");
					i--; pass = false;
									 }	//if end
										} //for2 end
			//�迭�� ����
			if ( pass = true) {unum[i] = number;}

		}//for1 end
		//*����� �迭 �� ��� �ε��� ���
		for (int temp : unum) {System.out.print(temp + "\t");}
		
		//���� 6�� ����
		Random random = new Random(); int cnumber = 0; // ����
		for ( int i = 0; i<=5 ; i++) { //6ȸ ����
			cnumber = random.nextInt(45)+1; // �Է¹ޱ�
				// �ߺ�üũ
			for(int j = 0; j<6; j++) {
				if (cnumber==cnum[j]) {// j���� �ε������� �Է°��� ������ ��
					i--; pass = false;
			}		//if end
				} //for end
			//�迭�� ����
			if(pass=true) {cnum[i] = cnumber;}
		}// �������� end
		
		System.out.print("\n ��÷ ��ȣ : ");
		for( int tempo : cnum) {
			System.out.print(tempo + "\t");
		}
		
		//�� �迭 ���ؼ� ������ �� ã�� ��� 1
//		for(int u = 0; u<6; u++) { // u 0~5 6�� �ݺ�����
//			for(int c = 0; c<6; c++) { // c 0~5 6�� �ݺ�����
//				if(unum[u]==cnum[c]) { ����++; 
//				}//if ends
//			}//for2 end
//		}//for1 end
		
		//��� 2
		for( int ���� : unum) { // �迭 �� �ϳ��� �񱳱��� ����
			for( int �񱳴�� : cnum) { // �迭 �� �ϳ��� �񱳱��� ����
				if( ���� == �񱳴��) { ����++;
				}
			}
		}
		System.out.println("���� ��ȣ ���� : " + ����);
	} // m e
	
} // c e
