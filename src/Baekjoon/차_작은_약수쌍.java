package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class 차_작은_약수쌍 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			ArrayList<Integer> c = new ArrayList<>();
			//약수 찾기
			for(int i=1; i<=a; i++) {
				if(a%i==0) { // i가 a의 약수면
					c.add(i); // 작은쪽의 약수를 저장하기
				}
			}
			int b = 60;
			int d = a; // 일단 큰 값 저장
			for(int temp : c) {
				if(d>Math.abs(temp-a/temp)) { // 차이가 더 작을시 작동
				d = Math.abs(temp-(a/temp)); // 약수쌍의 차를 저장
				b = temp; //b에 해당 인덱스의 값 저장
				}
			}
			System.out.println("가장 차이가 작은 약수쌍 : "+b+","+a/b);			
		}catch(Exception e) {System.out.println(e);}
	}// m e
}
