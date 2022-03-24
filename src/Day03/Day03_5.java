package Day03;

public class Day03_5 { // c s

	public static void main(String[] args) { // m s
		
		//for문 중첩 : for() { for2() { for3() {} } }
		// 예제 1
			for( int i = 1 ; i<=10 ; i++) {
				//int i = 1 : 초기값 선언 [ i는 반복변수 ]
					//i <=10 : 조건식 [ i가 10 이하이면 실행, 아니면 실행불가 ]
						// i++ : 증감식 [ 실행문 실행후 증가 혹은 감소 단위 ]
				System.out.print(i + "\f");
					//i가 10 이하라면 true니까 실행 후 +1 반복
			}
		//예제 2 : 1부터 100까지의 누적 합 출력
			int sum = 0; // 누적합 저장 변수
			for( int i = 1; i<=100 ; i++) {
				// i가 1부터 100까지 증가하면서 실행문 반복처리
				sum +=i;
			}
			System.out.println(sum);
		//예제 3 : 1부터 100까지 7배수의 누적합
			int sum2 = 0;
			for (int u = 0; u<100 ; u+=7) {sum2 += u;}
			
			System.out.println(sum2);
			
				//배수찾기 : 값%배수==0이면 값은 그 수의 배수
		//예제 4: 2단 구구단 만들기 ( 2는 고정값. 1~9를 변수로 )
			for( int 곱 = 1; 곱<=9 ; 곱++) {
				System.out.printf("2X%d=%d \n", 곱, 2*곱);
			}
			
		//2단~9단 구구단만들기[단, 곱 둘다 변수]
			// 단 : 2부터 9까지 1씩 증가
			// 곱 : 1부터 9까지 1씩 증가
				//단 1번 반복시 곱은 9번 실행
			
			for(int 단 = 2; 단<=9 ; 단++) { 
				for(int 곱 = 1; 곱<=9; 곱++)
				{
			System.out.printf("%d X %d = %d \n" , 단 , 곱, (단*곱));}
			};
			
			
			
	} // c e
} // m e
