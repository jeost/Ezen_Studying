package Day14;

import java.awt.Toolkit;

public class Beeptask implements Runnable{
	@Override
	//�̱۽�����
	public void run() { // runnable interface ���� run�޼ҵ�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++)
			toolkit.beep();
		try {
		Thread.sleep(500);
		}catch(Exception e) {}
	}
	//��Ƽ������
	Thread thread2 = new BeepThread();{
	
	
	for(int i = 0; i<5; i++) {
		System.out.println("��");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�͸� ��ü [ ��Ƽ ������ ]
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i<5; i++)
				toolkit.beep();
			try {
			Thread.sleep(500);
			}catch(Exception e) {}
		}
	};
	
//	public static void main(String[] args) {
//		System.out.println("Main �޼ҵ� �ȿ� �ִ� ������ �̸� : " + Thread.currentThread().getName());
//															// �� �ڵ带 �д� ������ ȣ��  �̸� ȣ��
//		System.out.println("�۾� ������ �̸� : "+ Thread.getName());
//		
//	}
//	
}
}
