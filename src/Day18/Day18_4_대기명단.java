package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4_대기명단 {

	public static void main(String[] args) {
		//대기명단 프로그램
			//메뉴 : [고객] 1. 대기추가 2. 대기취소 [관리자] 대기자입장
				//대기추가 : 인원수를 입력받아 대기번호 반환
				//대기취소 : 대기번호를 입력받아 명단 취소
				//대기자입장 : 첫번째로 대기중인 대기번호 호출
		int 대기번호 = 1; // 오늘의 대기번호
		ArrayList<대기> 대기명단 = new ArrayList<>();
			//여러개의 대기 객체 저장 가능한 리스트
		Scanner scanner = new Scanner(System.in);
		while(true) {
			//반복문으로 리스트내 모든 객체 호출
				for(대기 temp : 대기명단) {
					System.out.println("대기번호     인원수 \t 대기예약시간");
					if(대기명단.indexOf(temp)==0) {
						System.out.println(temp.대기번호 + "\t" + temp.인원수+"\t"+"곧 입장");
					}
					else System.out.println(temp.대기번호 + "\t" + temp.인원수+"\t"+대기명단.indexOf(temp)*3+"분");
				}
			
			System.out.println("[고객]1.대기추가 2.대기취소");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("전화번호 : "); String 전화번호 = scanner.next();
				System.out.println("인원수 : "); int 인원수 = scanner.nextInt();
				//변수 1개 객체로 합치기
				대기 temp = new 대기(대기번호, 전화번호, 인원수);
				//대기 인원들을 리스트에 저장
				대기명단.add(temp);
				대기번호++;
			}
			else if(ch==2) {
				System.out.println("대기번호 : "); int 삭제대기번호 = scanner.nextInt();
				for(대기 temp : 대기명단) {
					if(temp.대기번호==삭제대기번호) {
						대기명단.remove(temp); break;
					}
				}
			}else if(ch==3) {
				System.out.println("가장 앞의 대기명단을 입장시킵니다."); 대기명단.remove(0);
			}else {
				
			}
		}
	}
}
