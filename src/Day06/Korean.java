package Day06;

public class Korean { // c s

	//* Korean 클래스 선언
	
	// 1. 필드
	String nation = "대한민국";
		// 국가 변수에 미리 대한민국 대입
	String name ;
		// 이름
	String ssn;
	// 2. 생성자
		//빈생성자
		Korean(){}
			
		//필드 1개를 갖는 생성자
		Korean(String n){
			name = n;
		}
		//필드 2개를 갖는 생성자
		Korean(String n, String s) {
		name = n;
		ssn = s;}
		
		// 필드 3개를 갖는 생성자
		Korean( String nation ,
				String name ,
				String ssn){
			this.nation = nation;
			this.name = name;
			this.ssn = ssn;
		}
		
		// 3. 메소드
	

	
} // c e
