package Day08_3;

public class A { // c s
	//전범위 클래스선언
	
	//필드
	A a1 = new A(true); // 현 클래스에서 public 호출 가능
	A a2 = new A(1); 	// 현 클래스에서 default 호출 가능
	A a3 = new A("문자");// 현 클래스에서 private 호출 가능
	
	public int field1;
	int field2;
	private int field3;
	//생성자
	public A(boolean b) {
		field1= 1;
		field2= 1;
		field3= 1;
		
		method1();
		method2();
		method3();
		//동일한 클래스라서 전부 가능
		
	} // 전범위
	A(int b){}				//현 클래스 내
	private A(String s) {} // 현 클래스 내
	//메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
} // c e
