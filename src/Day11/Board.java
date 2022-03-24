package Day11;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Board {

	// 1. �ʵ�
	private String title;
	private String content;
	private String pw;
	private String writer;
	private int viewcount;
	private String date;
	private ArrayList<Reply> replylist = new ArrayList<>();
	// 2. ������
		// 1. �������
	public Board() {}
		// 2. �Խù� ��Ͻ� ���
	
	public Board(String title, String content, String pw, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.pw = pw;
		this.writer = writer;
			//��¥ Ŭ���� -> date Ŭ����
		Date date = new Date();
			//��¥ ���� Ŭ���� : SimpleDateFormat ( java.text )
		SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
		this.date = format.format(date);
				//��ü��.format(��¥) -> �ش� ��¥�� format���� ������ �������� ���� ��ȯ(���ڿ�)
	}
		// 3. Ǯ
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
	
	// 3. �޼ҵ� [ private �ʵ� ���� getter or setter ���� ]
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
