package Day10;

import java.util.ArrayList;

public class Day10_4 {
	public static void main(String[] args) {
		//배열[인덱스 0부터 저장]
		String[] 배열이름 = new String[100];
		System.out.println(" 배열 : " + 배열이름); // 메모리 주소값
		배열이름[0] = "엄"; // 배열 [ 인덱스 ] : 인덱스 번호 기준으로 저장
		System.out.println("배열[0] : "+배열이름[0]);
		//리스트[클래스 기반의 배열구조]
		ArrayList<String> 리스트이름 = new ArrayList<>();
	// ArrayList [자동완성]
		// <자료형> : list에 저장할 자료형
		// 리스트명 : 대충 아무거나
		// new : 객체 생성시 메모리 할당
		// Arraylist<>(); : 생성자
		System.out.println("리스트 : "+리스트이름); // 메모리 목록
		리스트이름.add("엄"); // 리스트에 객체 추가하는 메소드
		System.out.println("리스트[0] : " + 리스트이름.get(0)); // 리스트명.get(인덱스) 객체호출
		// 리스트명.size() 리스트길이호출
		System.out.println("길이 : " + 리스트이름.size());
		
		
	}
}
