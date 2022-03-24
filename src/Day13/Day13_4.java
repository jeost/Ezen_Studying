package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Day13_4 {

	public static void main(String[] args) {
		double num = 1234567.89;
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0"); // 무조건 소수점 한자리 표시
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		//1,000 단위 구분 쉼표
		df = new DecimalFormat("#,##0원");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###원");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num));
		
		String id = "java";
		String name = "신용권";
		String tel = "010-123-5678";
		
		String text = "회원 ID : {0} \n회원 이름 : {1} \n회원 전화 : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);	//    패턴,  {0}, {1}, {2}
		
		//DB에서 사용할 예정
		String sql = "insert into member values ( {0}, {1}, {2} )";
		Object[] arguments = {"'java'", "'신용권'", "'010-123-5678'" };
		String result2= MessageFormat.format(sql, arguments);
		System.out.println(result2);
		
		//JAVA 7버전 이전엔 Date사용. 이후는 여러 API
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜 : " +currDate);
		
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시각 : " + currTime);
		
		LocalDateTime currdatetime = LocalDateTime.now();
		System.out.println("현재 날짜/시간 : " + currdatetime);
		
		// 시간 계산
		Instant instant1 = Instant.now();
		try {
		Thread.sleep(1000); // 1초 대기[ 코드 1초간 멈춤 ]
		}catch (Exception e) { // 일반예외
		}
		Instant instant2 = Instant.now();
	} // m e
}
