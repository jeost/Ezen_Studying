package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import Day10.��ǰ;

public class Controller {
	// ��� �޼ҵ�� static
	
	public static ArrayList<Board> boardlist = new ArrayList<>();
	
	// 2. ���� �޼ҵ�
	public static void write(String ����, String ����, String �ۼ���, String ��й�ȣ) {
		//��üȭ
		Board board = new Board(����, ����, �ۼ���, ��й�ȣ);
		//����Ʈ�� ����
		boardlist.add(board);
		//���Ͽ� ����
		save();
	}

	// 4. ���� �޼ҵ�
	public static boolean update(int num, String pw, String title, String content) {
		if(pw.equals(boardlist.get(num).getPw())) {
		boardlist.get(num).setTitle(title);
		boardlist.get(num).setContent(content);
		save(); // ���� ������Ʈ
		return true;
		}return false;
	}
	// 5. ���� �޼ҵ�
	public static boolean delete(int num, String pw) {
		Board temp = Controller.boardlist.get(num); // �ϴ� index��ȣ�� �ش��ϴ°� �� ���ͼ� ���
		if(temp.getPw().equals(pw)) {
			boardlist.remove(num); // �ֿܼ��� ����
			save(); // �����Ȱ� �ݿ�
			return true; // ���� ������
		}return false; // ���� ���н�
	}
	// 6. ��۾��� �޼ҵ�					 ��� ����			��� �ۼ��ڸ�	��� ���
	public static void replyWrite(String comment, String rName, String rPw) {
		
	}
	// 7. �Խù� ���� �޼ҵ�
	public static void save() {
		//����Ʈ �� ��� �Խù��� ���Ͽ� ����
		try { // ���� ���� Ŭ����
		FileOutputStream outputStream = new FileOutputStream("D:\\JAVA/�Խù�����.txt");
		//�ۼ��� ���� [ �Խù� 1���� = ��ü 1���� ]
		for( Board temp : boardlist) { // , : �ʵ� ���� \n : ��ü ����
			String �ۼ����� =  temp.getTitle() + "," + temp.getContent() + "," + temp.getPw() + "," + temp.getWriter() + ","
		+ temp.getViewcount() + ","+ temp.getDate()+"\n";
			//����[���ڿ�]->����Ʈ�� ��ȯ
			//��������[write()]
			outputStream.write(�ۼ�����.getBytes());
			}
		}catch(Exception e) {System.out.println("�������� ����");}
	}
	// 8. �Խù� �ҷ����� �޼ҵ�
	public static void boardLoad() {
		try {
			FileInputStream inputStream = new FileInputStream("D:\\JAVA/�Խù�����.txt");
			
				// 1. ����Ʈ �迭 ����
			 	byte[] bytes = new byte[1000];
			 	// 2. �о�ͼ� �迭�� ����
			 	inputStream.read(bytes);
			 	// 3. [, : �ʵ� ���� \n : ��ü ���� ]
			 	String file = new String(bytes);
			 	//	String ���� �޼ҵ�		split("����") ;
			 	String[] boards = file.split("\n");
			 	int i = 0;
			 	for( String ���� : boards) { // for s
			 		if(i+1==����.length()) {break;}
			 		String[] field = ����.split(",");
			 		Board board = new Board(field[0], field[1], field[2], field[3], Integer.parseInt(field[4]) , field[5] , null );
			 					// ���ڿ� --> ������ ��ȯ 
			 					// ����Ʈ ����
			 		boardlist.add(board); i++;
			 } // for e
	}catch(Exception e) {System.out.println("�ҷ����� ����" + e);}
	}
} // c e
