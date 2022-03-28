package Day19;

import java.util.Hashtable;
import java.util.Scanner;

public class Day19_4 {
	public static void main(String[] args) {
	
		Hashtable<String, String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디 : "); String id = scanner.next();
			System.out.println("비밀번호 : "); String pw = scanner.next();
			
			if(map.containsKey(id)) { // 만약 입력한 id가 map객체내 key로 존재하면 true값 반환
				if(map.get(id).equals(pw)) // id에 해당하는 값(pw) 호출시 입력한 pw와 동일하면
					{
				System.out.println("로그인 되었습니다.");
					}else {
						System.out.println("입력한 비밀번호가 일치하지 않습니다.");
					}
		}else {
			System.out.println("입력한 아이디가 존재하지 않습니다");
			}	
		}
	}
}
