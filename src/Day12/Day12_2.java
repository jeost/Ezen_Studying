package Day12;

public class Day12_2 {

	public static void main(String[] args) {
		
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); // 7�� �ε����� ���ڸ� ����
		switch(sex) {
		case'1':
		case'3':
			System.out.println("���� �Դϴ�.");
			break;
		case'2':
		case'4':
			System.out.println("���� �Դϴ�.");
			break;
		}
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö";
		if(strVar1 == strVar2) {
			System.out.println("���� String ��ü�� ����");
		}else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("���� ���ڿ��� ����");
		}else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}
		String str = "�ȳ��ϼ���";
		
		byte[]bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("����Ʈ�� -> ���ڿ� : " + str1);
		try {
		byte[]bytes2 = str.getBytes("EUC-KR");
		System.out.println("EUC-KR ���� : " + bytes2.length);
		String str2 = new String( bytes2 , "EUC-KR");
		System.out.println("����Ʈ�� -> ���ڿ� : " +str2);
		
		byte[]bytes3 = str.getBytes("UTF-8");
		System.out.println("UTF-8 ���� : " + bytes3.length);
		String str3 = new String( bytes3 , "UTF-8");
		System.out.println("����Ʈ�� -> ���ڿ� : " +str3);
			}catch (Exception e) {
		}
		
		String subject ="�ڹ� ���α׷���";
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹ� ���� å");
		}else {
			System.out.println("�ڹ� ���� x");
		}
		
		String ssn1 = "7306241230123";
		int length = ssn1.length(); // ���ڿ� ���� ���� ����
		if(length == 13) {
			System.out.println("�ֹι�ȣ �ڸ��� ����");
		}else {
			System.out.println("�ֹι�ȣ �ڸ��� Ʋ��");
		}
		
		//replace("���� ����" , "�� ����") : ���ڿ� ��ġ(����)
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String ssn2 = "880815-1234567";
		String firstNum = ssn2.substring(0,6);
		System.out.println("Ȯ�� : " + firstNum);
		
		String secondNum = ssn2.substring(7);
		System.out.println("Ȯ�� : " + secondNum);
		
		System.out.println("�պκ� : "+ssn2.split("-")[0]);
		System.out.println("�޺κ� : "+ssn2.split("-")[1]);
		
		//valueOf() : �⺻Ÿ��->���ڿ� ��ȯ
		
	String str2 = String.valueOf(10); // int�� 10->String 10���� ����
	String str3 = String.valueOf(10.5); // double�� ���ϻ���
	String str4 = String.valueOf(true); // boolean�� ���ϻ���
	String str5 = 10+"";
	System.out.println(str2 + 10);
	System.out.println(str3 + 10);
	}
}