package Day03;

import java.util.Scanner;

public class Day03_6 { // c s
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		
		// ������ 1 : �Է¹��� �� ��ŭ * ���
		System.out.println("����1) ������ : "); int s1 = scanner.nextInt();
		for( int i = 1; i<=s1 ; i++) { // i�� 1���� �Է¹��� �� ���� 1������ 
			System.out.print("*");			
		}; // 1 end
		// ������ 2 : �Է¹��� �� ��ŭ * ��� [�� 5������ �ٹٲ�]
		System.out.println("����2) ������ : "); int s2 = scanner.nextInt();
		for( int i = 1; i<=s2 ; i++) { 
			System.out.print("*");	if (i%5==0) {System.out.println();}
		} // 2 end
		// ������ 3 
		System.out.println("����3) �Է¹��� �� ��ŭ ���"); int s3 = scanner.nextInt();
		for (int i = 1; i<=s3 ; i++) {
			
			for (int s = 1; s<=i ; s++){ 
				System.out.print("*");
				}		
				System.out.println();
			} // 3 end
		//������ 4
		System.out.println("����4) �Է¹��� �� ��ŭ ���"); int s4 = scanner.nextInt();
		for (int i=1; i<=s4 ; i++) {
			//�����
			for(int s = 1; s<=s4-i+1 ; s++) {
				System.out.print("*");
			}
			//����
			System.out.println();		
			} // 4 end
		//������ 5
		System.out.println("����5) �Է¹��� �� ��ŭ ���"); int s5 = scanner.nextInt();
		for (int i = 1; i<=s5 ; i++) {
			for (int b = 1; b<=s5-i ; b++)
				//���� �Է�
			{System.out.print(" ");} for (int s = 1; s<=i ; s++) {System.out.print("*");}
			//����
			System.out.println();
		}// 5 end
		//������ 6
		System.out.println("����6) �Է¹��� �� ��ŭ ���"); int s6 = scanner.nextInt();
		for (int i=1; i<=s6 ; i++) { 
			for(int d=1; d<=i-1 ; d++)
				System.out.print(" ");
			//* ���
			for( int s=1; s<=s6-i+1 ; s++ )
				System.out.print("*");
			//����
			System.out.println();			
		}// 6 end
		//������ 7
		System.out.println("����7) �Է¹��� �� ��ŭ ���"); int s7 = scanner.nextInt();
		for (int i=1; i<=s7 ; i++) {
			for(int b = 1; b<=s7-i ; b++) {
				System.out.print(" "); // ����
			} //* ���� ��� 
			for(int c=1; c<=i ; c++)
				{System.out.print("*");}
				// * ������ ���
			for(int d=0; d<=i-2 ; d++)
				{System.out.print("*");}
				//����
				System.out.println();
		}// 7 end
		//������ 8
		System.out.println("����8) �Է¹��� �� ��ŭ ���"); int s8 = scanner.nextInt();
		for (int i=1; i<=s8 ; i++) {
			for(int b = 1; b<=s8-i ; b++) {
				System.out.print(" "); // ����
			} for(int c=1; c<=i ; c++)
				//* ���
				{System.out.printf("%d" , i);}
			for(int d=0; d<=i-2 ; d++)
			{System.out.printf("%d" , i);}
				//����
				System.out.println();
		}// 8 end
		//������ 9
		System.out.println("����9) �Է¹��� �� ��ŭ ���"); int s9 = scanner.nextInt();
		for(int i=0;i<s9;i++){
			for (int b = 1; b<=i-1 ; b++)
				//����
				{System.out.println(" ");}
			   for(int c=1; c<=2*i+1; c++){
			      System.out.print("*"); 
			   } // ����
			   System.out.println();
			}
	} // m e
} // c e
