package Day11;

public class Day11_2 {
	public static void main(String[] args) {
		try {
		String data = null;
		System.out.println(data.toString());
		} // try e
		catch(NullPointerException ��ü�� ) {
			System.out.println("���ܹ߻� : " + ��ü��);
		}
		try { // ���ܰ� �߻��� �� ���� �ڵ�
		String[] �迭 = new String[2]; // String 2���� �����ϴ� �迭
		�迭[0] = "a"; �迭[1] = "b"; �迭[2] = "c";
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻� : " + e);
		}
		try {
		String data1 = "100";
		String data2 = "a100"; // �Ѵ� ���ڿ�
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		}catch(NumberFormatException e) {
			System.out.println(" ���� �߻� : " + e);
		}
		try {
		String �ѹ̳� = "������"; // Object�� ��ӵ� Ŭ����
		Object ������ ;	//�ڹ� Ŭ���� �� �ֻ��� Ŭ����
		
		������ = �ѹ̳�; // ����
		�ѹ̳� = (String)������; // �Ұ���
			//���� �� ��������ȯ
		}catch(Exception e) {
			System.out.println("�����߻� : " + e);
		}
	} // m e
} // c s
