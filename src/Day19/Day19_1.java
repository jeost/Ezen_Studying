package Day19;

import java.util.HashSet;
import java.util.Iterator;

public class Day19_1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("java"); System.out.println("Ȯ�� : " + set);
		set.add("JDBC");	System.out.println("Ȯ�� : " + set);
		set.add("Servlet/JSP");	System.out.println("Ȯ�� : " + set);
		set.add("java");	System.out.println("Ȯ�� : " + set); // �ߺ��Ұ�
		set.add("iBATIS"); System.out.println("Ȯ�� : " + set);
		
		System.out.println("set ���� ��ü �� : " + set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { // ���� ���(��ü) ���� ���� Ȯ��(boolean��)
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		//for���� �÷��� Ȱ��  for(�ӽ� ��ü�� : �÷���/�迭) : �÷���/�迭 �� ��ҵ� �ϳ��� �ӽð�ü�� ����
		for(String element : set) {
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC"); System.out.println("Ȯ�� : " + set);
		set.remove("iBATIS"); System.out.println("Ȯ�� : " + set);
		
		set.clear(); System.out.println("Ȯ�� : " + set);
		
	}
}
