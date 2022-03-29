package Baekjoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int A = scanner.nextInt();
       int B = A;
       int count = 0;
       for(int i = 0; i<100; i++) {
       String b = String.format("%02d", B); // 두자리로 만들기
       
       char c = b.charAt(0);
       char d = b.charAt(1); // 자릿수 분할
       int C = c-48;
       int D = d-48; // int로 변환
       
       B = C+D;
       count++;
       if(A==B) {
    	   break;
       	}
       }
       System.out.print(count);
    }
}