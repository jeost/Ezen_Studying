package Day19;

import java.util.HashSet;
import java.util.Scanner;

public class Day19_2 {
	//�ζ� ���α׷�
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		
		while(true) {
			System.out.println("1~45 ���� ����(�ߺ��Ұ�) :");
			int num = scanner.nextInt();
			
			if(num<1 || num>45) { // || : and������
				System.out.println("�����Ҽ� ���� ��ȣ�Դϴ�");
			}else {
				set.add(num);
				System.out.println("Ȯ�� : " + set);
			}
			if(set.size()==6) {
				break;
			}
		}
	}
	
}
