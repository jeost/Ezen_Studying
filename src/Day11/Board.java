package Day11;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Board {

	// 1. 필드
	private String title;
	private String content;
	private String pw;
	private String writer;
	private int viewcount;
	private String date;
	private ArrayList<Reply> replylist = new ArrayList<>();
	// 2. 생성자
		// 1. 빈생성자
	public Board() {}
		// 2. 게시물 등록시 사용
	
	public Board(String title, String content, String pw, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.pw = pw;
		this.writer = writer;
			//날짜 클래스 -> date 클래스
		Date date = new Date();
			//날짜 형식 클래스 : SimpleDateFormat ( java.text )
		SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
		this.date = format.format(date);
				//객체명.format(날짜) -> 해당 날짜가 format에서 설정한 패턴으로 형식 변환(문자열)
	}
		// 3. 풀
	public Board(String title, String content, String pw, String writer, int viewcount, String date,
			ArrayList<Reply> replylist) {
		this.title = title;
		this.content = content;
		this.pw = pw;
		this.writer = writer;
		this.viewcount = viewcount;
		this.date = date;
		this.replylist = replylist;
		}
	
	// 3. 메소드 [ private 필드 사용시 getter or setter 선언 ]
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getViewcount() {
		return viewcount;
	}

	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public ArrayList<Reply> getReplylist() {
		return replylist;
	}

	public void setReplylist(ArrayList<Reply> replylist) {
		this.replylist = replylist;
	}

	
}
