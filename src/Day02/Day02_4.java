package Day02;

public class Day02_4 { // c s
	public static void main(String[] args) { // m s
// 메모는 노션에
	// 산술연산자 예제
		int 정수1=10; int 정수2=20; // 10, 20 각각 저장하는 변수 선언
		System.out.println("더하기 : " + 정수1 + 정수2); // 문자열+정수 -> 연결연산자
		System.out.println("더하기 : " + (정수1+정수2)); // 문자열+(정수1+정수2)
		System.out.println("빼기 : "+(정수1-정수2));
		System.out.println("곱하기 : "+(정수1*정수2));
		System.out.println("나누기(몫) = "+ (정수1/정수2));
	
	
	
	//증감연산자 예제
			정수1++; // 변수명뒤에 ++ 할 경우 해당 변수 내 데이터에 +1
		System.out.println("증가 : " + 정수1); //11
		정수1--; // 변수명뒤에 중략 -1
		System.out.println(" 감소 : " + 정수1); //10
	
		System.out.println(" 선위증가 : " + ++정수1); //증가 후 11출력
		System.out.println(" 후위증가 : " + 정수1++); //11 출력 후 증가
		// 명령어처리는 동시처리 불가능 -> 처리순서존재	 
		System.out.println(" 후위증가 후 : " + 정수1); //앞에서 증가해서 12
	
		System.out.println(" 선위감소 : " + --정수1); // 1감소 후 출력해서 11
		System.out.println(" 후위감소 : " + 정수1--); // 출력 후 1감소
	
	// 비교연산자 예제
		System.out.println(" 이상 : " + (정수1>=정수2)); ////거짓
		System.out.println(" 이하 : " + (정수1<=정수2)); //참
		System.out.println(" 초과 : " + (정수1>정수2)); //거짓
		System.out.println(" 미만 : " + (정수1<정수2)); //참
		System.out.println(" 같다 : " + (정수1 == 정수2)); //거짓
		System.out.println(" 같지 않다 : " + (정수1 != 정수2)); // 참
	
	// 논리연산자 예제
		int 정수3 = 30; int 정수4 = 40;
		System.out.println(" and : " + (정수1 >= 정수2 && 정수4 >= 정수3));
			// 하나라도 거짓이라 false
		System.out.println(" or : " + (정수1>=정수2 || 정수4>=정수3));
			// 하나라도 참이라 true
		System.out.println("not부정 : " + !(정수1>=정수2 || 정수4 >= 정수3));
			// true였는데 ! 붙여서 false
		
	// 대입연산자 예제
	정수1 = 정수1 + 10; System.out.println( " 정수1 : " + 정수1);
	정수1 += 10; System.out.println(" 정수1 : " + 정수1);
		//결과는 둘이 같다
	System.out.println("정수1 : " + (정수1-=10));
	System.out.println("정수1 : " + (정수1/=10));
	
	// 조건연산자 예제
	int 점수 = 85;
	char 등급 = 점수 > 90 ? 'A' : 'B';
			// 점수 변수가 90 초과시 A를 대입, 아니면 B를 대입
	System.out.println(" 등급 : " + 등급);
	char 등급2 = 점수 > 90 ? 'A' : 점수 > 80 ? 'B' : 'C' ;
			// 조건식 ? 참 : 거짓[ 조건식 ? 참 : 거짓 ]
			//점수 변수가 90초과시 A대입, 80초과시 B대입, 아니면 C
	} // m e
} // c e
