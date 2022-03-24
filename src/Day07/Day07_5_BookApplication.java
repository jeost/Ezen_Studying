package Day07;

import java.util.Scanner;

public class Day07_5_BookApplication { // c s
		//모든 메소드에서 쓰기위해 main 밖에 선언
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[100];
	static Book[] books = new Book[100];
	public static void main(String[] args) { // m s
		Day07_5_BookApplication application = new Day07_5_BookApplication();	// 메소드 호출
		application.menu();
		
	} // m e
	
	// 1. 초기 메뉴 메소드
		// 객체 생성(메모리할당) -> 메소드 호출
		
		
	void menu() {// menu s
		while (true) {
			System.out.println("-----------도서 대여 프로그램------------");
			System.out.println("1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기"); int ch1 = scanner.nextInt();
			Member member = new Member(); // 1~4 전부에서 사용 
			if (ch1 == 1) { // 회원가입
				boolean result = member.회원가입();
				if(result) { System.out.println("회원가입 성공");}
				else {System.out.println("로그인 실패");}
			}else if (ch1 == 2) { // 로그인 1. 일반회원 메소드 2. 관리자 메소드
			String result = member.로그인(); // 로그인 메소드 호출
			if(result == null) { // 로그인실패
				System.out.println("동일한 회원정보가 없습니다");
			}
			else if(result.equals("admin")) { // 관리자면 관리자메뉴 호출
				System.out.println(result + "님 어서오세요");
				adminmenu();
			}
			else { // 일반인
				System.out.println("ㅎㅇ" + result);
				membermenu(result);
			}
			}else if (ch1 == 3) { // id찾기
			member.아이디찾기();
			}else if (ch1 == 4) { // pw찾기
			member.비밀번호찾기();
			}else {System.out.println(" 알 수 없는 입력 ");}
			} // menu e
		}
	
	// 2. 일반 회원 메뉴 메소드
	void membermenu(String loginid) { // m menu s 인수의 변수명은 자유
		while(true) {
			Book book = new Book();
			System.out.println("---------메뉴----------");
			System.out.println("1. 도서검색 , 2. 도서목록 , 3. 도서대여 , 4. 도서반납 , 5. 로그아웃"); int ch = scanner.nextInt();
			if (ch == 1) { 
				book.도서검색();
			}else if (ch == 2) { 
				book.도서목록();
			}else if (ch == 3) { 
				book.도서대여(loginid);
			}else if (ch == 4) { 
				book.도서반납(loginid);
			}else if (ch == 5) {
				return;
			}else {System.out.println("알 수 없는 입력");}
		}
	} // m menu e
	// 3. 관리자 메뉴 메소드
	void adminmenu() { // admin s
		while(true) { // while s
		Book book = new Book();
		System.out.println("----------관리자 메뉴----------");
		System.out.println(" 1. 도서등록 , 2. 도서목록 , 3. 도서삭제 , 4. 로그아웃"); int ch = scanner.nextInt();
		if (ch == 1) { 
			book.도서등록();
		}else if (ch == 2) { 
			book.도서목록();
		}else if (ch == 3) { 
			book.도서삭제();
		}else if (ch == 4) { 
			return;
		}else {System.out.println("알 수 없는 입력");}
	
		} // while e
	} // admin e
} // c e
