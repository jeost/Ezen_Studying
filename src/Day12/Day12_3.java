package Day12;

import java.io.IOException;

public class Day12_3 {

	public static void main(String[] args) {
		
		// ���� �˻� ���α׷�
			// ����
			// 1. �Է¹ޱ� [ system.in.read() ]
			// 2. String �迭 �� ���� ������ ����
				//
			// 3. �˻����, �������
				// �˻���� : Ư�� ���ڸ� �Է¹޾� ���� �� ���Ե� ���ڰ� ������ ��� ���
				String[] ������� = {	
					"�ȴ�! ���̹� ��α�&����Ʈ",
					"������ ��Ʈ ���� Ȱ�� ������",
					"Tucker�� Go ��� ���α׷���",
					"ȥ�� �����ϴ� C ���"};			
				while(true) {
				System.out.println("1. �����˻� 2. ����"); 
				try {
					byte[]bytes=new byte[100];
					int count = System.in.read(bytes);
					String select = new String(bytes, 0, count-2);
				switch(select) {
				case ("1") : {
					System.out.println("�˻��� ������ �Է�");
					byte[] input = new byte[100]; try {
						int count1 = System.in.read(input);
					String search = new String(input, 0, count1-2);
					System.out.println("--�˻� ���--");
						for(String temp : �������) {
							if(temp.indexOf(search) != -1) {
								System.out.println(temp);
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}case("2"): {
					System.out.println("���� ������");
					System.out.println("������ �������� �Ϻ� �Է� :");
					byte[]bytes2=new byte[100];
					int count2 = System.in.read(bytes2);
					String bsearch = new String(bytes2, 0, count2-2);
					int i = 0;
					for(String temp : �������) {
						if(temp.contains(bsearch)) {
							System.out.println("������ȣ : "+i+"�� ����� : " + temp);
						}i++;
					}
					System.out.println("������ȣ ���� : ");
						count = System.in.read(bytes);
					String ch = new String(bytes, 0, count-2);
						// ���ڿ��� �޾����� ��ȯ
						int index = Integer.parseInt(ch);
					System.out.println(" ���� ���� : ");
						count = System.in.read(bytes);
						String oldstr = new String(bytes, 0, count-2);
					System.out.println(" ���ο� ���� : ");
						count = System.in.read(bytes);
						String newstr = new String(bytes, 0, count-2);
						//�������� ������Ű�� ����ֱ�[����]
					�������[index] = �������[index].replace(oldstr, newstr); System.out.println("���� �Ϸ�");
				}
			} 
		}catch (IOException e) {
			e.printStackTrace();
			}
		}
	}
}
