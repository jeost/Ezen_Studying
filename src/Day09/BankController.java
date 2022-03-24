package Day09;

import java.util.Random;

public class BankController { // c s
			// 입출력 기능 x
	
	// 은행 관련 컨트롤러 클래스
	// M : model[데이터값]
	// V : view [입출력]
	// C : model과 view 사이를 연결
	
	// 뷰에서 요청하는 기능을 제공
		// 1.계좌생성 [c]
	public String 계좌생성(String pw, String bankbookO, int bankselect) {
		// 1. 입력받은 값 가져오기
			//계좌번호 자동생성
		Random random = new Random();
			//4자리 생성
		String bankbookN = null;
		while(true) {
		int 난수 = random.nextInt(10000);
		
		bankbookN = String.format("%04d", 난수);
								// 문자형식 변경
									//%d : 정수 %4d : 정수 4자리 [자릿수 없으면 공백처리] 예시 :   15 %04d : 정수 4자리 [자릿수 없으면 0 처리] 예시 : 0015
		//중복체크
				Boolean 계좌중복 = false;
				for (Bank temp2 : Day09_6_은행계좌프로그램.계좌리스트) {
					if( temp2.getBankbookN().equals(bankbookN)) {
						계좌중복 = true;
					}
				}if (계좌중복 == false) {
					break;
				}
		}
		// 2. 객체화[다수의 변수를 하나의 객체로 만들기]
		Bank temp = null; // 빈 객체 생성
			if(bankselect == 1) {
				temp = new Kookmin("0" , pw , bankbookO , 0);
			}else if(bankselect == 2) {
				temp = new Shinhan("0" , pw , bankbookO , 0);
			}else if(bankselect == 3) {
				temp = new Hana("0" , pw , bankbookO , 0);
			}
		// 3. 배열에 저장
			int i = 0;
			for(Bank temp2 : Day09_6_은행계좌프로그램.계좌리스트) {
				if(temp2 == null) { // temp2가 공백이면
					Day09_6_은행계좌프로그램.계좌리스트[i] = temp; //공백 인덱스에 담기
					
					return temp.getBankbookN(); // 계좌번호가 존재하면
				}
			}
		return null;}
		// 2.입금 [u]
	public boolean 입금(String bankbookN, int money) { // 입금 s
		int i = 0;
		for(Bank temp : Day09_6_은행계좌프로그램.계좌리스트) {
			if(temp != null && temp.getBankbookN().equals(bankbookN)) { // 동일한 계좌를 찾아
				Day09_6_은행계좌프로그램.계좌리스트[i].setbMoney(temp.getbMoney()+money); // 입금 처리	
				return true;
			}i++;
		}
		return false;}
		// 3.출금 [u]
	public byte 출금(String bankbookN, String pw, int money) { // 입금 s
		int i = 0;
		for(Bank temp : Day09_6_은행계좌프로그램.계좌리스트) {
			if(temp != null && temp.getBankbookN().equals(bankbookN) && temp.getPw().equals(pw)) { // 동일한 계좌를 찾고 잔액이 충분하고 비밀번호가 맞으면
				if(temp.getbMoney()<money) {
					return 1;
				}else {Day09_6_은행계좌프로그램.계좌리스트[i].setbMoney(temp.getbMoney()-money); // 출금 처리	
					return 2;
				} // else end
			} // if end	
		i++;}// for end
		return 3;
	}
		// 4.이체 [u]
	public byte 이체(String bankbookN , String pw , String bankbookN2 , int money) {
		int i = 0;
		for(Bank temp : Day09_6_은행계좌프로그램.계좌리스트) {
			if(temp != null && temp.getBankbookN().equals(bankbookN) && temp.getPw().equals(pw)) { // 보내는사람
				int b = 0;
				for(Bank temp2 : Day09_6_은행계좌프로그램.계좌리스트) {
				if(temp2 != null && temp2.getBankbookN().equals(bankbookN2)) { // 받는사람
					if(temp.getbMoney()<money) { // 돈이 부족하면
						return 2; // 돈부족하다
					}else { Day09_6_은행계좌프로그램.계좌리스트[i].setbMoney(temp.getbMoney()-money);
							Day09_6_은행계좌프로그램.계좌리스트[b].setbMoney(temp2.getbMoney()+money); // 이체
						return 1; // 성공
					}
				} // if2 end
				
					} // for2 end
			}//if end
		i++;}//for end
		return 4; // 내계좌 오류
		}//이체 end
		// 5.내계좌목록 [r]
	public Bank[] 계좌목록(String bankbookO) {
			// 동일한 계좌주의 계좌를 찾아 배열에 담아 넘기기
		Bank[] 내계좌목록 = new Bank[100]; // 내계좌목록 배열 생성 선언
		for( Bank temp : Day09_6_은행계좌프로그램.계좌리스트) {	// 남의 계좌 걸러내기
			if( temp != null && temp.getBankbookO().equals(bankbookO)) { // 이름이 동일하면
				int i = 0;
				for(Bank temp2 : 내계좌목록) {
					if(temp2 == null) {
						내계좌목록[i] = temp; break; // 내 계좌목록 배열 내 빈공간을 찾아 넣기, 1번 저장했으면 break
					}i++; // if2 end
				} // for2 end
			} // if end
		} // for end
		return 내계좌목록;}
		// 6.대출 [u]
	public boolean 대출() {return false;}
	
} // c e
