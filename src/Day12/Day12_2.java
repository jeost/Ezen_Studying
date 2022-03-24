package Day12;

public class Day12_2 {

	public static void main(String[] args) {
		
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); // 7번 인덱스의 문자를 추출
		switch(sex) {
		case'1':
		case'3':
			System.out.println("남자 입니다.");
			break;
		case'2':
		case'4':
			System.out.println("여자 입니다.");
			break;
		}
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
		String str = "안녕하세요";
		
		byte[]bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("바이트열 -> 문자열 : " + str1);
		try {
		byte[]bytes2 = str.getBytes("EUC-KR");
		System.out.println("EUC-KR 길이 : " + bytes2.length);
		String str2 = new String( bytes2 , "EUC-KR");
		System.out.println("바이트열 -> 문자열 : " +str2);
		
		byte[]bytes3 = str.getBytes("UTF-8");
		System.out.println("UTF-8 길이 : " + bytes3.length);
		String str3 = new String( bytes3 , "UTF-8");
		System.out.println("바이트열 -> 문자열 : " +str3);
			}catch (Exception e) {
		}
		
		String subject ="자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바 관련 책");
		}else {
			System.out.println("자바 관련 x");
		}
		
		String ssn1 = "7306241230123";
		int length = ssn1.length(); // 문자열 내의 문자 갯수
		if(length == 13) {
			System.out.println("주민번호 자리수 맞음");
		}else {
			System.out.println("주민번호 자리수 틀림");
		}
		
		//replace("기존 문자" , "새 문자") : 문자열 대치(변경)
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String ssn2 = "880815-1234567";
		String firstNum = ssn2.substring(0,6);
		System.out.println("확인 : " + firstNum);
		
		String secondNum = ssn2.substring(7);
		System.out.println("확인 : " + secondNum);
		
		System.out.println("앞부분 : "+ssn2.split("-")[0]);
		System.out.println("뒷부분 : "+ssn2.split("-")[1]);
		
		//valueOf() : 기본타입->문자열 변환
		
	String str2 = String.valueOf(10); // int형 10->String 10으로 변경
	String str3 = String.valueOf(10.5); // double형 이하생략
	String str4 = String.valueOf(true); // boolean형 이하생략
	String str5 = 10+"";
	System.out.println(str2 + 10);
	System.out.println(str3 + 10);
	}
}