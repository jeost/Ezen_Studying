package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day18_3 {

	public static void main(String[] args) {
		//ArrayList 객체 선언
		ArrayList<String> list1 = new ArrayList<>();
		//LinkedList 객체 선언
		LinkedList<String> list2 = new LinkedList<>();
		
		
		Long starttime; // 시작시간
		Long endtime; // 끝나는 시간
		
		starttime = System.nanoTime(); // 현재 시간(나노단위) 호출
		for(int i = 0; i<10000; i++) {
			list1.add(0, i+"");
		}
		endtime = System.nanoTime();
		System.out.println("Arraylist가 1만개 삽입할때 걸리는 시간 :"+(endtime-starttime));
		
		Long starttime1; // 시작시간
		Long endtime1; // 끝나는 시간
		
		starttime1 = System.nanoTime(); // 현재 시간(나노단위) 호출
		for(int i = 0; i<10000; i++) {
			list2.add(0, i+"");
		}
		endtime1 = System.nanoTime();
		System.out.println("Linkedlist가 1만개 삽입할때 걸리는 시간 :"+(endtime1-starttime1));
		
	}
}
