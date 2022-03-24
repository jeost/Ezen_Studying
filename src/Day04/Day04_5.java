package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_5 { // c s
	
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		boolean pass = true;
		int[] unum = new int[6]; // 6개 메모리 할당
		int[] cnum = new int[6]; // 컴퓨터 난수
		int ㅊㅋ = 0;
		for ( int i = 0; i<=5 ; i++) { //6회 실행
			System.out.println(" 1~45 사이의" + i + "번째 숫자 입력 : "); number = scanner.nextInt(); // 입력받기
			//유효성검사
			if(number < 1 || number > 45)   {
				System.out.println("1~45 사이의 숫자를 입력.");
				i--; // 정상 입력이 아니라 i값 되돌리기
			pass = false;

				//1보다 작거나 45보다 크면 재입력(저장 x)
											} // if end
				// 중복체크
			for(int j = 0; j<6; j++) 	{
				if (number==unum[j]) {// j번재 인덱스값과 입력값이 같은지 비교
					System.out.println("중복, 재입력.");
					i--; pass = false;
									 }	//if end
										} //for2 end
			//배열에 저장
			if ( pass = true) {unum[i] = number;}

		}//for1 end
		//*사용자 배열 내 모든 인덱스 출력
		for (int temp : unum) {System.out.print(temp + "\t");}
		
		//난수 6개 생성
		Random random = new Random(); int cnumber = 0; // 선언
		for ( int i = 0; i<=5 ; i++) { //6회 실행
			cnumber = random.nextInt(45)+1; // 입력받기
				// 중복체크
			for(int j = 0; j<6; j++) {
				if (cnumber==cnum[j]) {// j번재 인덱스값과 입력값이 같은지 비교
					i--; pass = false;
			}		//if end
				} //for end
			//배열에 저장
			if(pass=true) {cnum[i] = cnumber;}
		}// 난수생성 end
		
		System.out.print("\n 추첨 번호 : ");
		for( int tempo : cnum) {
			System.out.print(tempo + "\t");
		}
		
		//두 배열 비교해서 동일한 수 찾기 방법 1
//		for(int u = 0; u<6; u++) { // u 0~5 6번 반복실행
//			for(int c = 0; c<6; c++) { // c 0~5 6번 반복실행
//				if(unum[u]==cnum[c]) { ㅊㅋ++; 
//				}//if ends
//			}//for2 end
//		}//for1 end
		
		//방법 2
		for( int 기준 : unum) { // 배열 내 하나의 비교기준 대입
			for( int 비교대상 : cnum) { // 배열 내 하나씩 비교기준 대입
				if( 기준 == 비교대상) { ㅊㅋ++;
				}
			}
		}
		System.out.println("맞춘 번호 갯수 : " + ㅊㅋ);
	} // m e
	
} // c e
