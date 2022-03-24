package Day06;

import java.util.Scanner;

public class Day06_6 { // c s
	
	public static void main(String[] args) { // m s
		
		// 준비 [ 모든 {} 안에서 사용되는 변수 선언 ]
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[64];
		
		//program start
		while(true) { // program while s [ owaranai ]
			
			System.out.println("-------커뮤니티-------");
			System.out.println("번호\t작성자\t제목");
				// 배열 내 모든 객체(게시물) 출력
				int index = 0;
				for(Board board : boardlist) {
					if( board != null) {
					System.out.printf("%3d\t%s\t%s" ,
							index, board.writer, board.title
							+"\n"); }index++;
				}
				
			System.out.println("1.글쓰기 2.글보기");
			int ch = scanner.nextInt();
			if( ch==1) { // 글쓰기
				// 1. 4개 변수를 입력받는다
				System.out.println("---------------글쓰기 페이지-------------");
				System.out.println(" title : "); String title = scanner.next();
				System.out.println(" content : "); String content = scanner.next();
				System.out.println(" writer : "); String writer = scanner.next();
				System.out.println(" password : "); String pw = scanner.next();
				// 2. 4개 변수를 객체화 [ 객체를 만들어 4개 변수를 객체 내 필드에 저장 ]
				Board board = new Board(title,content,writer,pw);
								// 4개 필드를 갖는 생성자
				// 3. 배열 내 빈공간을 찾아 객체 대입
				int i = 0;
				for(Board temp : boardlist ) {
					if(temp == null ) { // 빈 공간을 찾았으면
						boardlist[i] = board; i++; break; // 해당 인덱스에 새로운 객체 저장
					}
				}// for end
			}else if(ch==2) { // 글보기
				
				System.out.println("-------커뮤니티-------");
				System.out.println("번호\t작성자\t제목");
					// 배열 내 모든 객체(게시물) 출력
					int index2 = 0;
					for(Board board : boardlist) {
						if( board != null) {
						System.out.printf("%3d\t%s\t%s" ,
								index2, board.writer, board.title
								+"\n"); }index2++;
					}// for end
					System.out.println(" 보고 싶은 게시물의 번호 입력 "); int boardNum = scanner.nextInt();
					System.out.printf("번호 : " , boardNum); // 번호
					System.out.printf("작성자 : %s " ,boardlist[boardNum].writer); // 작성자
					System.out.printf("제목 : %s \n" , boardlist[boardNum].title); // 제목
					System.out.printf("내용 : %s \n" ,boardlist[boardNum].content); // 내용
					System.out.println("------------------------------");
					System.out.println("1. 목록보기 2. 글삭제 3. 글수정");
					System.out.println("선택 : "); int boardselect = scanner.nextInt(); 
					if (boardselect == 1) { // 목록보기
						// 굳이 뭘 적을 필요 x
						
					}else if(boardselect == 2) { // 글삭제
						System.out.println("게시물의 비밀번호 : "); String bPw = scanner.next();
						if (boardlist[boardNum].pw.equals(bPw)) { // 이미 위치 찾았으니 반복문 x
							System.out.println(" 삭제 성공 ");
							boardlist[boardNum] = null;
							//삭제 후 삭제된 인덱스 뒤를 앞으로 한칸씩 이동
							//이유 : 해당 코드가 없으면 배열 사이사이 공백 발생
						for(int i = boardNum; i<boardlist.length; i++) {
							//검색된 게시물의 인덱스부터 마지막 인덱스까지 i는 1씩 증가
							boardlist[boardNum] = boardlist[boardNum+1]; // 하나씩 당기며 복제
							if(boardNum == boardlist.length-1) {
								boardlist[boardNum-1] = null;
							} // 다 옮기고 마지막 인덱스에 도달했다면 중복되는거 삭제
								} // for end
							}else {
							System.out.println(" 삭제 실패 ");
						} // 글삭제 끝
					
					}else if(boardselect == 3) { // 글수정
						System.out.println("게시물의 비밀번호 : "); String bPw = scanner.next();
						if (boardlist[boardNum].pw.equals(bPw)) { // 비밀번호가 맞으면
							System.out.println("---------------글쓰기 페이지-------------");
							System.out.println(" title : "); boardlist[boardNum].title = scanner.next();
							System.out.println(" content : "); boardlist[boardNum].content = scanner.next();
							
							 // 제목과 내용만 수정
						}else {
							System.out.println(" 비밀번호가 다릅니다. ");
						}
					}//글수정 끝
					else {System.out.println("알 수 없는 입력입니다.");}
				
			}else { // ㅁ?ㄹ
				System.out.println("알 수 없는 입력");
			}
		} // program while end
		
	} // m e
	
} // c e
