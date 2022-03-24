package Day05;

public class Day05_1 { // c s

	public static void main(String[] args) { // m s
	
		// 변수 : 하나의 데이터 저장
		// 배열 : 동일한 자료형 데이터를 인덱스 기준으로 나열
		// 1차원 배열 : 길이
			// 형태 : 자료형[] 배열명 = new 자료형[길이];
			// int[] arr = new int[3];
			// -> int int int
			// int형 변수 3개를 저장하는 배열
		// 2차원 배열 : 가로 세로
			// 형태 : 자료형[][] 배열명 = new 자료형[행][열];
			// int[][] arr2 = new int[4][3]
			// int int int int
			// int int int int
			// int int int int
			// int형 변수 12개를 저장하는 배열
		// 3차원 배열 : 가로 세로 높이
			// 형태 : 자료형[][][] 배열명 = new 자료형[행][열][높이];
		
		// 예제 1)
		int[] 일차원 = new int[3]; // int : 4바이트 * 3 = 12바이트 배열
		일차원[0] = 80; 일차원[1] = 90; 일차원[2] = 100;
		//0번 인덱스에 80 데이터 대입
		
		int[][] 이차원 = new int[2][3]; // [가로=행] [세로=열] // 4바이트 * 2 * 3 = 24바이트
			이차원[0][0] = 80;	이차원[0][1] = 90; 	이차원[0][2] = 100;
			이차원[1][0] = 40;	이차원[1][1] = 50;	이차원[1][2] = 60;
			
			System.out.println(" 1차원 배열 : " + 일차원); // 인덱스 없이 배열명만 호출시 주소값 출력
			System.out.println(" 2차원 배열 : " + 이차원);
			
			System.out.println(" 1차원 배열의 길이 : " + 일차원.length); // 배열의 길이
			System.out.println(" 2차원 배열의 행 길이 : " + 이차원.length); // 행 길이
			System.out.println(" 2차원 배열의 열 길이 : " + 이차원[0].length); // 열 길이
			
			// 예시 2) 반복문을 이용해 0~49까지 첫번째 행에 저장
							// 50~ 99 까지 두번째 행에 저장
			
			int[][] 배열3 = new int[2][50]; // 4바이트 *2*50 => 400바이트 100칸짜리 배열 선언
			
			for(int i = 0; i < 100; i++) { 
				//i는 0부터 100미만까지 1씩반복증가
				
				//첫번째 행에 값 넣기
				if (i<50) {배열3[0][i] = i;}
				else { 배열3[1][i-50] = i;}
					
				}
			//출력 반복문
			for(int i = 0; i<100; i++) {
				if (i<50)
			System.out.printf("%3d" , 배열3[0][i] );
				else System.out.printf("%3d" , 배열3[1][i-50]);
				//행 구분
				if (i == 49) {
					System.out.println();
				}
			}
	} // m e
	
} // c e