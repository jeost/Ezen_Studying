package Day01;

import java.util.Scanner;

public class Day01_6 { // c s
public static void main1(String[] args) { // m s
	//입력객체 선언
	Scanner scanner = new Scanner(System.in);
	//입력받고 옮기기
	System.out.print("작성자 : "); String name = scanner.next();
	System.out.print("내용 : ");	String naiyou = scanner.next();
	System.out.print("날짜 : "); String day = scanner.next();
	//출력
	System.out.println("-------방문록-------");
	System.out.println("|순번|작성자|내용\t  |날짜  |");
	System.out.println("|1  |"+name+"|"+naiyou+"|"+day+"|");
} // m e

} // c e
