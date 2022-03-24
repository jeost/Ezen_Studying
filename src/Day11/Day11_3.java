package Day11;

public class Day11_3 { // c s

	public static void main(String[] args) {
		findclass();
		try {
		withdraw(30000);
		}catch(Exception e) {System.out.println(e);}
	}
	public static void findclass() {
		try { // 에러 발생이 예상되는 코드(실행예외) or 일반예외[무조건]
		Class clazz = Class.forName("java.lang.String2");
		}catch(Exception e) {System.out.println("오류 : " +e); // 예외 발생시 대신 실행
		}
	}
	
	public static void withdraw(int money) throws Exception { 
		if( 20000 < money ) {
			throw new Exception("잔고부족");
		}
	}
} // c e
