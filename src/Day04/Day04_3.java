package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 { // c s
	
	public static void main(String[] args) { // m s
		
		Scanner scanner=new Scanner(System.in);
		int player; // 사용자의 선택 저장
		int computer; // 컴퓨터의 난수 저장
		int game = 0; // 총 게임수 저장
		int win = 0; // 승리수 저장
		int lose = 0; // 패배수 저장
		while(true) { // 프로그램 실행 [ 무한루프 종료 조건 : 3번 입력시 ]
			System.out.println("가위바위보 게임");
			System.out.println("가위(0) 바위(1) 보(2) 종료(3) 선택 : ");
			player = scanner.nextInt(); // 입력한 수 저장
			System.out.println(" 입력 : " + player);
			
			Random random = new Random(); // 난수 객체 선언
					//random.nextInt() : int 범위 내의 난수 발생
					//random.nextInt(n) : 0부터 n 전까지 범위내 난수 발생
					//random.nextInt(a)+b : b부터 (a+b) 전까지 범위 내 난수 발생
			computer = random.nextInt(3); // 난수를 정수(int형)으로 가져오기
			if (player == 3) { // 종료
				System.out.println(" 게임종료 ");
				System.out.println(" 총 게임수 : " + game);
				if(player > computer) {System.out.println("최종 승자 : 플레이어");}
				else if(player<computer) {System.out.println("최종 승자 : 컴퓨터");}
				else System.out.println("최종 : 무승부");
			break;			}
			
			else if(0<=player && player <=2) {
					if (		(player == 0 && computer == 1) ||
					(player == 1 && computer == 2) ||
					(player == 2 && computer == 0)
					) { // 승리
				win++;
				game++;
				System.out.println("승리");
			}else if(player == computer) { // 비김 
				game++;
				System.out.println("무승부");
			}
									
			else { // 패배
					lose++;
					game++;
					System.out.println("패배");
				}
			System.out.println("승리 : " + win);
			System.out.println("패배 : " + lose);
			}
			else {System.out.println("알 수 없는 입력");}
		} // while 1 end
			 
		
		
		
		
		
	} // m e
} // c e
