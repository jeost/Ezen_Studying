package Day11;

public class Day11_3 { // c s

	public static void main(String[] args) {
		findclass();
		try {
		withdraw(30000);
		}catch(Exception e) {System.out.println(e);}
	}
	public static void findclass() {
		try { // ���� �߻��� ����Ǵ� �ڵ�(���࿹��) or �Ϲݿ���[������]
		Class clazz = Class.forName("java.lang.String2");
		}catch(Exception e) {System.out.println("���� : " +e); // ���� �߻��� ��� ����
		}
	}
	
	public static void withdraw(int money) throws Exception { 
		if( 20000 < money ) {
			throw new Exception("�ܰ����");
		}
	}
} // c e
