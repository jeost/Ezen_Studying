package Day09;

import java.util.ResourceBundle.Control;
import java.util.Scanner;

public class Day09_6_은행계좌프로그램 { // c s

	//은행계좌프로그램[상속]
		//은행[super]
		//국민,신한,하나은행[sub]
		//주 기능 : 1.계좌생성 2.입금 3.출금 4.이체 5.내계좌목록 6.대출
	public static Bank[] 계좌리스트 = new Bank[100]; // main 밖에서 선언해서 항상 떠있게
	public static void main(String[] args) { // m s
		Scanner scanner = new Scanner(System.in);
		
		while(true) { // while s
			System.out.println("---------계좌 시스템---------");
			System.out.println("1.계좌생성 2.입금 3.출금 4.이체 5.내계좌목록 6.대출"); int select = scanner.nextInt();
			BankController bankController = new BankController();
			if(select == 1) {
				System.out.println("계좌등록 페이지");
				System.out.println("비밀번호 입력 : "); String pw = scanner.next();
				System.out.println("계좌주 : "); String bankbookO = scanner.next();
				System.out.println("은행선택 : 1.국민 2.신한 3.하나"); int bankselect = scanner.nextInt();
				String 계좌번호 = bankController.계좌생성(pw, bankbookO, bankselect); // 메소드 반환 저장 계좌번호 or null
				if ( 계좌번호 != null ) { // 계좌번호가 null이 아니면
					System.out.println("계좌 생성 완료");
				}else { // 계좌번호가 null이면
					System.out.println("계좌등록 실패");
				}
			}else if(select == 2) {
				System.out.println("입금 페이지");
				System.out.println(" 입금할 계좌번호 입력 : "); String bankbookN = scanner.next();
				System.out.println(" 입금액 입력 : ");		int money = scanner.nextInt();
				boolean 입금여부=bankController.입금(bankbookN , money);
				if(입금여부) {System.out.println("입금이 완료되었습니다.");}
				else {System.out.println("입금이 실패하였습니다.");}
				
			}else if(select == 3) {
				System.out.println("출금 페이지");
				System.out.println("계좌번호 : "); String bankbookN = scanner.next(); 
				System.out.println("비밀번호 : "); String pw = scanner.next();
				System.out.println("출금액 : "); int money = scanner.nextInt();
				byte result = bankController.출금(bankbookN, pw, money);
				if(result == 1) {
					System.out.println("잔액 부족");
				}else if(result == 2) {
					System.out.println("출금 성공");
				}else if(result == 3) {
					System.out.println("입력정보 오류");
				}
			}else if(select == 4) {
				System.out.println("이체 페이지");
				System.out.println("출금할 계좌 입력 : "); String bankbookN = scanner.next();
				System.out.println("비밀번호 입력 : "); String pw = scanner.next();
				System.out.println("이체할 계좌 입력 : "); String bankbookN2 = scanner.next();
				System.out.println("이체액 입력 : "); int money = scanner.nextInt();
				byte result = bankController.이체(bankbookN , pw , bankbookN2 , money);
				if(result == 1) {
					System.out.println("이체 성공");
				}else if(result == 2) {
					System.out.println("금액이 부족합니다.");
				}else if(result == 3) {
					System.out.println("상대 계좌가 없습니다.");
				}else if(result == 4) {
					System.out.println("내 계좌 정보가 다릅니다.");
				}
			}else if(select == 5) {
				System.out.println("내 계좌목록 페이지");
				System.out.println("계좌주 : "); String bankbookO = scanner.next();
				Bank[] 내계좌목록 = bankController.계좌목록(bankbookO);
				System.out.println(bankbookO+"님의 계좌목록 ");
				int i =1;
				for(Bank temp : 내계좌목록) {
					if( temp != null) {
						System.out.println(i+"번 계좌번호 : " +temp.getBankbookN());
					}
				}
			}else if(select == 6) {
				System.out.println("대출 페이지");
			}else {
				System.out.println("알 수 없는 입력");
			}
			
		} // while e
		
	} // m e
	
} // c e
