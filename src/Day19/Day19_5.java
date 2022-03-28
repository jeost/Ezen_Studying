package Day19;

import java.util.TreeSet;

public class Day19_5 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		System.out.println("------�ڵ� ����------");
		scores.add(87); scores.add(98);
		scores.add(75); scores.add(95); scores.add(80);
		
		System.out.println(scores.first()); System.out.println(scores.last());
		System.out.println(scores.lower(95)); // 95 ���� ���ʳ��
		System.out.println(scores.higher(95)); // 95 ���� �����ʳ��
		
		System.out.println(scores.floor(95)); // 95 ���� ����
		System.out.println(scores.ceiling(95)); // 95 ���� ������
		
		System.out.println(scores.pollFirst()); // ���� ���ʳ�� ����
		System.out.println(scores.pollLast()); // ���� �����ʳ�� ����
		System.out.println("Ȯ�� : " + scores);
		
		//�������� vs ��������
		System.out.println("�⺻[��������] : " + scores);
		//��������
		System.out.println("�������� : " + scores.descendingSet()); // �ݴ�� ������
		
		for(Integer temp : scores) {
			System.out.println(temp);
		}
		for(Integer temp : scores.descendingSet()) {
			System.out.println(temp);
		}
	}
}
