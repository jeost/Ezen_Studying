package Day06;

import java.util.Scanner;

public class Day06_6 { // c s
	
	public static void main(String[] args) { // m s
		
		// �غ� [ ��� {} �ȿ��� ���Ǵ� ���� ���� ]
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[64];
		
		//program start
		while(true) { // program while s [ owaranai ]
			
			System.out.println("-------Ŀ�´�Ƽ-------");
			System.out.println("��ȣ\t�ۼ���\t����");
				// �迭 �� ��� ��ü(�Խù�) ���
				int index = 0;
				for(Board board : boardlist) {
					if( board != null) {
					System.out.printf("%3d\t%s\t%s" ,
							index, board.writer, board.title
							+"\n"); }index++;
				}
				
			System.out.println("1.�۾��� 2.�ۺ���");
			int ch = scanner.nextInt();
			if( ch==1) { // �۾���
				// 1. 4�� ������ �Է¹޴´�
				System.out.println("---------------�۾��� ������-------------");
				System.out.println(" title : "); String title = scanner.next();
				System.out.println(" content : "); String content = scanner.next();
				System.out.println(" writer : "); String writer = scanner.next();
				System.out.println(" password : "); String pw = scanner.next();
				// 2. 4�� ������ ��üȭ [ ��ü�� ����� 4�� ������ ��ü �� �ʵ忡 ���� ]
				Board board = new Board(title,content,writer,pw);
								// 4�� �ʵ带 ���� ������
				// 3. �迭 �� ������� ã�� ��ü ����
				int i = 0;
				for(Board temp : boardlist ) {
					if(temp == null ) { // �� ������ ã������
						boardlist[i] = board; i++; break; // �ش� �ε����� ���ο� ��ü ����
					}
				}// for end
			}else if(ch==2) { // �ۺ���
				
				System.out.println("-------Ŀ�´�Ƽ-------");
				System.out.println("��ȣ\t�ۼ���\t����");
					// �迭 �� ��� ��ü(�Խù�) ���
					int index2 = 0;
					for(Board board : boardlist) {
						if( board != null) {
						System.out.printf("%3d\t%s\t%s" ,
								index2, board.writer, board.title
								+"\n"); }index2++;
					}// for end
					System.out.println(" ���� ���� �Խù��� ��ȣ �Է� "); int boardNum = scanner.nextInt();
					System.out.printf("��ȣ : " , boardNum); // ��ȣ
					System.out.printf("�ۼ��� : %s " ,boardlist[boardNum].writer); // �ۼ���
					System.out.printf("���� : %s \n" , boardlist[boardNum].title); // ����
					System.out.printf("���� : %s \n" ,boardlist[boardNum].content); // ����
					System.out.println("------------------------------");
					System.out.println("1. ��Ϻ��� 2. �ۻ��� 3. �ۼ���");
					System.out.println("���� : "); int boardselect = scanner.nextInt(); 
					if (boardselect == 1) { // ��Ϻ���
						// ���� �� ���� �ʿ� x
						
					}else if(boardselect == 2) { // �ۻ���
						System.out.println("�Խù��� ��й�ȣ : "); String bPw = scanner.next();
						if (boardlist[boardNum].pw.equals(bPw)) { // �̹� ��ġ ã������ �ݺ��� x
							System.out.println(" ���� ���� ");
							boardlist[boardNum] = null;
							//���� �� ������ �ε��� �ڸ� ������ ��ĭ�� �̵�
							//���� : �ش� �ڵ尡 ������ �迭 ���̻��� ���� �߻�
						for(int i = boardNum; i<boardlist.length; i++) {
							//�˻��� �Խù��� �ε������� ������ �ε������� i�� 1�� ����
							boardlist[boardNum] = boardlist[boardNum+1]; // �ϳ��� ���� ����
							if(boardNum == boardlist.length-1) {
								boardlist[boardNum-1] = null;
							} // �� �ű�� ������ �ε����� �����ߴٸ� �ߺ��Ǵ°� ����
								} // for end
							}else {
							System.out.println(" ���� ���� ");
						} // �ۻ��� ��
					
					}else if(boardselect == 3) { // �ۼ���
						System.out.println("�Խù��� ��й�ȣ : "); String bPw = scanner.next();
						if (boardlist[boardNum].pw.equals(bPw)) { // ��й�ȣ�� ������
							System.out.println("---------------�۾��� ������-------------");
							System.out.println(" title : "); boardlist[boardNum].title = scanner.next();
							System.out.println(" content : "); boardlist[boardNum].content = scanner.next();
							
							 // ����� ���븸 ����
						}else {
							System.out.println(" ��й�ȣ�� �ٸ��ϴ�. ");
						}
					}//�ۼ��� ��
					else {System.out.println("�� �� ���� �Է��Դϴ�.");}
				
			}else { // ��?��
				System.out.println("�� �� ���� �Է�");
			}
		} // program while end
		
	} // m e
	
} // c e
