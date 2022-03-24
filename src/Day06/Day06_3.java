package Day06;

import java.util.Scanner;

public class Day06_3 { // c s

	public static void main(String[] args) { // m s
	
		Member member = new Member();
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100]; // 필드 4개를 객체 1개로 바꿔서 코드 간소화
		// Member 클래스로 만들어진 객체(id,pw,name,phone) 각각 100개를 저장 가능한 배열 선언
		
		while(true) { // 프로그램 while start[ 종료조건 x ]
			
			System.out.println("-----------회원제[클래스]--------------");
			System.out.println("1. 회원가입 2. 로그인 3. 아이디찾기 4 비밀번호찾기");
			System.out.print(" 선택 : "); int ch = scanner.nextInt();
			
			if( ch == 1 ) { // 가입 s
				// 1. id, pw, name, phone 입력받기 => 변수 4개
				// 2. 객체 생성
				// 3. 입력받은 변수 4개를 객체 내 필드에 저장
				System.out.println("아이디 : "); String id = scanner.next();
				System.out.println("비밀번호 : "); String pw = scanner.next();
				System.out.println("이름 : "); String name = scanner.next();
				System.out.println("연락처 : "); String phone = scanner.next();
				
				member.id=id;
				member.pw=pw;
				member.name=name;
				member.phone=phone;
				
				//* 아이디 중복체크
					// 1. 배열 내 객체 중 입력한 아이디와 동일한 아이디 찾기
				boolean idcheck = false; // 중복이면 true
				for( Member temp : memberlist) { // memberlist 배열 내 객체들을 하나씩 temp에 반복 대입
					if ( temp != null && temp.id.equals(id)) { // 만약 객체 내 id가 입력받은 id와 같다면
						System.out.println("사용중인 아이디 입니다. 처음부터 다시");
						idcheck = true;
						break;
					}
				}
				
				// id가 중복이 아닐 경우 저장
				if (idcheck == false) {
				// 여러 객체를 저장하는 배열에 저장
					// 1. 공백 인덱스를 찾기
				int i = 0; // 인덱스 위치 변수
				for( Member temp : memberlist ) {
					if (temp == null ) { // 2. 공백 인덱스에 저장
						memberlist[i] = member;
						break; // 한번 저장했으니 for 탈출
						} i++; // 인덱스 증가
					} // for end
						System.out.println("회원가입이 완료되었습니다.");
				}// if end
			} // 가입 e
			else if ( ch == 2 ) { // 로그인 s
				System.out.println("-------로그인 페이지--------"); // 입력받기
				System.out.println("아이디 입력 : "); String loginid = scanner.next();
				System.out.println("비밀번호 입력 : "); String loginpw = scanner.next();
				
				// 2. 기존 배열[memberlist] 내 값과 비교
				boolean logincheck = false; // true : 로그인성공 false : 로그인실패
				for(Member temp : memberlist) { 
					if ( temp != null && temp.id.equals(loginid) && temp.pw.equals(loginpw)) {
					System.out.println("로그인 성공");
					logincheck = true; // 로그인체크값 true로 변경
					}
				}
				if (logincheck == false) {
					System.out.println("로그인 실패");
					
				} 
			} // 로그인 e
			else if ( ch == 3 ) { // id찾기 s
				System.out.println("-----아이디 찾기 페이지-----");
				System.out.println("이름 입력 : "); String sName = scanner.next();
				System.out.println("연락처 입력 : "); String sPhone = scanner.next();
				boolean findcheck = false;
				for(Member temp : memberlist) {
					if ( temp != null && temp.name.equals(sName) && temp.phone.equals(sPhone)) {
						System.out.println("아이디 찾기 성공"); findcheck = true;
						System.out.println("아이디는 " + temp.id + "입니다.");
						break;
					} // if end
					
				} // for end
				if(findcheck == false) {
					System.out.println("동일한 회원 정보가 없습니다.");
				}
			} // id찾기 e
			else if ( ch == 4 ) { // pw찾기 s
				System.out.println("-----비밀번호 찾기 페이지-----");
				System.out.println("아이디 입력 : "); String sId = scanner.next();
				System.out.println("전화번호 입력 : "); String sPhone = scanner.next();
				boolean pwcheck = false;
				for(Member temp : memberlist) {
					if ( temp != null && temp.id.equals(sId) && temp.phone.equals(sPhone)) {
						System.out.println("비밀번호 찾기 성공");
						System.out.println("비밀번호는 " + temp.pw + "입니다.");
						pwcheck = true;
						break;
					}
				} // for end
				if(pwcheck == false) {
					System.out.println("회원 정보가 다릅니다.");
				}
			} // pw찾기 e
			else { // 입력이 1~4 외의 다른 거
				System.err.println(" 알 수 없는 번호 ");
			}	scanner.close();
		} // 프로그램 while end
		
	} // m e
	
} // c e
