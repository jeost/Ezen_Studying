package Day02;

import java.util.Scanner;

public class Day02_5 { // c s
public static void main(String[] args) { // m s
	//��ĳ�� ����
	Scanner scanner = new Scanner(System.in);
	//�Է¹ޱ�
	System.out.println("�ݾ� �Է� : "); int �ݾ�=scanner.nextInt();
	int �ʸ��ڸ� = �ݾ�/100000;
	System.out.println(" �ʸ��� " + �ʸ��ڸ� + "��");
	int �ʸ������� = �ݾ�%100000; int ���ڸ� = �ʸ�������/10000;
	System.out.println(" ���� "+ ���ڸ� + "��");
	int �������� = �ݾ�%10000; int õ�ڸ� = ��������/1000;
	System.out.println(" õ�� "+ õ�ڸ� + "��");
	int õ������ = �ݾ�%1000; int ���ڸ� = õ������/100;
	System.out.println(" ��� "+ ���ڸ� + "�� �Դϴ�");
	
	System.out.println("����3) ���� �Է�:");
	int ����3=scanner.nextInt();
	System.out.println("�Է��� ������ 7�� ��� �Ǵ� : " + (����3%7==0));
	
	System.out.println("����4) ���� �Է�: ");
	int ����4 = scanner.nextInt();
	System.out.println("�Է��� ������ Ȧ�� �Ǵ� : " + (����4%2==1));
	
	System.out.println("����5) ���� �Է�: ");
	int ����5 = scanner.nextInt();
	System.out.println("�Է��� ������ 7�� ����̸鼭 ¦������ Ȯ�� : " +((����5%7==0)&&(����5%2==0)));
	
	System.out.println("����6) ���� �� �Է� ");
	int ����6_1 = scanner.nextInt(); int ����6_2 = scanner.nextInt();
	int ū�� = ����6_1 > ����6_2 ? ����6_1 : ����6_2;
	System.out.println("�� ū ���� : " + ū��);

	System.out.println("����7) ������ �Է� ");
	int ����7 = scanner.nextInt();
	System.out.println("���� ���̴� " + (����7*����7*3.14)+ "�Դϴ�");
	
	System.out.println("����8) �� �Ǽ� �Է�");
	double ����8_1 = scanner.nextDouble(); double ����8_2 = scanner.nextDouble();
	
	System.out.println("���� ���� ���� ���� " + (����8_1/����8_2*100)+ "%�Դϴ�.");

	System.out.println("����9) ��ٸ����� ������ �غ��� ���� �Է�");
	System.out.println("���� : "); int ����9_1 = scanner.nextInt();
	System.out.println("�غ� : "); int ����9_2 = scanner.nextInt();
	System.out.println("���� : "); int ����9_3 = scanner.nextInt();
	System.out.println("��ٸ����� ���̴� " + ((����9_1+����9_2)*����9_3*0.5) + "�Դϴ�.");

	System.out.println("����10) Ű�� ������ �Է� : "); int ����10 = scanner.nextInt();
	System.out.println("ǥ��ü�� : " + ((����10-100)*0.9));

	System.out.println("����11) Ű �Է� : "); double ����11_1 = scanner.nextDouble();
	System.out.println("������ �Է� : "); double ����11_2 = scanner.nextDouble();
	
	double bmiŰ = (����11_1/100);
	double bmi = ����11_2/(bmiŰ*bmiŰ);
	System.out.println("BMI�� " + (bmi) +"�Դϴ�.");
	
	
	System.out.println("����12) inch �Է�"); int ����12 = scanner.nextInt();
	System.out.println((����12*2.54)+"cm �Դϴ�.");
	
	System.out.println("����13) �߰���� ���� : "); double ����13_1 = scanner.nextDouble();
	System.out.println("�⸻��� ���� : "); Double ����13_2 = scanner.nextDouble();
	System.out.println("������ ���� : "); Double ����13_3 = scanner.nextDouble();
	double ��13 = (����13_1*0.3)+(����13_2*0.3)+(����13_3*0.4);
	System.out.printf("���� : %.2f\n" , ��13 );
	
	//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
 	//int x = 10;
	//int y = x-- + 5 + --x;
	//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
	// x : 10
	// y : 1. x-- +5 =>10+5=>15
	// 	   2. x--�� ���� => x=9
	//     3. 15 + --x(x=8)
	//     4. 15+8=23
	//����15 : ���̸� �Է¹޾� ���̰� 10���̻��̸� �л� , 20���̻��̸� ���� , 40���̻��̸� �߳� ���� ����ϱ�
	System.out.println("����15) ���� �Է� : "); int ����15 = scanner.nextInt();
	System.out.println();
	// String ���� = ����15 > 40 ? '�߳�' : '����'
	//���� 16 3���� ���� �Է¹޾� ��������
	System.out.println("���� 3�� �Է�"); int a = scanner.nextInt();
									int b = scanner.nextInt();
									int c = scanner.nextInt();
	 // a�� b���� ũ�� && a�� c���� ũ�ٸ� a
	//���1 = a > b ? 'a' : 
	
} // m e
} // c e
