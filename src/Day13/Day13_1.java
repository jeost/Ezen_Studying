package Day13;

public class Day13_1 {

	public static void main(String[] args) {
		
		System.out.println("절댓값 : " + Math.abs(-5));
		System.out.println("절댓값 : " + Math.abs(-3.14));
		
		System.out.println("올림값 : " + Math.ceil(5.3)); // 소수점 첫째자리 올림
		System.out.println("올림값 : " + Math.ceil(-5.3));
		
		System.out.println("내림값 : " + Math.floor(5.3));
		System.out.println("내림값 : " + Math.floor(-5.3));
		
		System.out.println("최댓값 : " + Math.max(5, 9)); // 더 큰수
		System.out.println("최댓값 : " + Math.max(5.3, 2.5));
		
		System.out.println("최솟값 : " + Math.min(5, 9)); // 더 작은 수
		System.out.println("최솟값 : " + Math.min(5.3, 2.5));
		
		System.out.println("랜덤값 : " + Math.random()); // 0~1사이의 난수 발생
		
		System.out.println("가까운 정수의 실수값 : " + Math.rint(5.3)); // 반올림값을 double형태로
		System.out.println("가까운 정수의 실수값 : " + Math.rint(5.7));
		
		System.out.println("가까운 정수의 정수값 : " + Math.round(5.3)); // 반올림값을 int형태로
		System.out.println("가까운 정수의 정수값 : " + Math.round(5.7));
		
		double value = 12.3456;
		double temp1 = value*100;
		long temp2 = Math.round(temp1);
		double v16 = temp2/100.0; // double형태라 소숫점붙여야함
		System.out.println("v16 = " + v16);
		
		int num = (int)(Math.random()*6)+1;
		System.out.println(" 1~6사이의 난수 " + num);
	}
}
