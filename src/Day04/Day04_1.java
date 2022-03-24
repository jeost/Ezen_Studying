package Day04;

import java.util.Scanner;

public class Day04_1 { // c s

	public static void main(String[] args) { // m s
		
		// while 형태
//			1. 초기값;
//			while2( 2. 조건식 ) {
//				4. 실행문;
//				3. 증감식;
//			}
	
		// for 예1) [초기값, 조건식, 증감식이 한 줄에 있음]
		for (int i = 1; i<=10 ; i++ ) { 
			//i는 1부터 10이하까지 1씩 증가하면서 아래 실행문 반복처리
			System.out.println( i + " ");
		} // for end 
		
		// while 예1)
		int i = 1; //초기값
		while( i<=10 ) { // 조건식
			System.out.println( i + " "); // 실행문
			i++; // 증감식
		} // while end
		
		// for 예2) 1~100 누적합
		int sum = 0;
		for( int o = 1; o<=100; o++) { 
			sum += o;
		} System.out.println( "for 1~100 누적합 " + sum );
		// while 예2) 1~100 누적합
		int sum2 = 0;
		int j=1;
		while( j<=100 ) {
			sum2 += j;
		 j++;
		}
		System.out.println( "while 1~100 누적합 " + sum2 );
		
		// while 예3) 무한루프
		while(true) { // 조건식이 true 실행 // true 상수 => 무한루프
			System.out.println(" 엄 ");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			if( exit == 3 )
				scanner.close();
			break; // 가장 가까운 반복문 탈출 [ if 제외 ]
		}
		
	} // m e
	
} // c e
