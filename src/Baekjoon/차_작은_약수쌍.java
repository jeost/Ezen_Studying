package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class ��_����_����� {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			ArrayList<Integer> c = new ArrayList<>();
			//��� ã��
			for(int i=1; i<=a; i++) {
				if(a%i==0) { // i�� a�� �����
					c.add(i); // �������� ����� �����ϱ�
				}
			}
			int b = 60;
			int d = a; // �ϴ� ū �� ����
			for(int temp : c) {
				if(d>Math.abs(temp-a/temp)) { // ���̰� �� ������ �۵�
				d = Math.abs(temp-(a/temp)); // ������� ���� ����
				b = temp; //b�� �ش� �ε����� �� ����
				}
			}
			System.out.println("���� ���̰� ���� ����� : "+b+","+a/b);			
		}catch(Exception e) {System.out.println(e);}
	}// m e
}
