package Day18;

import java.util.ArrayList;

public class Day18_1 {
	public static void main(String[] args){

	    ArrayList<String> list = new ArrayList<>();
	    System.out.println(list.isEmpty());
	    list.add("java");
	    list.add("jdbc");
	    list.add("servlet/jsp");
	    System.out.println("����Ʈ �� ��� Ȯ��" + ": list");
	    
	    list.add(2, "Database");
	    System.out.println("Ư�� �ε����� �߰� �� Ȯ��" + list);
	    list.add("iBATIS");
	    System.out.println("����Ʈ �� ��ҵ��� ���� : " + list.size());
	    System.out.println("����Ʈ �� 2�� �ε��� ȣ�� : " + list.get(2));
	    for(int i = 0; i<list.size(); i++){
	        String str = list.get(i);
	        System.out.println(i+str);
	    }
	    for(String str : list){
	        System.out.println(str);
	    }
	    System.out.println("���� �� Ȯ�� : " + list);
	    list.remove(2);
	    System.out.println("2�� �ε��� ���� �� Ȯ�� : " + list);
	    list.remove(2);
	    list.remove("iBATIS"); System.out.println("Ư�� ��ü ���� �� Ȯ�� : " + list);
	    
	    
	}
}
