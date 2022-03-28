package Day19;

import java.util.HashSet;
import java.util.Iterator;

public class Day19_1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("java"); System.out.println("확인 : " + set);
		set.add("JDBC");	System.out.println("확인 : " + set);
		set.add("Servlet/JSP");	System.out.println("확인 : " + set);
		set.add("java");	System.out.println("확인 : " + set); // 중복불가
		set.add("iBATIS"); System.out.println("확인 : " + set);
		
		System.out.println("set 안의 객체 수 : " + set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { // 다음 요소(객체) 존재 여부 확인(boolean값)
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		//for문과 컬렉션 활용  for(임시 객체명 : 컬렉션/배열) : 컬렉션/배열 내 요소들 하나씩 임시객체명에 대입
		for(String element : set) {
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC"); System.out.println("확인 : " + set);
		set.remove("iBATIS"); System.out.println("확인 : " + set);
		
		set.clear(); System.out.println("확인 : " + set);
		
	}
}
