package Day12;

import java.util.Random;

public class Day12_4 {

	// ������ȣ ���� ���α׷�(�� 4���ڸ�)
	//����
		//1. ���� 0000~9999 ���� ���� 10�� �����ؼ� �迭�� ����
		//2. ��� ���� ��ȣ�� �迭�� ����
		//3. ���ڸ� ��ȣ�� Ȧ/¦ ����
		//4. ���ڸ� ��ȣ�� Ȧ���� ���� �迭�� ����
		//5. ���ڸ� ��ȣ�� ¦���� ���� �迭�� ����
	
	public static void main(String[] args) {
		
		Random random = new Random();
		String[] Ȧ�� = new String[10];
		String[] ¦�� = new String[10];
		  // ����1 ����10������
			int intnum=random.nextInt(10000);
			String strnum = String.format("%04d", intnum);
		
		String[] cNum = new String[10];
		
		for(int i = 0; i<cNum.length; i++) { // ���� 2 ������ȣ �迭�� ����
			if(cNum[i] == null) {
			cNum[i] = strnum;
			}
		}
//		int b = 0;
//		for(String temp : cNum) { // ���� 3 ���� �� 
//		if (Integer.parseInt(temp.charAt(3)==1) { // �������� 1�� Ȧ����
//			Ȧ��[b] = cNum[j]; b++;
//			}
//		}
		int c = 0;
		for(int a = 0; a<cNum.length; a++) { // ���� 3 ���� �� 
		if (cNum[a].charAt(3)%2==0) { // �������� 0�� ¦����
			¦��[c] = cNum[a]; c++;
			}
		}
		//��� ���� ��ȣ ���
		System.out.println("�������� ��� ���� ��ȣ");
		for(String temp : cNum) {
			if(temp != null) {
				System.out.println(temp + "");
			}
		}
	} // m e
}
