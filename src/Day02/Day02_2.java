package Day02;

public class Day02_2 { // c s
	public static void main(String[] args) { // m s
	
		// p.40 byte : 1바이트
		// ; : 실행 단위 구분
		// 변수 이름 중복시 오류
		byte var1 = -128;	System.out.println( var1 );
		byte var2 = -30;	System.out.println( var2 );
		byte var3 = 30; 	System.out.println( var3 );
		//byte var4 = 300; system.out.println( var4 );
		 //오류 : 128 이상 저장 불가능
		byte var4 = 'j'; 	System.out.println( var4 );
			// 문자 -> 정수 변환 [ 아스키코드 규칙대로 ]
		
		// p.43 char : 2바이트 [ 1문자 ](유니코드)
		char c1 = 'a'; System.out.println( c1 );
		char c2 = 97; System.out.println( c2 );			// 10진수 표현
			// 정수 -> 문자 변환
		char c3 = '\u0041'; System.out.println( c3 );	// 16진수 표현
		char c4 = '가'; System.out.println( c4 );
		char c5 = 44032; System.out.println( c5 );
		char c6 = '\uac00'; System.out.println( c6 );
		// 진법 [ 이유 : 2진수만 쓰면 표현 단위 적어서 ]
			// 2진수 = 기계어(2진코드) = 용량(1비트)
			// 8, 10 , 16진수도 있음
		
		// p.44 short : 2바이트 정수
		short num1 = 30000; System.out.println(num1);
		
		// p.45 int : 4바이트 정수 ( 정수 기본타입 )
		int num2 = 10; System.out.println(num2);	// 10진수
		int num3 = 012; System.out.println(num3);	// 8진수는 앞에 0 붙이기
		int num4 = 0xA; System.out.println(num4); 	// 16진수는 앞에 0x
		
		// p.46 long : 8바이트 정수 [ 데이터 뒤에 L ]
		long num5 = 10000000000L; System.out.println(num5);
					// int형 -> long형
		
		// p.47 float : 4바이트 [ 데이터 뒤에 F ] / double ( 실수 기본타입 ) : 8바이트
		double num6 = 3.14; System.out.println(num6);
		float num7 = 3.14F; System.out.println(num7);
		
		double num8 = 0.159265353979323846264338; System.out.println(num8);
		float num9 = 0.159265353979323826264338F; System.out.println(num9);
		
		// p.48 boolean : 1비트 [ true or false ]
			// 스위치 : on , off
		boolean bo1 = true; System.out.println(bo1);
		
		// p.49 : 타입변환
			// ----------------------------- 자동형변환 방향 --------------
			// * 크기순서 : byte -> short -> int -> long -> float -> double
			// 역방향은 강제 형변환
			// 1. 자동 형변환
				// 작은 상자에서 큰 상자로 이동 가능
				// 큰 상자에서 작은 상자로 이동 불가
			byte 바이트 = 10;
			int 인트 = 바이트; // 자동 형변환 o
			// short 쇼트 = 인트; // 자동 형변환 x 오류 발생
		// 2. 강제 형변환
			// 큰 상자에서 작은 상자로 이동. 단, 데이터 손실 有
		short 쇼트 = (short)인트; // int형 변수를 short로 변환하는데 데이터 손실
	
	} // m e

} // c e
