package Day05;

import java.util.Scanner;

public class Day05_3 { // c s

	public static void main(String[] args) { // m s
	//Ȯ�ι��� 7
		int max = 0; // �ִ� ���� ����
		int[] array = {1,5,3,8,2}; // �迭 ���� + �ʱⰪ ����
		for(int i = 0; i<array.length; i++) {
			if ( max < array[i]) max = array[i];
		}
		System.out.println("max: " + max);
		
	//Ȯ�ι��� 8
		int[][] array2 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0; 	  // �հ�
		double avg = 0.0; // ���
		
		double count = 0.0; // ������ ����
		for (int i=0; i<array2.length; i++) { // �� ���� ����
			for (int j = 0; j<array2[i].length; j++) { // �� ���� ����
				sum+=array2[i][j]; // �����հ�
				count+=1;
			}
		}		//���� ����ȯ
		avg = (sum/count);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		
	// Ȯ�ι��� 9
		
		Scanner scanner = new Scanner(System.in);
		boolean run=true;
		int studentNum=0;
		int[] scores = null;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����> ");
		
			int selectNo = scanner.nextInt();
			
			if( selectNo == 1) { // �л� �� �Է�
				System.out.println("�л���>"); studentNum=scanner.nextInt();
			scores = new int[studentNum];} // scores �迭 ���� ����(�Է¹��� ��ŭ)
			
			else if(selectNo == 2) { // �л� ���� �Է�
				for (int i=0; i<scores.length; i++) {
					System.out.printf(" scores[%d] : %d \n" , i); scores[i]=scanner.nextInt();
				} // �Է¹޾� i��° �ε����� ����
			}
			else if(selectNo == 3) { // ���� ���
				for (int i=0; i<studentNum; i++)
				System.out.printf(" scores[%d] : %d \n" , i , scores[i]);
			}
			else if(selectNo == 4) { // �м�
				int max9 = 0; int ������ = 0;
				for(int i = 0; i<scores.length; i++) { // �ִ� ���ϱ�
					if(max9<scores[i]) {
						max9=scores[i]; // i��° �ε����� �����͸� ����
					}
					������+=scores[i];
				}//for end
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + ((double)������/studentNum));
			}
			else if(selectNo == 5) {
				run = false;
			}
		} // while end
		
		System.out.println("���α׷� ����");
	} // m e
	
} // c e
