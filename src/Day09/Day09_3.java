package Day09;

public class Day09_3 { // c s
	public static void main(String[] args) { // m s
		// p.294~295
		// 1. 서브클래스로 객체생성
		Student student = new Student("홍길동" , "1234" , 1);
		// 2. 서브클래스로 만든 객체로 슈퍼클래스내 멤버 접근
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		// 3. 
		System.out.println("studentNo : " + student.studentNo);
	} // m e
} // c e
