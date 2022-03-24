package Day10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class 롯데리아 extends 점포{

	private String 점주;
	private ArrayList<상품> 상품리스트 = new ArrayList<>();
	
	
	public 롯데리아() {}
	
	
	public 롯데리아(String 점주, ArrayList<상품> 상품리스트) {
		super();
		this.점주 = 점주;
		this.상품리스트 = 상품리스트;
	}


	@Override // 재정의
	public void 제품목록() { 
		System.out.println("롯데리아 제품 목록");
		int i=1;
		for(상품 temp : 상품리스트) {
			System.out.print(i+"."+temp.get상품명()+"("+temp.get가격()+")");
			i++;
		}
	}
	@Override
	public void 상품추가() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 롯데리아 상품추가 ");
		System.out.println(" 상품명 : "); String 상품명 = scanner.next(); 
		System.out.println(" 재고 : "); int 재고 = scanner.nextInt();
		System.out.println(" 가격 : "); int 가격 = scanner.nextInt();
		상품 상품 = new 상품(상품명, 재고, 가격); // 하나의 객체로 합치기
		상품리스트.add(상품); // 리스트에 저장
		FileOutputStream fileOutputStream;
		try { // 오류가 발생할 것 같은 코드 묶음
			fileOutputStream = new FileOutputStream("D:/java/롯데리아재고.txt", true);
		
		 // 파일처리
		String 내보내기 = 상품명+","+재고+","+가격+"\n"; // , 구분
		fileOutputStream.write(내보내기.getBytes()); // 저장
		System.out.println("상품 저장 완료");
	} catch (Exception e) {
	}
}
}