package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4_����� {

	public static void main(String[] args) {
		//����� ���α׷�
			//�޴� : [��] 1. ����߰� 2. ������ [������] ���������
				//����߰� : �ο����� �Է¹޾� ����ȣ ��ȯ
				//������ : ����ȣ�� �Է¹޾� ��� ���
				//��������� : ù��°�� ������� ����ȣ ȣ��
		int ����ȣ = 1; // ������ ����ȣ
		ArrayList<���> ����� = new ArrayList<>();
			//�������� ��� ��ü ���� ������ ����Ʈ
		Scanner scanner = new Scanner(System.in);
		while(true) {
			//�ݺ������� ����Ʈ�� ��� ��ü ȣ��
				for(��� temp : �����) {
					System.out.println("����ȣ     �ο��� \t ��⿹��ð�");
					if(�����.indexOf(temp)==0) {
						System.out.println(temp.����ȣ + "\t" + temp.�ο���+"\t"+"�� ����");
					}
					else System.out.println(temp.����ȣ + "\t" + temp.�ο���+"\t"+�����.indexOf(temp)*3+"��");
				}
			
			System.out.println("[��]1.����߰� 2.������");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("��ȭ��ȣ : "); String ��ȭ��ȣ = scanner.next();
				System.out.println("�ο��� : "); int �ο��� = scanner.nextInt();
				//���� 1�� ��ü�� ��ġ��
				��� temp = new ���(����ȣ, ��ȭ��ȣ, �ο���);
				//��� �ο����� ����Ʈ�� ����
				�����.add(temp);
				����ȣ++;
			}
			else if(ch==2) {
				System.out.println("����ȣ : "); int ��������ȣ = scanner.nextInt();
				for(��� temp : �����) {
					if(temp.����ȣ==��������ȣ) {
						�����.remove(temp); break;
					}
				}
			}else if(ch==3) {
				System.out.println("���� ���� ������� �����ŵ�ϴ�."); �����.remove(0);
			}else {
				
			}
		}
	}
}
