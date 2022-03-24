package Day11;

import java.util.Scanner;

public class Day11_4_BoardApp { // c s
	// 게시판
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Controller.boardLoad();
		
		while(true) {
			try { // 사용자가 문자 입력시 예외가 발생해 catch로 이동
				// 모든 게시물 출력
			System.out.printf("%s\t%s\t%s\t%s\t%s\t \n" , "번호" , "제목" , "작성자" , "작성일" , "조회수");
			int i = 0;
			for(Board board : Controller.boardlist) {
				System.out.printf("%s\t%s\t%s\t%s\t%s\t \n" , i, board.getTitle(), board.getWriter(), board.getDate(), board.getViewcount());
			i++;}
			System.out.println("1. 쓰기 2. 보기 선택 : ");
			int ch = scanner.nextInt();
			if( ch == 1) {
				System.out.println(" 게시물 등록 ");	
				scanner.nextLine();
				System.out.println(" 제목 : ");	String 제목 = scanner.nextLine();
				System.out.println(" 내용 : ");	String 내용 = scanner.nextLine();
				System.out.println(" 작성자 : "); String 작성자 = scanner.next();
				System.out.println(" 비밀번호[수정/삭제시] : "); String 비밀번호 = scanner.next();
				Controller.write(제목 , 내용 , 작성자 , 비밀번호); // 인수 전달
			}
			else if(ch == 2) { // 모든 게시물정보 출력
				
				System.out.println("보고싶은 게시물 번호 : "); int num = scanner.nextInt();
				Board temp = Controller.boardlist.get(num); // 해당 인덱스의 객체를 다 빼와서 임시객체에 담기
				System.out.printf("%s\t%s\t%s\t%s\t%s\t \n", num, temp.getTitle(), temp.getWriter(), temp.getDate(), temp.getViewcount());
				
				//댓글출력[나중에]
				
				//메뉴
				System.out.println("1. 뒤로가기 2. 수정 3. 삭제 4. 댓글쓰기 선택 : "); int ch2 = scanner.nextInt();
				if(ch2==1) {} // 냅두면 뒤로감(끝나서 올라감)
				else if(ch2==2) { // 수정
					System.out.println("수정할 게시물 비밀번호 입력 :"); String pw = scanner.next();
					scanner.nextLine();
					System.out.println("변경할 제목 :"); String title = scanner.nextLine();
					System.out.println("변경할 내용 :"); String content = scanner.nextLine();
					boolean result = Controller.update(num, pw, title, content); // 수정할 인덱스 번호, 비밀번호, 제목, 내용 입력받아 인수로 전달
					if(result == true) {System.out.println("변경 성공");}
					else {System.out.println("비밀번호 오류");}
				}
				else if(ch2==3) { // 삭제
					System.out.println("삭제할 게시물 비밀번호 입력 : "); String pw = scanner.next();
					boolean result = Controller.delete(num, pw); // 삭제할 인덱스 번호, 비밀번호
					if (result == true) System.out.println("삭제 성공");
					else {System.out.println("비밀번호 오류");}
				}
				else if(ch2==4) { // 댓글
					System.out.println("댓글 내용 입력 : "); String comment = scanner.nextLine();
					System.out.println("이름 입력 : "); String rName = scanner.next();
					System.out.println("댓글 비밀번호 입력 : "); String rPw = scanner.next();
					Controller.replyWrite(comment, rName, rPw); // 게시물 인덱스 번호, 댓글 내용, 댓글 작성자, 댓글 비밀번호 입력받기
				}
				else {System.out.println("1~4중에 입력");}
			}
			else {}
			}catch(Exception e) {
			System.out.println("입력 오류" + e); 
			scanner = new Scanner(System.in); // 기존 오류의 원인을 지우기 위해 새로 받기
			}
		} // while e
	}// m e
} // c e
