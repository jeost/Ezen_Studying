package Day10;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_7_Ű����ũ {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	 	ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<>();
		//* �����Է�
		try { // ����ó��
			FileInputStream fileInputStream = new FileInputStream("D:/java/�Ե��������.txt");
		// ���� �о���� [ ���� --> ��Ʈ��(����Ʈ��) --> �ڹ� ]
			// 1. ����Ʈ �迭 ����
		 	byte[] bytes = new byte[1024];
		 	// 2. �о�ͼ� �迭�� ����
		 	fileInputStream.read(bytes);
		 	// 3. [, : �ʵ� ���� \n : ��ü ���� ]
		 	String ���ϳ��� = new String(bytes);
		 	//	String ���� �޼ҵ�		split("����") ;
		 	String[] ��ǰ��� = ���ϳ���.split("\n");

		 	for( String temp : ��ǰ���) {
		 		String[] �ʵ��� = temp.split(",");
		 		��ǰ ��ǰ = new ��ǰ(�ʵ���[0], Integer.parseInt(�ʵ���[1]), Integer.parseInt(�ʵ���[2]));
		 					// ���ڿ� --> ������ ��ȯ 
		 					// ����Ʈ ����
		 		��ǰ����Ʈ.add(��ǰ);
		 	}
		}catch(Exception e) {
			
		}
		Ű����ũ �Ե����� = new �Ե�����("��", ��ǰ����Ʈ);
		while(true) {
			�Ե�����.��ǰ���();
			int ch =scanner.nextInt();
			if(ch == -1) {
				�Ե�����.��ǰ�߰�();
			}else {
				�Ե�����.��ٱ���();
			}
		}
	}
}