package Day08;

import java.util.Arrays;

public class Member {
	//1.필드
	private int bno;
	private String id;
	private String pw;
	private String name;
	private String phone;
	//2.생성자
	public Member() {// 빈생성자생성
		
	}
	public Member(String id, String pw, String name,String phone, int bno) {
		super();
		this.bno = bno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	//3.메소드
	
	//1.회원가입
	public boolean SignUp() {
		//입력받기
		System.out.println("-----------------------회원가입 페이지------------------------");
		System.out.println("아이디: "); 	String id = Day08_05.scanner.next();
		//중복체크
		for(Member temp : Day08_05.member) {
			if(temp != null && temp.id.equals(id)) {
				System.out.println("아이디가 중복됬습니다");
				return false;
			}
		}//중복체크 for end
		System.out.println("비밀번호: ");	String pw = Day08_05.scanner.next();
		System.out.println("이름: ");		String name = Day08_05.scanner.next();
		System.out.println("폰번호: ");	String phone = Day08_05.scanner.next();
		//회원번호
		int bno =0; //회원번호 
		int i = 0; // 반복횟수
		for(Member temp : Day08_05.member) {
			if(temp == null) {
				if( i == 0) {
					bno = 1;
					break;
				}
				bno = Day08_05.member[i - 1].bno + 1;
				break;
			}
			i++;
		}// 회원 번호 end
		//객체 생성
		Member member = new Member(id, pw, name, phone, bno);
		//저장
		int j = 0; // 회원인덱스 찾는 반복횟수
		for(Member temp : Day08_05.member) {// 회원인덱스 찾는 반복
			if(temp == null) {
				Day08_05.member[j] = member;
				System.out.println("회원님의 회원번호는: " + bno);
				return true;
			}
			j++;
		}
		return false;		
	}
	//2.로그인
	public String[] iogin() {
		System.out.println("-----------------------------로그인 페이지----------------------------------");
		System.out.println("아이디: "); 	String id = Day08_05.scanner.next();
		System.out.println("비밀번호: ");	String pw = Day08_05.scanner.next();

		for(Member temp : Day08_05.member) { // 로그인 체크
			if(temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {// 아이디 일치 비밀번호일치
				String[] t = {temp.id, temp.name, temp.bno + "", temp.pw};
				return t;
			}else {
				return null;
			}
		}// 로그인 체크 end
		return null;
	}
	
	//3.아이디찾기
	public void idfind () {
		System.out.println("-----------------------------아이디 찾기--------------------------------");
		System.out.println("이름: "); 		String name = Day08_05.scanner.next();
		System.out.println("전화번호: ");		String phone = Day08_05.scanner.next();
		
		for(Member temp : Day08_05.member) {// 해당사항 찾는 반복문
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {// 이름 전화번호일치하면
				System.out.println("당신의 아이디: " + temp.id);
				return;
			}
		}
		System.out.println("회원이 아닙니다");
	}
	
	//4.비밀번호찾기
	public void pwfind () {
		System.out.println("-----------------------------아이디 찾기--------------------------------");
		System.out.println("아이디: "); 		String id = Day08_05.scanner.next();
		System.out.println("전화번호: ");		String phone = Day08_05.scanner.next();
		
		for(Member temp : Day08_05.member) {// 해당사항 찾는 반복문
			if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {// 이름 전화번호일치하면
				System.out.println("당신의 비밀번호: " + temp.pw);
				return;
			}
		}
		System.out.println("회원이 아닙니다");
	}
	
}
