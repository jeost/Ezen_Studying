package Day02;

import java.util.Scanner;

public class Day02_3 { // c s
public static void main(String[] args) { // m s
	//�Է°�ü ����
	Scanner scanner = new Scanner(System.in);
	//�Է� �ް� �ű��
	System.out.print("�⺻�� �Է� : "); int �⺻��=scanner.nextInt();
	System.out.print("���� �Է� : "); int ����=scanner.nextInt();
		// �Է°�ü��.nextInt() : int�� ������ ��������
	//���
	int �ʱⰪ = 0;
	int �Ǽ��ɾ� = �ʱⰪ+(int)(�⺻��*0.9)+����; // int*double �Ŀ� int������ ��ȯ
	//���
	System.out.print("�Ǽ��ɾ� : "+�Ǽ��ɾ�+"");
								//���� ������ ȣ��
	
} // m e
} // c e
