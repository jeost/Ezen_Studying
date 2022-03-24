package Day05;

import java.util.Scanner;

public class Day05_3 { // c s

	public static void main(String[] args) { // m s
	//확인문제 7
		int max = 0; // 최댓값 저장 변수
		int[] array = {1,5,3,8,2}; // 배열 선언 + 초기값 선언
		for(int i = 0; i<array.length; i++) {
			if ( max < array[i]) max = array[i];
		}
		System.out.println("max: " + max);
		
	//확인문제 8
		int[][] array2 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0; 	  // 합계
		double avg = 0.0; // 평균
		
		double count = 0.0; // 정수의 개수
		for (int i=0; i<array2.length; i++) { // 행 따라 증가
			for (int j = 0; j<array2[i].length; j++) { // 열 따라 증가
				sum+=array2[i][j]; // 누적합계
				count+=1;
			}
		}		//강제 형변환
		avg = (sum/count);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		
	// 확인문제 9
		
		Scanner scanner = new Scanner(System.in);
		boolean run=true;
		int studentNum=0;
		int[] scores = null;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
		
			int selectNo = scanner.nextInt();
			
			if( selectNo == 1) { // 학생 수 입력
				System.out.println("학생수>"); studentNum=scanner.nextInt();
			scores = new int[studentNum];} // scores 배열 길이 선언(입력받은 만큼)
			
			else if(selectNo == 2) { // 학생 점수 입력
				for (int i=0; i<scores.length; i++) {
					System.out.printf(" scores[%d] : %d \n" , i); scores[i]=scanner.nextInt();
				} // 입력받아 i번째 인덱스에 저장
			}
			else if(selectNo == 3) { // 점수 출력
				for (int i=0; i<studentNum; i++)
				System.out.printf(" scores[%d] : %d \n" , i , scores[i]);
			}
			else if(selectNo == 4) { // 분석
				int max9 = 0; int 누적합 = 0;
				for(int i = 0; i<scores.length; i++) { // 최댓값 구하기
					if(max9<scores[i]) {
						max9=scores[i]; // i번째 인덱스의 데이터를 대입
					}
					누적합+=scores[i];
				}//for end
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + ((double)누적합/studentNum));
			}
			else if(selectNo == 5) {
				run = false;
			}
		} // while end
		
		System.out.println("프로그램 종료");
	} // m e
	
} // c e
