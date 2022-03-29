package Baekjoon;

import java.util.Scanner;

public class Pickup_percent {
	public static void main(String[] args) {
		System.out.println("---프리코네 픽업캐 획득 확률 계산기---");
		double P=0.0; // 확률
		double A=0.0; // 출력확률(%)
		try (Scanner scanner = new Scanner(System.in)) {
			while(true) {
				System.out.println("픽업 확률 선택");
				System.out.println("1 : 0.7% , 2 : 1.4%"); int p = scanner.nextInt();
				System.out.println("사용 가능한 쥬얼 입력 : "); int j = scanner.nextInt();
				
				int J = j/150; // J는 가챠 가능 횟수
				System.out.println("현재 스택 입력 : "); int s = scanner.nextInt();
				if(s>=300) {System.out.println("장난 ㄴ");}
				if(J+s>=300) {System.out.println("천장 가능");}
				else {
				if(p==1) { // 확률이 0.7%면
					P = 1-Math.pow(0.993, J);
				}else if(p==2) { // 확률이 1.4%면
					P = 1-Math.pow(0.986, J);
				}
				A=P*100;
				System.out.println("그 쥬얼로 픽업캐를 뽑을 확률은 "+A+"% 입니다.");
				}
			} // while e
		}catch(Exception e) {System.out.println(e);}
	} // main e
}
