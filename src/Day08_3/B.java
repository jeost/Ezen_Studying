package Day08_3;

public class B { // c s
//A�� ��Ű�� ���� Ŭ���� �ٸ�
	//�ʵ�
	A a1 = new A(true);
	
	
	A a2 = new A(1);	
	//A a3 = new A("����"); private�� ȣ��Ұ�
	
	//������
	public B() {
		A a = new A(true);
		a.field1 = 1;
		a.field2 = 2;
		// a.field3=1; // �Ұ�
		
		a.method1();
		a.method2();
		
		
	}
} // c e