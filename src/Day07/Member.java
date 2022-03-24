package Day07;

public class Member { // c s

	// 1. 필드
	int mno;	// 회원번호 [자동으로 입력, 중복x]
	String id;	// 아이디 [중복x]
	String password;	// 비밀번호
	String name;	// 이름
	String phone;	// 연락처
	// 2. 생성자 [ 생성자명 == 클래스명 ]
		// 1. 빈생성자
	public Member() {}
		// 2. 모든 필드를 받는 생성자
	public Member(int mno, String id, String password, String name, String phone) {
		this.mno = mno;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	// 3. 메소드
		//회원가입 처리 [인수x 반환o 가입성공시 true 실패시 false]
	boolean 회원가입() { // 입력받기
		System.out.println("-------회원가입 페이지---------");
		System.out.println("아이디를 입력해주세요 : "); String id = 		Day07_5_BookApplication.scanner.next();
		// 아이디 중복체크
				for(Member temp : Day07_5_BookApplication.members) {
					if( temp != null && temp.id.equals(id)) { // 공백이 아니면서 입력받은 id가 중복이면
						System.out.println("현재 사용중인 아이디 입니다.");
						return false;
					}
				} // 중복체크 e
		System.out.println("비밀번호를 입력해주세요 : "); String password = Day07_5_BookApplication.scanner.next();
		System.out.println("이름을 입력해주세요 : "); String name = 		 Day07_5_BookApplication.scanner.next();
		System.out.println("연락처를 입력해주세요 : "); String phone = 	 Day07_5_BookApplication.scanner.next();
		
		// 회원번호 자동부여[가장 최근 회원+1]
		
		int j = 0;
		for(Member temp : Day07_5_BookApplication.members) {
			if ( temp == null) { // null을 찾았으면 
				if( j == 0) {mno = 1;} // 첫 회원은 1번 지정(안하면 밑에서 -1 인덱스 참조해서 오류)
				mno=Day07_5_BookApplication.members[j-1].mno +1; break;
			}		// null 바로 앞 회원[마지막 회원] 번호에 +1
		}
		// 변수를 1개 객체로 합치기
		Member member = new Member(mno, id, password, name, phone);
		
		// 배열내 빈 공간 찾아서 새 객체[회원] 넣기
		int i = 0; for(Member temp : Day07_5_BookApplication.members) { // 회원저장 s
			if ( temp == null ) { // 비어있으면
				Day07_5_BookApplication.members[i] = member;
				return true;}
			i++;
		}// 회원저장 e
		return false;
	}
		
		//로그인 [인수x 반환o 로그인성공시 성공한 id 반환, 실패시 null반환]
	String 로그인() {
		System.out.println("-------로그인 페이지---------");
		System.out.println("아이디를 입력해주세요 : "); String id = Day07_5_BookApplication.scanner.next();
		System.out.println("비밀번호를 입력해주세요 : "); String password = Day07_5_BookApplication.scanner.next();
		for(Member temp : Day07_5_BookApplication.members) { // for s
			if ( temp != null && temp.id.equals(id) && temp.password.equals(password)) { // if s
				// 공백이 아니면서 id와 password가 동일하면
				return temp.id;} // if e
		} // for e
		return null;
	} // 로그인 e
	
		//아이디찾기 [인수x 반환x]
	void 아이디찾기() { // id찾기 s 이름과 번호 동일하면 아이디출력
		System.out.println("-------아이디 찾기 페이지---------");
		System.out.println("이름을 입력해주세요 : "); String name = Day07_5_BookApplication.scanner.next();
		System.out.println("연락처를 입력해주세요 : "); String phone = Day07_5_BookApplication.scanner.next();
		for(Member temp : Day07_5_BookApplication.members) { // for s
			if( temp != null && temp.name.equals(name) && temp.phone.equals(phone)) { // 대충 동일하면
			System.out.println("아이디는 " + temp.id + "입니다.");
				return;	
			}
		} // for e
		System.out.println("동일한 회원정보가 없습니다.");
	} // id찾기 e
	
		//비밀번호찾기 [인수x 반환x]
	void 비밀번호찾기() { // pw찾기 s
		System.out.println("-------비밀번호 찾기 페이지---------");
		System.out.println("id를 입력해주세요 : "); String id = Day07_5_BookApplication.scanner.next();
		System.out.println("연락처를 입력해주세요 : "); String phone = Day07_5_BookApplication.scanner.next();
		for(Member temp : Day07_5_BookApplication.members) {// for s
			if( temp != null && temp.id.equals(id) && temp.phone.equals(phone)) { // 대충 동일하면
				System.out.println("비밀번호는 " + temp.password + "입니다.");
				return;
			}
		} // for e
	} // pw찾기 e
		//회원탈퇴
		//회원수정
} // c e
