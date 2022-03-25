package Day18;

import java.util.ArrayList;

public class Day18_1 {
	public static void main(String[] args){

	    ArrayList<String> list = new ArrayList<>();
	    System.out.println(list.isEmpty());
	    list.add("java");
	    list.add("jdbc");
	    list.add("servlet/jsp");
	    System.out.println("리스트 내 요소 확인" + ": list");
	    
	    list.add(2, "Database");
	    System.out.println("특정 인덱스에 추가 후 확인" + list);
	    list.add("iBATIS");
	    System.out.println("리스트 내 요소들의 개수 : " + list.size());
	    System.out.println("리스트 내 2번 인덱스 호출 : " + list.get(2));
	    for(int i = 0; i<list.size(); i++){
	        String str = list.get(i);
	        System.out.println(i+str);
	    }
	    for(String str : list){
	        System.out.println(str);
	    }
	    System.out.println("삭제 전 확인 : " + list);
	    list.remove(2);
	    System.out.println("2번 인덱스 삭제 후 확인 : " + list);
	    list.remove(2);
	    list.remove("iBATIS"); System.out.println("특정 객체 삭제 후 확인 : " + list);
	    
	    
	}
}
