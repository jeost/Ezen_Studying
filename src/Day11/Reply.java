package Day11;

public class Reply {

	// 1. �ʵ�
	private String content;
	private String writer;
	private String pw;
	private String date;
	// 2. ������
		// ��
	public Reply() {}
		// ��� �ۼ���
	public Reply(String content, String writer, String pw) {
		super();
		this.content = content;
		this.writer = writer;
		this.pw = pw;
	}
		// Ǯ
	public Reply(String content, String writer, String pw, String date) {
		super();
		this.content = content;
		this.writer = writer;
		this.pw = pw;
		this.date = date;
	}
	
	// 3. �޼ҵ�
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
