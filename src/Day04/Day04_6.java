package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_6 { // c s
	public static void main(String[] args) { // m s
		//������ ����
		String[] ttt= { "[ ]" , "[ ]", "[ ]",
						"[ ]" , "[ ]", "[ ]",
						"[ ]" , "[ ]", "[ ]"
		};
		//������ ����
		String �¸��� = ""; // �¸��ϸ� ���� ����
		Scanner scanner=new Scanner(System.in); 
		Random random=new Random();
		boolean set = true;
		boolean turn = true;
		int ��ĭ = 9;
			//�ϴ� �ݺ���Ű��
			while(set) { // �������� : 9ĭ ���ų� �¸��� ����(3��)
				//��ĭ ���� �ʱ�ȭ
				��ĭ = 9;
					//������ ���(��� �ε��� ���)
				for(int i=0; i<ttt.length ; i++) {
					//�ٹٲ�
					if((i+1)%3==0)
						System.out.println(ttt[i]);
					else System.out.print(ttt[i]);
				}//��� ��
				
				//�÷��̾��� ��ġ(�ε���) ����
				while(set) {
					System.out.println("1~9 ��ȣ �Է�"); int p = scanner.nextInt();
					if(ttt[p-1].equals("[ ]")) { // �����̸� �α�
						ttt[p-1] = "[O]"; 
						 break;
				}else { System.out.println("�̹� ���� ������ �缱��"); 
					}// else end
				}// �÷��̾� while end
					
				//computer ��ġ ����
				while(set) { int x = random.nextInt(9);
					if (ttt[x-1].equals("[ ]")) { // �����̸� �α�
						ttt[x-1] = "[X]";
							 break; // ���� ã���� break;
					}// if end
				}// ��ǻ�� while end
				
				//�¸��Ǵ�
				//���� �¸�
				for(int i=0; i<=6; i+=3) {
					//i�� 0���� 6���� 3������
					if(ttt[i].equals(ttt[i+1]) && ttt[i+1].equals(ttt[i+2])){
						//0==1 && 1==2(�ε���)
						�¸��� = ttt[i];
					} // if end
				}//for end
				
				//���� �¸�
				for(int i=0; i<=2; i++) {
					//i�� 0���� 2���� 1������
					if(ttt[i].equals(ttt[i+3]) && ttt[i+3].equals(ttt[i+6])) {
						//0==3 && 3==6(�ε���)
						�¸��� = ttt[i];
					}// if end
				}// for end
				
				//�밢 �¸�
				//4�� ���ԵǸ� ���� ���ϸ� 12
				if(ttt[0].equals(ttt[4]) && ttt[4].equals(ttt[8])) {
					�¸��� = ttt[4];
				}
				if(ttt[2].equals(ttt[4]) && ttt[4].equals(ttt[6])) {
					�¸��� = ttt[4];
				}
				
				//���� ����(���� �¸�)
				if (�¸���.equals("[O]")) {
					System.out.println(" �÷��̾� �¸� ");
					for(int i=0; i<ttt.length ; i++) {
						//�ٹٲ�
						if((i+1)%3==0)
							System.out.println(ttt[i]);
						else System.out.print(ttt[i]);
					}
				}
				if (�¸���.equals("[X]")) {
					System.out.println(" ��ǻ�� �¸� ");
					for(int i=0; i<ttt.length ; i++) {
						//�ٹٲ�
						if((i+1)%3==0)
							System.out.println(ttt[i]);
						else System.out.print(ttt[i]);
					}
				}// ���� �¸� end
				
				//���� ����(��ĭ x)
				for (int i=0; i<9; i++){
					if (ttt[i].equals("[ ]")) {
						//��ĭ ������ �н�
					}
					else { ��ĭ--;
						//���ִ¸�ŭ ��ĭ ���� ����
					}
				if( ��ĭ == 0) { // ��ĭ�� 0�����
					System.out.println("���º�");
					for(int k=0; k<ttt.length ; k++) {
						
						if((k+1)%3==0)
							System.out.println(ttt[k]);
						else System.out.print(ttt[k]);
						}
					}
				}
			} //while end
	} // m e
} // c e