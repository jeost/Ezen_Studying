package Day08;

import java.util.Arrays;
import java.util.Scanner;

//대출통장// 5.대출: 1.대출가입 2. 대출상환 3.남은대출금 4.뒤로가기
		//1. 
public class Long {
	//필드 1.name 2.잔액
		private String name = "캐피탈";
		private int balance;
		private String id; // 비교를 위해
	
	//생성자
		public Long() {
			
		}
		public Long(String name, int balance, String id) {
			this.name = name;
			this.balance = balance;
			this.id = id;
		}
	//메소드
		@SuppressWarnings("null")
		public void Management(String[] result) {
			System.out.println("---------------------------------대출가입----------------------------------");
			System.out.println(name + "무한한도");
			// pw 확인
			System.out.println("비밀번호: "); String pw = Day08_05.scanner.next();
			//비밀번호 확인작업
			boolean pwch = false;
			if(result[3].equals(pw)) {
				pwch = true;
			}else {
				System.out.println("비밀번호가 동일하지 않습니다.");
				return;
			}
			if(pwch == true) {// 비밀번호확인이 완료되면
				System.out.println("대출금액: "); int br = Day08_05.scanner.nextInt();
				//4 객체생성
				Long long2 = new Long(name, br, result[0]);
				// 저장
				int i = 0;
				for(Long temp : Day08_05.longs) {// null 확인
					if(temp == null) {// null이 확인되면
						Day08_05.longs[i] = long2;
						System.out.println("대출상품 가입성공");
						return;
					}
					i++;
				}
				return;
			}
			
			
			
		}//대출가입 end
		//대출상환
		public void Repayment(String[] resul) {
			System.out.println("---------------------대출 상환 메뉴-------------------------");
			//중복확인
			System.out.println("현재 대출중인 통장");
			System.out.println("이름\t금액\t소유인");
			int 대출금 = 0;
			boolean 찾음 = false;
			for(Long temp : Day08_05.longs) {
				if(temp != null && resul[0].equals(temp.id)) {
					System.out.println(temp.name+"\t"+temp.balance+"\t"+temp.id);
					대출금 = temp.balance;
					찾음 = true;
					break;
				}
			}
			
			if(찾음 == true) {
				System.out.println("1.대출상환 2.뒤로가기"); int ch = Day08_05.scanner.nextInt();
				int 잔액 = 0;
				//잔액찾기
				for(Bank temp : Day08_05.bank) {
					if(temp != null && temp.getId().equals(resul[0])) {
						잔액 = temp.getMoney();// bank 객체안에 있는 금액빼오기
					}
				}
				//선택
				if(ch == 1) {
					System.out.println("상환금액"); int br = Day08_05.scanner.nextInt();// 상환금 입력받기
					if(잔액 > br){// 잔액이 상환금액보다 많으면
						for(Bank temp : Day08_05.bank) {// 잔액 차감
							if(temp != null && temp.getId().equals(resul[0])) {
								temp.setMoney(잔액 - br);
								break;
							}						
						}// for end
						for(Long temp : Day08_05.longs) {// 대출금 상환
							if(temp != null && temp.id.equals(resul[0])) {// 아이디 동일
								temp.balance = temp.balance - br;
								break;
							}
						}
						System.out.println("상환의 성공하셨습니다");
				
					}else {// 잔액이 상환금보다 적으면
						System.out.println("금액이 부족합니다");
					}
					
				}else if(ch == 2) {
					
				}else {
					System.out.println("알수없는 행동");
				}
				
				
			}else {
				System.out.println("대출중이 아님");
			}
			
			
			
		}
			public void LoanAmount(String[] resul) {
				for(Long temp : Day08_05.longs) {
					if(temp != null && temp.id.equals(resul[0])) {
						System.out.println("남은 대출금액은"+ temp.balance + "원 입니다.");
						return;
				
				}
			}
		}
	
}
