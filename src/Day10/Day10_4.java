package Day10;

import java.util.ArrayList;

public class Day10_4 {
	public static void main(String[] args) {
		//�迭[�ε��� 0���� ����]
		String[] �迭�̸� = new String[100];
		System.out.println(" �迭 : " + �迭�̸�); // �޸� �ּҰ�
		�迭�̸�[0] = "��"; // �迭 [ �ε��� ] : �ε��� ��ȣ �������� ����
		System.out.println("�迭[0] : "+�迭�̸�[0]);
		//����Ʈ[Ŭ���� ����� �迭����]
		ArrayList<String> ����Ʈ�̸� = new ArrayList<>();
	// ArrayList [�ڵ��ϼ�]
		// <�ڷ���> : list�� ������ �ڷ���
		// ����Ʈ�� : ���� �ƹ��ų�
		// new : ��ü ������ �޸� �Ҵ�
		// Arraylist<>(); : ������
		System.out.println("����Ʈ : "+����Ʈ�̸�); // �޸� ���
		����Ʈ�̸�.add("��"); // ����Ʈ�� ��ü �߰��ϴ� �޼ҵ�
		System.out.println("����Ʈ[0] : " + ����Ʈ�̸�.get(0)); // ����Ʈ��.get(�ε���) ��üȣ��
		// ����Ʈ��.size() ����Ʈ����ȣ��
		System.out.println("���� : " + ����Ʈ�̸�.size());
		
		
	}
}
