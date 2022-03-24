package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_6 { // c s
	public static void main(String[] args) { // m s
		//게임판 선언
		String[] ttt= { "[ ]" , "[ ]", "[ ]",
						"[ ]" , "[ ]", "[ ]",
						"[ ]" , "[ ]", "[ ]"
		};
		//나머지 선언
		String 승리알 = ""; // 승리하면 쓰는 변수
		Scanner scanner=new Scanner(System.in); 
		Random random=new Random();
		boolean set = true;
		boolean turn = true;
		int 빈칸 = 9;
			//일단 반복시키기
			while(set) { // 종료조건 : 9칸 차거나 승리자 등장(3목)
				//빈칸 갯수 초기화
				빈칸 = 9;
					//게임판 출력(모든 인덱스 출력)
				for(int i=0; i<ttt.length ; i++) {
					//줄바꿈
					if((i+1)%3==0)
						System.out.println(ttt[i]);
					else System.out.print(ttt[i]);
				}//출력 끝
				
				//플레이어의 위치(인덱스) 선택
				while(set) {
					System.out.println("1~9 번호 입력"); int p = scanner.nextInt();
					if(ttt[p-1].equals("[ ]")) { // 공백이면 두기
						ttt[p-1] = "[O]"; 
						 break;
				}else { System.out.println("이미 알이 있으니 재선택"); 
					}// else end
				}// 플레이어 while end
					
				//computer 위치 선택
				while(set) { int x = random.nextInt(9);
					if (ttt[x-1].equals("[ ]")) { // 공백이면 두기
						ttt[x-1] = "[X]";
							 break; // 공백 찾으면 break;
					}// if end
				}// 컴퓨터 while end
				
				//승리판단
				//가로 승리
				for(int i=0; i<=6; i+=3) {
					//i는 0부터 6까지 3씩증가
					if(ttt[i].equals(ttt[i+1]) && ttt[i+1].equals(ttt[i+2])){
						//0==1 && 1==2(인덱스)
						승리알 = ttt[i];
					} // if end
				}//for end
				
				//세로 승리
				for(int i=0; i<=2; i++) {
					//i는 0부터 2까지 1씩증가
					if(ttt[i].equals(ttt[i+3]) && ttt[i+3].equals(ttt[i+6])) {
						//0==3 && 3==6(인덱스)
						승리알 = ttt[i];
					}// if end
				}// for end
				
				//대각 승리
				//4가 포함되며 셋이 더하면 12
				if(ttt[0].equals(ttt[4]) && ttt[4].equals(ttt[8])) {
					승리알 = ttt[4];
				}
				if(ttt[2].equals(ttt[4]) && ttt[4].equals(ttt[6])) {
					승리알 = ttt[4];
				}
				
				//게임 종료(한쪽 승리)
				if (승리알.equals("[O]")) {
					System.out.println(" 플레이어 승리 ");
					for(int i=0; i<ttt.length ; i++) {
						//줄바꿈
						if((i+1)%3==0)
							System.out.println(ttt[i]);
						else System.out.print(ttt[i]);
					}
				}
				if (승리알.equals("[X]")) {
					System.out.println(" 컴퓨터 승리 ");
					for(int i=0; i<ttt.length ; i++) {
						//줄바꿈
						if((i+1)%3==0)
							System.out.println(ttt[i]);
						else System.out.print(ttt[i]);
					}
				}// 한쪽 승리 end
				
				//게임 종료(빈칸 x)
				for (int i=0; i<9; i++){
					if (ttt[i].equals("[ ]")) {
						//빈칸 있으면 패스
					}
					else { 빈칸--;
						//차있는만큼 빈칸 갯수 감소
					}
				if( 빈칸 == 0) { // 빈칸이 0개라면
					System.out.println("무승부");
					for(int k=0; k<ttt.length ; k++) {
						
						if((k+1)%3==0)
							System.out.println(ttt[k]);
						else System.out.print(ttt[k]);
						}
					}
				}
			} //while end
	} // m e
} // c e