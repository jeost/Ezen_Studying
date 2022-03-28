package Day19;

import java.util.HashSet;
import java.util.Scanner;

public class Day19_2 {
	//로또 프로그램
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		
		while(true) {
			System.out.println("1~45 숫자 선택(중복불가) :");
			int num = scanner.nextInt();
			
			if(num<1 || num>45) { // || : and연산자
				System.out.println("선택할수 없는 번호입니다");
			}else {
				set.add(num);
				System.out.println("확인 : " + set);
			}
			if(set.size()==6) {
				break;
			}
		}
	}
	
}
