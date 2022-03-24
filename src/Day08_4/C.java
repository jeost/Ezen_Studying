package Day08_4;

import Day08_3.A;

public class C { // c s
	//A클래스랑 패키지 다르고 클래스도 다름
	A a1 = new A(true); // public이라 호출 가능
	// A a2 = new A(1);
	// A a3 = new A("문자");
	
	public C() {
		A a = new A(true);
		a.field1 = 1;
		// a.field2 = 1;
		// a.field3 = 1;
		
		a.method1();
		// a.method2();
		// a.method3();
	}
} // c e