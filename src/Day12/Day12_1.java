package Day12;

import java.io.IOException;

public class Day12_1 {

	public static void main(String[] args) throws IOException {
		
		byte[] bytes = {72, 101,108,108,111,32,74,97,118,97}; // �������� ����Ʈ�� ������ �� �ִ� ����Ʈ �迭 ����
		
		String str1 = new String(bytes);
		
		System.out.println("����Ʈ�迭 -> ���ڿ� ��ȯ : " + str1);
		
		
		byte[] bytes2 = new byte[100];
		
		System.out.println("�Է� : "); int readByteNo = System.in.read(bytes2);
	}
	
}
