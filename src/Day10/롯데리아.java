package Day10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class �Ե����� extends ����{

	private String ����;
	private ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<>();
	
	
	public �Ե�����() {}
	
	
	public �Ե�����(String ����, ArrayList<��ǰ> ��ǰ����Ʈ) {
		super();
		this.���� = ����;
		this.��ǰ����Ʈ = ��ǰ����Ʈ;
	}


	@Override // ������
	public void ��ǰ���() { 
		System.out.println("�Ե����� ��ǰ ���");
		int i=1;
		for(��ǰ temp : ��ǰ����Ʈ) {
			System.out.print(i+"."+temp.get��ǰ��()+"("+temp.get����()+")");
			i++;
		}
	}
	@Override
	public void ��ǰ�߰�() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" �Ե����� ��ǰ�߰� ");
		System.out.println(" ��ǰ�� : "); String ��ǰ�� = scanner.next(); 
		System.out.println(" ��� : "); int ��� = scanner.nextInt();
		System.out.println(" ���� : "); int ���� = scanner.nextInt();
		��ǰ ��ǰ = new ��ǰ(��ǰ��, ���, ����); // �ϳ��� ��ü�� ��ġ��
		��ǰ����Ʈ.add(��ǰ); // ����Ʈ�� ����
		FileOutputStream fileOutputStream;
		try { // ������ �߻��� �� ���� �ڵ� ����
			fileOutputStream = new FileOutputStream("D:/java/�Ե��������.txt", true);
		
		 // ����ó��
		String �������� = ��ǰ��+","+���+","+����+"\n"; // , ����
		fileOutputStream.write(��������.getBytes()); // ����
		System.out.println("��ǰ ���� �Ϸ�");
	} catch (Exception e) {
	}
}
}