package Day06;

public class Day06_5 { // c s

	public static void main(String[] args) { // m s
		
		// p.207
		
		// 1. �� �����ڷ� ��ü ����
		Korean k1 = new Korean();
			//��ü ���� �� �ʵ� �� ����
		k1.name = "���缮";
		k1.ssn = "123123-123123";
		System.out.println("k1 ���� : " + k1.nation);
		System.out.println("k1 �̸� : " + k1.name);
		System.out.println("k1 �ֹ� : " + k1.ssn);
		
		// 2. �ʵ� 2���� ���� �����ڷ� ��ü ����
		Korean k2 = new Korean("���ڹ�", "3141592");
		System.out.println("k2 ���� : " + k2.nation);
		System.out.println("k2 �̸� : " + k2.name);
		System.out.println("k2 �ֹ� : " + k2.ssn);
		
		
		// 1. �� ������ ��ü
		Korean �ѱ���1 = new Korean();
			// ���� �ְ� ������ ������ ����
		// 2. �ʵ� 1�� ������ ��ü ����
		Korean �ѱ���2 = new Korean("���缮");
			// ����, �̸� �ְ� ������ ����
		// 3. �ʵ� 2�� ������ ��ü ����
		Korean �ѱ���3 = new Korean("��ȣ��" , "010010");
			// ����, �̸�, �ֹ� �ְ� ������ ����
		// 4. �ʵ� 3�� ������ ��ü ����
		Korean �ѱ���4 = new Korean("��","��","��");
		
	} // m e
	
} // c e
