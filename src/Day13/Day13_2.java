package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day13_2 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(" 현재 날짜/시간 : " + date);
		System.out.println("객체정보메소드 : " + date.toString());
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// 날짜에 형식 적용						형식객체.format(날짜객체)
		System.out.println("날짜형식변경 : " + simpleDateFormat.format(date));
		
		Calendar now = Calendar.getInstance(); // Calendar 클래스 내 객체를 호출. 별도 객체생성 x
		System.out.println("연도 : " + now.get(Calendar.YEAR));
		System.out.println("월 : " + (now.get(Calendar.MONTH)+1));
		System.out.println("일 : " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 : " + now.get(Calendar.DAY_OF_WEEK)); // 1234567 일월화수목금토
		
		//요일 숫자->한글 변환시키기
		int week = now.get(Calendar.DAY_OF_WEEK);
		String 요일 = null;
		switch(week) {
		case 1 : 요일 = "일"; break;
		case 2 : 요일 = "월"; break;
		case 3 : 요일 = "화"; break;
		case 4 : 요일 = "수"; break;
		case 5 : 요일 = "목"; break;
		case 6 : 요일 = "금"; break;
		case 7 : 요일 = "토"; break;
		}
		System.out.println("요일(한글로) :" + 요일);
		
		//오전, 오후
		System.out.println("오전/오후 : " + now.get(Calendar.AM_PM)); // 0 오전 1 오후
		int ampm = now.get(Calendar.AM_PM);
		String 오전오후 = null;
		if (ampm == 0) {
			오전오후 = "오전";
		}else 오전오후 = "오후";
		
		System.out.println("오전/오후 : " + 오전오후);
		
		System.out.println(" 시 : " + now.get(Calendar.HOUR));
		System.out.println(" 분 : " + now.get(Calendar.MINUTE));
		System.out.println(" 초 : " + now.get(Calendar.SECOND));
		
		// ZonedDateTime 클래스 : 세계협정시
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정시 : " + zonedDateTime);
		zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울시간 : " + zonedDateTime);
		zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕시간 : " + zonedDateTime);
	} // m e
	
}
