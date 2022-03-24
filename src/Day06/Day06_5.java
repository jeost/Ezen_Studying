package Day06;

public class Day06_5 { // c s

	public static void main(String[] args) { // m s
		
		// p.207
		
		// 1. 빈 생성자로 객체 생성
		Korean k1 = new Korean();
			//객체 생성 후 필드 값 변경
		k1.name = "유재석";
		k1.ssn = "123123-123123";
		System.out.println("k1 국적 : " + k1.nation);
		System.out.println("k1 이름 : " + k1.name);
		System.out.println("k1 주민 : " + k1.ssn);
		
		// 2. 필드 2개를 갖는 생성자로 객체 생성
		Korean k2 = new Korean("박자바", "3141592");
		System.out.println("k2 국적 : " + k2.nation);
		System.out.println("k2 이름 : " + k2.name);
		System.out.println("k2 주민 : " + k2.ssn);
		
		
		// 1. 빈 생성자 객체
		Korean 한국인1 = new Korean();
			// 국적 있고 나머지 데이터 없음
		// 2. 필드 1개 생성자 객체 생성
		Korean 한국인2 = new Korean("유재석");
			// 국적, 이름 있고 나머지 없음
		// 3. 필드 2개 생성자 객체 생성
		Korean 한국인3 = new Korean("강호동" , "010010");
			// 국적, 이름, 주민 있고 나머지 없음
		// 4. 필드 3개 생성자 객체 생성
		Korean 한국인4 = new Korean("엄","준","식");
		
	} // m e
	
} // c e
