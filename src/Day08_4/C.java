package Day08_4;

import Day08_3.A;

public class C { // c s
	//AŬ������ ��Ű�� �ٸ��� Ŭ������ �ٸ�
	A a1 = new A(true); // public�̶� ȣ�� ����
	// A a2 = new A(1);
	// A a3 = new A("����");
	
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