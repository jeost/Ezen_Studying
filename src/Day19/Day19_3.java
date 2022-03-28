package Day19;

import java.util.HashMap;

public class Day19_3 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85); System.out.println("확인 : " + map);
		
		map.put("홍길동", 90); System.out.println("확인 : " + map);
		map.put("동장군", 80); System.out.println("확인 : " + map);
		map.put("홍길동", 95); System.out.println("확인 : " + map);
		map.put("유재석", 95); System.out.println("확인 : " + map);
		
		System.out.println("map객체내 entry 수 : "+ map.size());
		// key호출시 값 호출
		System.out.println("map객체내 값 호출 : "+map.get("유재석"));
		
		System.out.println("map 객체내 모든 키 호출 : " +map.keySet());
		
		System.out.println("map 객체내 모든 값 호출 : " + map.values());
		//반복문
		for(String temp : map.keySet()) {
			System.out.println(temp+":"+map.get(temp));
		}
		
		//삭제
		map.remove("홍길동"); System.out.println("확인" + map);
		
		map.clear(); System.out.println("확인" + map);
	}
}
