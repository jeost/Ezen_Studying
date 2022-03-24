package Day08;

public class Bank { // c s
	//필드
	private int bNum; // bank number
	private String name; // 이름
	private int hNum; // human number
	private int money;
	private String bPw; // Bank password
	private String id;
	//생성자
	
		public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getbPw() {
		return bPw;
	}

	public String getId() {
		return id;
	}

	//빈 생성자
	public Bank() {}
	
		//[필드 2개] 생성자
	public Bank(String name, int money) {}
	
		//[필드 5개] 풀 생성자
	public Bank(int bNum, String name, int hNum, int money, String bPw, String id) {
		this.bNum = bNum;
		this.name = name;
		this.hNum = hNum;
		this.money = money;
		this.bPw = bPw;
		this.id = id;
	}
	//메소드
	
		//	- 1. 계좌 생성
	void 계좌생성(String[] result) { // 계좌생성 s
		System.out.println("-----계좌 생성 페이지-----");
		System.out.println("이름을 입력해주세요 : "); String name = Day08_05.scanner.next();
		System.out.println("비밀번호를 입력해주세요 : "); String pw = Day08_05.scanner.next();
		 // for s
		int j = 0;
		for(Bank temp : Day08_05.bank) {
			if ( temp == null) { // null을 찾았으면 
				if( j == 0) {bNum = 1;}  // 첫 회원은 1번 지정(안하면 밑에서 -1 인덱스 참조해서 오류)
				else bNum=Day08_05.bank[j-1].bNum +1; break;
			}		// null 바로 앞 회원[마지막 회원] 번호에 +1
		}
				//회원번호 부여 끝
		id = result[0];
		Bank bank = new Bank(bNum, name, hNum, 0, pw, id); // 변수를 1개의 배열로 합치기
		
		 // if e 
				//배열내 빈 공간에 넣기
		int i = 0; for(Bank temp :Day08_05.bank) { // 회원저장 s
			if ( temp == null ) { // 비어있으면
				Day08_05.bank[i] = bank; System.out.println(" 계좌 생성이 완료되었습니다. ");
				System.out.println("계좌번호 : "+bNum);
				return;}
			i++;}
				System.out.println("계좌 생성 실패");
	
	} // 계좌생성 e
		//	- 2. 입금
	void 입금(String[] result) { // 입금 s
		System.out.println(" 입금 페이지 ");
		System.out.println(" 비밀번호를 입력해주세요 :"); String pw = Day08_05.scanner.next();
		System.out.println(" 금액을 넣어주세요 "); int money = Day08_05.scanner.nextInt();
		for ( Bank temp : Day08_05.bank) {
			if (temp != null && temp.id==(id) &&temp.bPw.equals(pw)&&money>=0) { //확인되면
				if ( money > 0) { // 금액이 양수면
				temp.money+=money; System.out.println("입금이 완료되었습니다. 잔액 : " + temp.money); return;
				}
			}
		} System.out.println("오류. 재시도");
	} // 입금 e
		//	- 3. 출금
	void 출금(String[] result) { // 출금 s
		System.out.println(" 출금 페이지 ");
		System.out.println(" 비밀번호를 입력해주세요 : "); String pw = Day08_05.scanner.next();
		System.out.println(" 출금할 금액을 입력해주세요 "); int money = Day08_05.scanner.nextInt();
		if ( money > 0) { // 금액이 양수면
		for ( Bank temp : Day08_05.bank) {						// 확인되면
			if (temp != null && temp.id==(id)&&temp.bPw.equals(pw) && money>=0 && (temp.money-money)>=0) { 
				temp.money-=money; System.out.println("출금이 완료되었습니다. 잔액 : " + temp.money); return;
				}
			}
		}
	} // 출금 e
		//	- 4. 이체
	void 이체(String[] result) { // 이체 s
		System.out.println(" 이체 페이지 ");
		System.out.println(" 비밀번호를 입력해주세요 : "); String pw = Day08_05.scanner.next();
		System.out.println(" 이체할 금액을 입력해주세요 "); int money = Day08_05.scanner.nextInt();
		if ( money > 0) { // 금액이 양수면
			System.out.println(" 이체할 계좌번호를 입력해주세요 "); int bNum = Day08_05.scanner.nextInt();
			for ( Bank temp : Day08_05.bank) { // for s	
				if(temp != null &&temp.bPw.equals(pw)&&(temp.money>=money) ) { // 확인되면
					 for(Bank oppo : Day08_05.bank) { //for2 s
						 if(oppo.bNum==bNum) { // 상대 통장을 찾아서
						oppo.money+=money;
						temp.money-=money;
						System.out.println("이체가 완료되었습니다."); return; // 입금
						 }
					} // for2 e
				} // if 2 e
				System.out.println("오류. 재시도");
			} // for e
		}// if end
	} // 이체 e
		//	- 5. 계좌목록
		//	    - 계좌 번호와 잔액만 표기
		void 계좌목록(String[] result) {
			System.out.println("---당신의 계좌 목록---");
			for(Bank temp : Day08_05.bank) {
				if(temp != null && temp.id.equals(id)) {
					System.out.println("통장"+temp.bNum+ "번에" + temp.money + "원이 있습니다.");
				}
			}
		}
} // c e
