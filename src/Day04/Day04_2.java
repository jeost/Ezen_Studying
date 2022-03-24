package Day04;

import java.util.Scanner;

public class Day04_2 { // c s

	public static void main(String[] args) { // m s
		
	// 자판기 프로그램
		// 1. 메뉴판 [ 1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ]
			// 메뉴판에서 제품 선택 시 장바구니에 넣기
			// 재고가 부족하면 알림 ( 재고부족 )
		// 2. 초기 재고 [ 제품 당 10개씩 ]
		// 3. 결제시 금액을 입력받아 결제액 만큼 차감후 잔돈 출력
			// 1. 투입한 금액보다 구매액이 더 크면 결제 취소 [ 금액 부족 ]
		
		// 공통변수[ 모든 괄호 내에서 사용하는 변수들 ]
		Scanner scanner = new Scanner(System.in); // 1. 입력객체
		int 콜라 = 10; int 환타 = 10; int 사이다 = 10; // 2. 재고변수
		int 콜라구매 = 0; int 환타구매 = 0; int 사이다구매 = 0; // 3. 장바구니
		
		// 프로그램 시작 [ 무한루프 ]
		while(true) { System.out.println(" 메뉴 ");
		System.out.println(" 1.콜라[300] 2. 환타[200] 3. 사이다[100] 4. 결제");
		System.out.print("선택 : "); int select = scanner.nextInt();
		
		if(select == 1) { // 콜라 start
			if( 콜라 == 0 ) { System.err.println(" 재고 없음 ");}
			else {System.out.println(" 콜라 담음 ");
			콜라구매++;
			콜라--;
			}
			
		} // 콜라 end
		else if(select == 2) { // 환타 start
				if( 환타 == 0 ) { System.err.println(" 재고 없음 ");}
				else {System.out.println(" 환타 담음 ");
				환타구매++;
				환타--;
				}
			
		} // 환타 end
		else if(select == 3) { // 사이다 start
			if( 사이다 == 0 ) { System.err.println(" 재고 없음 ");}
			else {System.out.println(" 사이다 담음 ");
			사이다구매++;
			사이다--;
			}
		} // 사이다 end
		else if(select == 4) { // 결제 start
			
			System.out.println(" 장바구니 ");
			System.out.println("제품명\t수량\t금액");
			if (콜라구매 !=0) {System.out.println("콜라\t"+콜라구매+"\t"+콜라구매*300);}
			if (환타구매 !=0) {System.out.println("환타\t"+환타구매+"\t"+환타구매*200);}
			if (사이다구매 !=0) {System.out.println("사이다\t"+사이다구매+"\t"+사이다구매*100);}
			System.out.println("총 결제액 : " + (콜라구매*300+환타구매*200+사이다구매*100));
			System.out.println("----------------");
			System.out.println(" 1. 결제 2. 취소"); int 선택2 = scanner.nextInt();
			
			if( 선택2 == 1 ) { // 결제
				// 금액 입력받기
				// 금액<결제액 => 결제불가 => 금액 재 입력
				// 금액>=결제액 => 결제성공 => 장바구니 초기화
				int 결제액 = 콜라구매*300+환타구매*200+사이다구매*100;
				System.out.println("금액 입력 : ");
				int 금액 = scanner.nextInt();
				if( 금액<결제액 ) { //결제실패시 s
					System.err.println(" 결제 실패, 금액 재입력. "); 금액 = scanner.nextInt();
								} // 결제실패시 e
				else if(금액>=결제액) { // 결제성공 s
					System.out.println(" 결제 성공. ");
					콜라구매 = 0; 사이다구매 = 0; 환타구매 = 0;
					System.out.println(" 잔돈 : " + (금액-결제액)+"원");
					break;
									} // 결제성공 e
							} // 결제 end
			else if( 선택2 == 2 ) { // 취소
				System.out.println(" 알림) 구매목록 삭제");
				콜라 += 콜라구매; 사이다 += 사이다구매; 환타 += 환타구매; // 재고로 돌리기
				콜라구매 = 0; 사이다구매 = 0; 환타구매 = 0; // 구매수 초기화
			
								} // 취소 end
			else {System.err.println("알 수 없는 입력. 재결제 필요");}
						} // 결제 end
		else System.err.println("알 수 없는 입력");
		} // while end
	} // m e
	
} // c e
