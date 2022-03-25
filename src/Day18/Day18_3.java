package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day18_3 {

	public static void main(String[] args) {
		//ArrayList ��ü ����
		ArrayList<String> list1 = new ArrayList<>();
		//LinkedList ��ü ����
		LinkedList<String> list2 = new LinkedList<>();
		
		
		Long starttime; // ���۽ð�
		Long endtime; // ������ �ð�
		
		starttime = System.nanoTime(); // ���� �ð�(�������) ȣ��
		for(int i = 0; i<10000; i++) {
			list1.add(0, i+"");
		}
		endtime = System.nanoTime();
		System.out.println("Arraylist�� 1���� �����Ҷ� �ɸ��� �ð� :"+(endtime-starttime));
		
		Long starttime1; // ���۽ð�
		Long endtime1; // ������ �ð�
		
		starttime1 = System.nanoTime(); // ���� �ð�(�������) ȣ��
		for(int i = 0; i<10000; i++) {
			list2.add(0, i+"");
		}
		endtime1 = System.nanoTime();
		System.out.println("Linkedlist�� 1���� �����Ҷ� �ɸ��� �ð� :"+(endtime1-starttime1));
		
	}
}
