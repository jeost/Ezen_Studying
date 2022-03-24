package Day15;

import java.util.Scanner;

public class Day15_3 {
	
	public static void main(String[] args) {
		Car car = new Car();
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.println("1. 입차 2. 출차");
		int ch = scanner.nextInt();
		
		if ( ch == 1) {
			//차량번호 입력받기
			String carNum = scanner.next();
			//입력받은 차량번호를 Controller 내 메소드로 넘기기
			Controller.입차(carNum);
			//메소드 결과에 따라 결과 출력
			boolean result1 = Controller.입차(carNum);
		}else if (ch == 2) {
			//차량번호 입력받기
			//입력받은 차량번호를 Controller 내 메소드로 넘기기
			//메소드 결과에 따라 결과 출력
		}
		} // while e
	} // m e
} // c s
