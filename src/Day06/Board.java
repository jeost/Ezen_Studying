package Day06;

public class Board {
	// Board Ŭ���� ����
	
	// 1. �ʵ�
	String title;
	String content;
	String writer;
	String pw;
	// 2. ������
		// 1. �������
	Board(){}
		// 2. 1�� �ʵ带 �޴�
	Board(String title){ // �ܺκ���
		this.title = title;
	} // this.�ʵ�� => ���κ���. �ܺο��� ���� ������ ���κ����� ����
		// 3. 2�� ��
	Board(String title, String content){
		this.title = title; this.content = content;
	}
		// 4. 3��
	Board(String title, String content, String writer){
		this.title = title; this.content = content; this.writer = writer;
	}
		// 5. 4
	Board(String title, String content, String writer, String pw){
		this.title = title; this.content = content; this.writer = writer; this.pw = pw;
	}
	// 3. �޼ҵ�
}
