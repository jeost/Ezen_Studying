package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day13_2 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(" ���� ��¥/�ð� : " + date);
		System.out.println("��ü�����޼ҵ� : " + date.toString());
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		// ��¥�� ���� ����						���İ�ü.format(��¥��ü)
		System.out.println("��¥���ĺ��� : " + simpleDateFormat.format(date));
		
		Calendar now = Calendar.getInstance(); // Calendar Ŭ���� �� ��ü�� ȣ��. ���� ��ü���� x
		System.out.println("���� : " + now.get(Calendar.YEAR));
		System.out.println("�� : " + (now.get(Calendar.MONTH)+1));
		System.out.println("�� : " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("���� : " + now.get(Calendar.DAY_OF_WEEK)); // 1234567 �Ͽ�ȭ�������
		
		//���� ����->�ѱ� ��ȯ��Ű��
		int week = now.get(Calendar.DAY_OF_WEEK);
		String ���� = null;
		switch(week) {
		case 1 : ���� = "��"; break;
		case 2 : ���� = "��"; break;
		case 3 : ���� = "ȭ"; break;
		case 4 : ���� = "��"; break;
		case 5 : ���� = "��"; break;
		case 6 : ���� = "��"; break;
		case 7 : ���� = "��"; break;
		}
		System.out.println("����(�ѱ۷�) :" + ����);
		
		//����, ����
		System.out.println("����/���� : " + now.get(Calendar.AM_PM)); // 0 ���� 1 ����
		int ampm = now.get(Calendar.AM_PM);
		String �������� = null;
		if (ampm == 0) {
			�������� = "����";
		}else �������� = "����";
		
		System.out.println("����/���� : " + ��������);
		
		System.out.println(" �� : " + now.get(Calendar.HOUR));
		System.out.println(" �� : " + now.get(Calendar.MINUTE));
		System.out.println(" �� : " + now.get(Calendar.SECOND));
		
		// ZonedDateTime Ŭ���� : ����������
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("������ : " + zonedDateTime);
		zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("����ð� : " + zonedDateTime);
		zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("����ð� : " + zonedDateTime);
	} // m e
	
}
