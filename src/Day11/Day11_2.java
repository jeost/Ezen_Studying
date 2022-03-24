package Day11;

public class Day11_2 {
	public static void main(String[] args) {
		try {
		String data = null;
		System.out.println(data.toString());
		} // try e
		catch(NullPointerException 객체명 ) {
			System.out.println("예외발생 : " + 객체명);
		}
		try { // 예외가 발생할 것 같은 코드
		String[] 배열 = new String[2]; // String 2개를 저장하는 배열
		배열[0] = "a"; 배열[1] = "b"; 배열[2] = "c";
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생 : " + e);
		}
		try {
		String data1 = "100";
		String data2 = "a100"; // 둘다 문자열
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		}catch(NumberFormatException e) {
			System.out.println(" 오류 발생 : " + e);
		}
		try {
		String 롤미녀 = "신유야"; // Object에 상속된 클래스
		Object 이주인 ;	//자바 클래스 내 최상위 클래스
		
		이주인 = 롤미녀; // 가능
		롤미녀 = (String)이주인; // 불가능
			//실행 중 강제형변환
		}catch(Exception e) {
			System.out.println("오류발생 : " + e);
		}
	} // m e
} // c s
