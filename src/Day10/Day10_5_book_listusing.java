package Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_book_listusing {
	
	public static void main(String[] args) {
		
		// 1. 리스트[객체] 생성
		ArrayList<Book> booklist= new ArrayList<>();
		//리스트클래스<안에 저장할 클래스>
			// <클래스> : 해당 클래스의 여러 개 객체를 리스트에 저장
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1.등록 2.목록 3.삭제 4.수정");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				System.out.println(" 도서명 : "); String 도서명 = scanner.next();
				System.out.println(" 저자 : "); String 저자 = scanner.next();
				//객체화
				Book book = new Book(도서명, 저자);
				//배열 저장
				booklist.add(book); // 리스트에 저장
			}else if(ch == 2) {
				for(Book book : booklist) {
					System.out.println(book.get도서명() + "\t" +book.get저자());
				}
			}else if(ch == 3) {
				System.out.println("삭제할 도서 : "); String 도서명 = scanner.next();
				for(Book book : booklist) {
					if(book.get도서명().equals(도서명)) {
						booklist.remove(book); break;
					}
				}
			}else if(ch == 4) {
				System.out.println("수정할 도서 : "); String 도서명 = scanner.next();
				for(Book book : booklist) {
					if(book.get도서명().equals(도서명)) {
						System.out.println("저자이름 수정 : "); String 저자 = scanner.next();
						book.set저자(저자); break;
					}
				}
			}
		}
	}
}
