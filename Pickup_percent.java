package Baekjoon;

import java.util.Scanner;

public class Pickup_percent {
	public static void main(String[] args) {
		System.out.println("---�����ڳ� �Ⱦ�ĳ ȹ�� Ȯ�� ����---");
		double P=0.0; // Ȯ��
		double A=0.0; // ���Ȯ��(%)
		try (Scanner scanner = new Scanner(System.in)) {
			while(true) {
				System.out.println("�Ⱦ� Ȯ�� ����");
				System.out.println("1 : 0.7% , 2 : 1.4%"); int p = scanner.nextInt();
				System.out.println("��� ������ ��� �Է� : "); int j = scanner.nextInt();
				
				int J = j/150; // J�� ��í ���� Ƚ��
				System.out.println("���� ���� �Է� : "); int s = scanner.nextInt();
				if(s>=300) {System.out.println("�峭 ��");}
				if(J+s>=300) {System.out.println("õ�� ����");}
				else {
				if(p==1) { // Ȯ���� 0.7%��
					P = 1-Math.pow(0.993, J);
				}else if(p==2) { // Ȯ���� 1.4%��
					P = 1-Math.pow(0.986, J);
				}
				A=P*100;
				System.out.println("�� ���� �Ⱦ�ĳ�� ���� Ȯ���� "+A+"% �Դϴ�.");
				}
			} // while e
		}catch(Exception e) {System.out.println(e);}
	} // main e
}
