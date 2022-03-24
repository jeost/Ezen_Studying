package Day06;

public class Day06_1 { // c s 
	
	public static void main(String[] args) { // m s
		// 예1) p.195
		Student s1 = new Student();
		// 1. Student : 정의된 클래스명
		// 2. student : 객체명[아무거나 가능] : 권장[ 클래스명 소문자]
		// 3. new 연산자 : 메모리 생성
		// 4. Student() : 생성자명( )
		// * 객체 생성시 4가지가 필요
		System.out.println(" s1 변수가 Student 객체를 참조합니다. ");
		System.out.println( s1 );
		
		Student s2 = new Student();
		System.out.println(" s2 변수가 또 다른 Student 객체를 참조합니다. ");
		System.out.println( s2 );
	} // m e
	
} // c e