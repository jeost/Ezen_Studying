package Day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day10_6 {
	
	public static void main(String[] args) throws IOException {
		// 1.파일출력 [ 파일->자바 ]
		FileOutputStream fileOutputStream = new FileOutputStream("‪D:\\JAVA\\java1.txt");
		String 내용 = "자바 입력 데이터";
		fileOutputStream.write(내용.getBytes());
		// 2.파일입력 [ 자바->파일 ]
		FileInputStream fileInputStream = new FileInputStream("‪‪D:\\JAVA\\java1.txt");
		byte[] bytes = new byte[1000];
		fileInputStream.read(bytes);
		System.out.println("파일내용 : "+ new String(bytes));
	}
}
