package Day08_3;

public class A { // c s
	//������ Ŭ��������
	
	//�ʵ�
	A a1 = new A(true); // �� Ŭ�������� public ȣ�� ����
	A a2 = new A(1); 	// �� Ŭ�������� default ȣ�� ����
	A a3 = new A("����");// �� Ŭ�������� private ȣ�� ����
	
	public int field1;
	int field2;
	private int field3;
	//������
	public A(boolean b) {
		field1= 1;
		field2= 1;
		field3= 1;
		
		method1();
		method2();
		method3();
		//������ Ŭ������ ���� ����
		
	} // ������
	A(int b){}				//�� Ŭ���� ��
	private A(String s) {} // �� Ŭ���� ��
	//�޼ҵ�
	public void method1() {}
	void method2() {}
	private void method3() {}
} // c e
