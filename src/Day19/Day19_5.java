package Day19;

import java.util.TreeSet;

public class Day19_5 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		System.out.println("------자동 정렬------");
		scores.add(87); scores.add(98);
		scores.add(75); scores.add(95); scores.add(80);
		
		System.out.println(scores.first()); System.out.println(scores.last());
		System.out.println(scores.lower(95)); // 95 기준 왼쪽노드
		System.out.println(scores.higher(95)); // 95 기준 오른쪽노드
		
		System.out.println(scores.floor(95)); // 95 포함 왼쪽
		System.out.println(scores.ceiling(95)); // 95 포함 오른쪽
		
		System.out.println(scores.pollFirst()); // 가장 왼쪽노드 삭제
		System.out.println(scores.pollLast()); // 가장 오른쪽노드 삭제
		System.out.println("확인 : " + scores);
		
		//오름차순 vs 내림차순
		System.out.println("기본[오름차순] : " + scores);
		//내림차순
		System.out.println("내림차순 : " + scores.descendingSet()); // 반대로 뒤집기
		
		for(Integer temp : scores) {
			System.out.println(temp);
		}
		for(Integer temp : scores.descendingSet()) {
			System.out.println(temp);
		}
	}
}
