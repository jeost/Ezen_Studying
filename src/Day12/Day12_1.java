package Day12;

import java.io.IOException;

public class Day12_1 {

	public static void main(String[] args) throws IOException {
		
		byte[] bytes = {72, 101,108,108,111,32,74,97,118,97}; // 여러개의 바이트를 저장할 수 있는 바이트 배열 선언
		
		String str1 = new String(bytes);
		
		System.out.println("바이트배열 -> 문자열 변환 : " + str1);
		
		
		byte[] bytes2 = new byte[100];
		
		System.out.println("입력 : "); int readByteNo = System.in.read(bytes2);
	}
	
}
