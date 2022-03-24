package Day02;

import java.util.Scanner;

public class Day02_5 { // c s
public static void main(String[] args) { // m s
	//스캐너 선언
	Scanner scanner = new Scanner(System.in);
	//입력받기
	System.out.println("금액 입력 : "); int 금액=scanner.nextInt();
	int 십만자리 = 금액/100000;
	System.out.println(" 십만원 " + 십만자리 + "장");
	int 십만나머지 = 금액%100000; int 만자리 = 십만나머지/10000;
	System.out.println(" 만원 "+ 만자리 + "장");
	int 만나머지 = 금액%10000; int 천자리 = 만나머지/1000;
	System.out.println(" 천원 "+ 천자리 + "장");
	int 천나머지 = 금액%1000; int 백자리 = 천나머지/100;
	System.out.println(" 백원 "+ 백자리 + "장 입니다");
	
	System.out.println("문제3) 정수 입력:");
	int 문제3=scanner.nextInt();
	System.out.println("입력한 정수는 7의 배수 판단 : " + (문제3%7==0));
	
	System.out.println("문제4) 정수 입력: ");
	int 문제4 = scanner.nextInt();
	System.out.println("입력한 정수는 홀수 판단 : " + (문제4%2==1));
	
	System.out.println("문제5) 정수 입력: ");
	int 문제5 = scanner.nextInt();
	System.out.println("입력한 정수가 7의 배수이면서 짝수인지 확인 : " +((문제5%7==0)&&(문제5%2==0)));
	
	System.out.println("문제6) 정수 둘 입력 ");
	int 문제6_1 = scanner.nextInt(); int 문제6_2 = scanner.nextInt();
	int 큰수 = 문제6_1 > 문제6_2 ? 문제6_1 : 문제6_2;
	System.out.println("더 큰 값은 : " + 큰수);

	System.out.println("문제7) 반지름 입력 ");
	int 문제7 = scanner.nextInt();
	System.out.println("원의 넓이는 " + (문제7*문제7*3.14)+ "입니다");
	
	System.out.println("문제8) 두 실수 입력");
	double 문제8_1 = scanner.nextDouble(); double 문제8_2 = scanner.nextDouble();
	
	System.out.println("앞의 값은 뒤의 값의 " + (문제8_1/문제8_2*100)+ "%입니다.");

	System.out.println("문제9) 사다리꼴의 윗변과 밑변과 높이 입력");
	System.out.println("윗변 : "); int 문제9_1 = scanner.nextInt();
	System.out.println("밑변 : "); int 문제9_2 = scanner.nextInt();
	System.out.println("높이 : "); int 문제9_3 = scanner.nextInt();
	System.out.println("사다리꼴의 넓이는 " + ((문제9_1+문제9_2)*문제9_3*0.5) + "입니다.");

	System.out.println("문제10) 키를 정수로 입력 : "); int 문제10 = scanner.nextInt();
	System.out.println("표준체중 : " + ((문제10-100)*0.9));

	System.out.println("문제11) 키 입력 : "); double 문제11_1 = scanner.nextDouble();
	System.out.println("몸무게 입력 : "); double 문제11_2 = scanner.nextDouble();
	
	double bmi키 = (문제11_1/100);
	double bmi = 문제11_2/(bmi키*bmi키);
	System.out.println("BMI는 " + (bmi) +"입니다.");
	
	
	System.out.println("문제12) inch 입력"); int 문제12 = scanner.nextInt();
	System.out.println((문제12*2.54)+"cm 입니다.");
	
	System.out.println("문제13) 중간고사 점수 : "); double 문제13_1 = scanner.nextDouble();
	System.out.println("기말고사 점수 : "); Double 문제13_2 = scanner.nextDouble();
	System.out.println("수행평가 점수 : "); Double 문제13_3 = scanner.nextDouble();
	double 문13 = (문제13_1*0.3)+(문제13_2*0.3)+(문제13_3*0.4);
	System.out.printf("점수 : %.2f\n" , 문13 );
	
	//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
 	//int x = 10;
	//int y = x-- + 5 + --x;
	//printf(" x의 값 : %d , y의값 :  %d ", x, y)
	// x : 10
	// y : 1. x-- +5 =>10+5=>15
	// 	   2. x--로 감소 => x=9
	//     3. 15 + --x(x=8)
	//     4. 15+8=23
	//문제15 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
	System.out.println("문제15) 나이 입력 : "); int 문제15 = scanner.nextInt();
	System.out.println();
	// String 판정 = 문제15 > 40 ? '중년' : '성인'
	//문제 16 3개의 정수 입력받아 오름차순
	System.out.println("정수 3개 입력"); int a = scanner.nextInt();
									int b = scanner.nextInt();
									int c = scanner.nextInt();
	 // a가 b보다 크다 && a가 c보다 크다면 a
	//결과1 = a > b ? 'a' : 
	
} // m e
} // c e
