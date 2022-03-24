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
		
		df = new DecimalFormat("#.0"); // ������ �Ҽ��� ���ڸ� ǥ��
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		//1,000 ���� ���� ��ǥ
		df = new DecimalFormat("#,##0��");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###��");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num));
		
		String id = "java";
		String name = "�ſ��";
		String tel = "010-123-5678";
		
		String text = "ȸ�� ID : {0} \nȸ�� �̸� : {1} \nȸ�� ��ȭ : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);	//    ����,  {0}, {1}, {2}
		
		//DB���� ����� ����
		String sql = "insert into member values ( {0}, {1}, {2} )";
		Object[] arguments = {"'java'", "'�ſ��'", "'010-123-5678'" };
		String result2= MessageFormat.format(sql, arguments);
		System.out.println(result2);
		
		//JAVA 7���� ������ Date���. ���Ĵ� ���� API
		LocalDate currDate = LocalDate.now();
		System.out.println("���� ��¥ : " +currDate);
		
		LocalTime currTime = LocalTime.now();
		System.out.println("���� �ð� : " + currTime);
		
		LocalDateTime currdatetime = LocalDateTime.now();
		System.out.println("���� ��¥/�ð� : " + currdatetime);
		
		// �ð� ���
		Instant instant1 = Instant.now();
		try {
		Thread.sleep(1000); // 1�� ���[ �ڵ� 1�ʰ� ���� ]
		}catch (Exception e) { // �Ϲݿ���
		}
		Instant instant2 = Instant.now();
	} // m e
}
