package Day07;

public class Calculator { // c s

	void powerOn() { // �μ� x ��ȯ x
		System.out.println("������ �մϴ�.");
	}
	
	int plus( int x , int y ) {
		int result = x+y;
		return result; // �Լ� ȣ���� ������ ��ȯ
	}
	
	
	double divide(int x, int y) { //�μ�o��ȯo
//  ����Ÿ��	�޼ҵ��	//(�μ�1, �μ�2) {�����ڵ�; return �Ǽ���}
		double result = (double)x / (double)y;
			// ���� ����ȯ �ؾ� �Ҽ��� ���͵� Ŀ������
		return result; // ������� �޼ҵ� ȣ���Ѱ����� �̵�
	}
	void powerOff() { //�μ�x��ȯx
		//����Ÿ�� �޼ҵ�� () {}
		System.out.println("������ ���ϴ�.");
	}
} // c e
