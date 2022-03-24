package Day03;

import java.util.Scanner;

public class Day03_6 { // c s
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		
		// 별문제 1 : 입력받은 수 만큼 * 출력
		System.out.println("문제1) 별개수 : "); int s1 = scanner.nextInt();
		for( int i = 1; i<=s1 ; i++) { // i는 1부터 입력받은 수 까지 1씩증가 
			System.out.print("*");			
		}; // 1 end
		// 별문제 2 : 입력받은 수 만큼 * 출력 [단 5개마다 줄바꿈]
		System.out.println("문제2) 별개수 : "); int s2 = scanner.nextInt();
		for( int i = 1; i<=s2 ; i++) { 
			System.out.print("*");	if (i%5==0) {System.out.println();}
		} // 2 end
		// 별문제 3 
		System.out.println("문제3) 입력받은 줄 만큼 출력"); int s3 = scanner.nextInt();
		for (int i = 1; i<=s3 ; i++) {
			
			for (int s = 1; s<=i ; s++){ 
				System.out.print("*");
				}		
				System.out.println();
			} // 3 end
		//별문제 4
		System.out.println("문제4) 입력받은 줄 만큼 출력"); int s4 = scanner.nextInt();
		for (int i=1; i<=s4 ; i++) {
			//별찍기
			for(int s = 1; s<=s4-i+1 ; s++) {
				System.out.print("*");
			}
			//개행
			System.out.println();		
			} // 4 end
		//별문제 5
		System.out.println("문제5) 입력받은 줄 만큼 출력"); int s5 = scanner.nextInt();
		for (int i = 1; i<=s5 ; i++) {
			for (int b = 1; b<=s5-i ; b++)
				//공백 입력
			{System.out.print(" ");} for (int s = 1; s<=i ; s++) {System.out.print("*");}
			//개행
			System.out.println();
		}// 5 end
		//별문제 6
		System.out.println("문제6) 입력받은 줄 만큼 출력"); int s6 = scanner.nextInt();
		for (int i=1; i<=s6 ; i++) { 
			for(int d=1; d<=i-1 ; d++)
				System.out.print(" ");
			//* 찍기
			for( int s=1; s<=s6-i+1 ; s++ )
				System.out.print("*");
			//개행
			System.out.println();			
		}// 6 end
		//별문제 7
		System.out.println("문제7) 입력받은 줄 만큼 출력"); int s7 = scanner.nextInt();
		for (int i=1; i<=s7 ; i++) {
			for(int b = 1; b<=s7-i ; b++) {
				System.out.print(" "); // 공백
			} //* 왼쪽 찍기 
			for(int c=1; c<=i ; c++)
				{System.out.print("*");}
				// * 오른쪽 찍기
			for(int d=0; d<=i-2 ; d++)
				{System.out.print("*");}
				//개행
				System.out.println();
		}// 7 end
		//별문제 8
		System.out.println("문제8) 입력받은 줄 만큼 출력"); int s8 = scanner.nextInt();
		for (int i=1; i<=s8 ; i++) {
			for(int b = 1; b<=s8-i ; b++) {
				System.out.print(" "); // 공백
			} for(int c=1; c<=i ; c++)
				//* 찍기
				{System.out.printf("%d" , i);}
			for(int d=0; d<=i-2 ; d++)
			{System.out.printf("%d" , i);}
				//개행
				System.out.println();
		}// 8 end
		//별문제 9
		System.out.println("문제9) 입력받은 줄 만큼 출력"); int s9 = scanner.nextInt();
		for(int i=0;i<s9;i++){
			for (int b = 1; b<=i-1 ; b++)
				//공백
				{System.out.println(" ");}
			   for(int c=1; c<=2*i+1; c++){
			      System.out.print("*"); 
			   } // 개행
			   System.out.println();
			}
	} // m e
} // c e
