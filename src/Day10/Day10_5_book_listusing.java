package Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_book_listusing {
	
	public static void main(String[] args) {
		
		// 1. ����Ʈ[��ü] ����
		ArrayList<Book> booklist= new ArrayList<>();
		//����ƮŬ����<�ȿ� ������ Ŭ����>
			// <Ŭ����> : �ش� Ŭ������ ���� �� ��ü�� ����Ʈ�� ����
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1.��� 2.��� 3.���� 4.����");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				System.out.println(" ������ : "); String ������ = scanner.next();
				System.out.println(" ���� : "); String ���� = scanner.next();
				//��üȭ
				Book book = new Book(������, ����);
				//�迭 ����
				booklist.add(book); // ����Ʈ�� ����
			}else if(ch == 2) {
				for(Book book : booklist) {
					System.out.println(book.get������() + "\t" +book.get����());
				}
			}else if(ch == 3) {
				System.out.println("������ ���� : "); String ������ = scanner.next();
				for(Book book : booklist) {
					if(book.get������().equals(������)) {
						booklist.remove(book); break;
					}
				}
			}else if(ch == 4) {
				System.out.println("������ ���� : "); String ������ = scanner.next();
				for(Book book : booklist) {
					if(book.get������().equals(������)) {
						System.out.println("�����̸� ���� : "); String ���� = scanner.next();
						book.set����(����); break;
					}
				}
			}
		}
	}
}
