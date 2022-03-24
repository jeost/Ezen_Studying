package Day12;

import java.util.Random;

public class Day12_4 {

	// 차량번호 구분 프로그램(뒷 4글자만)
	//조건
		//1. 난수 0000~9999 사이 난수 10개 생성해서 배열에 저장
		//2. 모든 차량 번호를 배열에 저장
		//3. 끝자리 번호로 홀/짝 구분
		//4. 끝자리 번호가 홀수인 차량 배열에 저장
		//5. 끝자리 번호가 짝수인 차량 배열에 저장
	
	public static void main(String[] args) {
		
		Random random = new Random();
		String[] 홀수 = new String[10];
		String[] 짝수 = new String[10];
		  // 조건1 난수10개저장
			int intnum=random.nextInt(10000);
			String strnum = String.format("%04d", intnum);
		
		String[] cNum = new String[10];
		
		for(int i = 0; i<cNum.length; i++) { // 조건 2 차량번호 배열에 저장
			if(cNum[i] == null) {
			cNum[i] = strnum;
			}
		}
//		int b = 0;
//		for(String temp : cNum) { // 조건 3 구분 후 
//		if (Integer.parseInt(temp.charAt(3)==1) { // 나머지가 1인 홀수면
//			홀수[b] = cNum[j]; b++;
//			}
//		}
		int c = 0;
		for(int a = 0; a<cNum.length; a++) { // 조건 3 구분 후 
		if (cNum[a].charAt(3)%2==0) { // 나머지가 0인 짝수면
			짝수[c] = cNum[a]; c++;
			}
		}
		//모든 차량 번호 출력
		System.out.println("주차중인 모든 차량 번호");
		for(String temp : cNum) {
			if(temp != null) {
				System.out.println(temp + "");
			}
		}
	} // m e
}
