package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_달력 {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연도 : "); int year = scanner.nextInt();
		System.out.println("월 : "); int month = scanner.nextInt();
		//캘린더 클래스 내 객체 호출
		달력(year, month);
		
	} // m e
	
	//달력 메소드
	public static void 달력(int year, int month){ // 달 s
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		// 연도 일 월
//			int year = calendar.get(calendar.YEAR);
//			int month = (calendar.get(calendar.MONTH)+1);
		while(true) {
		int day = calendar.get(calendar.DAY_OF_MONTH);
		// 해당 월의 1일의 요일찾기
			// 사용자 정의 캘린더 설정
			calendar.set(year, month-1, 1); // 현재 월의 1일로 설정
			
			int sweek = calendar.get(Calendar.DAY_OF_WEEK); //3월 1일의 요일 구하기
		
			int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH); // 3월의 마지막 일 구하기
			
		//출력
		System.out.println("****" + year + "년" + month + "월 ****");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		// 현재 월의 1일의 위치 앞의 공백 채우기
		for(int i = 1; i<sweek; i++) { // sweek가 3
			System.out.print("\t");
		}
		for(int i = 1; i<=eday; i++) { // 마지막 날 까지 출력
			System.out.print(i+"\t");
			//토요일마다 줄바꿈처리 해야함[7배수]
			if(sweek%7 == 0) {
			System.out.print("\n");	
			}
			sweek++;
		}
		//버튼 [ 1. 이전달 2. 다음달 3. 다시검색 ]
		try {
		System.out.println("1. 이전달 2. 다음달 3. 다시검색 4. 종료");
		int ch = scanner.nextInt();
		
		switch (ch) {
		case 1 : month-=1; if( month == 0) {year -= 1; month=12;} break; 
		case 2 : month+=1; if(month == 13) { month = 1; year +=1;} break;
		case 3 : System.out.println("연도 : "); year = scanner.nextInt(); System.out.println(" 월 : "); month = scanner.nextInt();
		case 4 : return; // 메소드 종료
			}
		}catch (Exception e) { System.out.println("제대로 입력");
			}
		}
	} // 달 e
} // c e
