package Day03;

import java.util.Scanner;

public class Day03_7_확인문제7 { // c s
	public static void main(String[] args) { // m s
		Scanner scanner=new Scanner(System.in);
		//공통 변수[모든 곳에서 쓸거면 밖에다 선언]
		boolean run = true; // 실행 여부 변수 / true=실행 false=종료
		
		int balance = 0; // 예금액 변수
		
		while(run) { //while(조건식) { }: 무한루프
			System.out.println("-------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-------------------");
			System.out.println("선택>"); int 선택 = scanner.nextInt();
			if( 선택 == 1 ) { // 입력값이 1
				System.out.println("예금액 : "); int 예금액 = scanner.nextInt();
				balance += 예금액; //입금
			}
			else if( 선택 == 2) { // 입력값이 2
				System.out.println("출금액 : "); int 출금액 = scanner.nextInt();
				 
				//만약 출금액>예금액이면 잔액부족
				if (출금액>balance) { System.out.println("알림)잔액이 부족합니다.");}
				//아니면 출금실행
				balance -= 출금액; //출금
			}
			else if( 선택 == 3) { // 입력값이 3
				System.out.printf("잔고 : %d" , balance ); 
				
			}
			else if( 선택 == 4) { // 입력값이 4
				break; // while 무한루프 탈출
			}
			else { //그 외
			System.out.println("오류");
			}
		}// while owari
		
		
		System.out.println("프로그램 종료");
		
	} // m e
} // c e
