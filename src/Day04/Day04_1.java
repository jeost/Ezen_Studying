package Day04;

import java.util.Scanner;

public class Day04_1 { // c s

	public static void main(String[] args) { // m s
		
		// while ����
//			1. �ʱⰪ;
//			while2( 2. ���ǽ� ) {
//				4. ���๮;
//				3. ������;
//			}
	
		// for ��1) [�ʱⰪ, ���ǽ�, �������� �� �ٿ� ����]
		for (int i = 1; i<=10 ; i++ ) { 
			//i�� 1���� 10���ϱ��� 1�� �����ϸ鼭 �Ʒ� ���๮ �ݺ�ó��
			System.out.println( i + " ");
		} // for end 
		
		// while ��1)
		int i = 1; //�ʱⰪ
		while( i<=10 ) { // ���ǽ�
			System.out.println( i + " "); // ���๮
			i++; // ������
		} // while end
		
		// for ��2) 1~100 ������
		int sum = 0;
		for( int o = 1; o<=100; o++) { 
			sum += o;
		} System.out.println( "for 1~100 ������ " + sum );
		// while ��2) 1~100 ������
		int sum2 = 0;
		int j=1;
		while( j<=100 ) {
			sum2 += j;
		 j++;
		}
		System.out.println( "while 1~100 ������ " + sum2 );
		
		// while ��3) ���ѷ���
		while(true) { // ���ǽ��� true ���� // true ��� => ���ѷ���
			System.out.println(" �� ");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			if( exit == 3 )
				scanner.close();
			break; // ���� ����� �ݺ��� Ż�� [ if ���� ]
		}
		
	} // m e
	
} // c e
