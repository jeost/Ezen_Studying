package Day19;

import java.util.Hashtable;
import java.util.Scanner;

public class Day19_4 {
	public static void main(String[] args) {
	
		Hashtable<String, String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵� : "); String id = scanner.next();
			System.out.println("��й�ȣ : "); String pw = scanner.next();
			
			if(map.containsKey(id)) { // ���� �Է��� id�� map��ü�� key�� �����ϸ� true�� ��ȯ
				if(map.get(id).equals(pw)) // id�� �ش��ϴ� ��(pw) ȣ��� �Է��� pw�� �����ϸ�
					{
				System.out.println("�α��� �Ǿ����ϴ�.");
					}else {
						System.out.println("�Է��� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					}
		}else {
			System.out.println("�Է��� ���̵� �������� �ʽ��ϴ�");
			}	
		}
	}
}
