package Day02;

import java.util.Scanner;

public class Day02_3 { // c s
public static void main(String[] args) { // m s
	//입력객체 선언
	Scanner scanner = new Scanner(System.in);
	//입력 받고 옮기기
	System.out.print("기본급 입력 : "); int 기본급=scanner.nextInt();
	System.out.print("수당 입력 : "); int 수당=scanner.nextInt();
		// 입력객체명.nextInt() : int형 데이터 가져오기
	//계산
	int 초기값 = 0;
	int 실수령액 = 초기값+(int)(기본급*0.9)+수당; // int*double 후에 int형으로 변환
	//출력
	System.out.print("실수령액 : "+실수령액+"");
								//변수 데이터 호출
	
} // m e
} // c e
