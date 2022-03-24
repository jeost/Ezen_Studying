package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import Day10.상품;

public class Controller {
	// 모든 메소드는 static
	
	public static ArrayList<Board> boardlist = new ArrayList<>();
	
	// 2. 쓰기 메소드
	public static void write(String 제목, String 내용, String 작성자, String 비밀번호) {
		//객체화
		Board board = new Board(제목, 내용, 작성자, 비밀번호);
		//리스트에 저장
		boardlist.add(board);
		//파일에 저장
		save();
	}

	// 4. 수정 메소드
	public static boolean update(int num, String pw, String title, String content) {
		if(pw.equals(boardlist.get(num).getPw())) {
		boardlist.get(num).setTitle(title);
		boardlist.get(num).setContent(content);
		save(); // 파일 업데이트
		return true;
		}return false;
	}
	// 5. 삭제 메소드
	public static boolean delete(int num, String pw) {
		Board temp = Controller.boardlist.get(num); // 일단 index번호에 해당하는거 다 빼와서 담기
		if(temp.getPw().equals(pw)) {
			boardlist.remove(num); // 콘솔에서 삭제
			save(); // 삭제된거 반영
			return true; // 삭제 성공시
		}return false; // 삭제 실패시
	}
	// 6. 댓글쓰기 메소드					 댓글 내용			댓글 작성자명	댓글 비번
	public static void replyWrite(String comment, String rName, String rPw) {
		
	}
	// 7. 게시물 저장 메소드
	public static void save() {
		//리스트 내 모든 게시물을 파일에 저장
		try { // 파일 저장 클래스
		FileOutputStream outputStream = new FileOutputStream("D:\\JAVA/게시물파일.txt");
		//작성할 내용 [ 게시물 1개씩 = 객체 1개씩 ]
		for( Board temp : boardlist) { // , : 필드 구분 \n : 객체 구분
			String 작성내용 =  temp.getTitle() + "," + temp.getContent() + "," + temp.getPw() + "," + temp.getWriter() + ","
		+ temp.getViewcount() + ","+ temp.getDate()+"\n";
			//내용[문자열]->바이트열 변환
			//내보내기[write()]
			outputStream.write(작성내용.getBytes());
			}
		}catch(Exception e) {System.out.println("파일저장 실패");}
	}
	// 8. 게시물 불러오기 메소드
	public static void boardLoad() {
		try {
			FileInputStream inputStream = new FileInputStream("D:\\JAVA/게시물파일.txt");
			
				// 1. 바이트 배열 선언
			 	byte[] bytes = new byte[1000];
			 	// 2. 읽어와서 배열에 저장
			 	inputStream.read(bytes);
			 	// 3. [, : 필드 구분 \n : 객체 구분 ]
			 	String file = new String(bytes);
			 	//	String 분해 메소드		split("기준") ;
			 	String[] boards = file.split("\n");
			 	int i = 0;
			 	for( String 보드 : boards) { // for s
			 		if(i+1==보드.length()) {break;}
			 		String[] field = 보드.split(",");
			 		Board board = new Board(field[0], field[1], field[2], field[3], Integer.parseInt(field[4]) , field[5] , null );
			 					// 문자열 --> 정수형 변환 
			 					// 리스트 저장
			 		boardlist.add(board); i++;
			 } // for e
	}catch(Exception e) {System.out.println("불러오기 실패" + e);}
	}
} // c e
