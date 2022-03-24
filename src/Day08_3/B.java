package Day08_3;

public class B { // c s
//A와 패키지 같고 클래스 다름
	//필드
	A a1 = new A(true);
	
	
	A a2 = new A(1);	
	//A a3 = new A("문자"); private라서 호출불가
	
	//생성자
	public B() {
		A a = new A(true);
		a.field1 = 1;
		a.field2 = 2;
		// a.field3=1; // 불가
		
		a.method1();
		a.method2();
		
		
	}
} // c e