package Day07;

public class Car { // c s
	//Ŭ���� ����

	// 1. �ʵ�
	int gas; // ���� ���� ����
	
	// 2. ������
		//������ ��� �⺻������
	
	// 3. �޼ҵ�
	void setGas(int gas) { // �μ�o ��ȯx 
		// gas�� �ܺο��� ����
		this.gas = gas;	// ���� gas�� ����
	} // this.�ʵ�� : ����(��Ŭ��������)����
	boolean isLeftGas() { // ����ȯ �޼ҵ��()
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}	
		else {
			System.out.println("gas�� �ֽ��ϴ�.");
			return true; // ���κ����� gas�� 0�� �ƴϸ� true ��ȯ
			
		}
	}// boolean e
		// gas�� 0�϶����� �����ϸ� ���� 1�� -- �޼ҵ�
		// gas�� 0�̸� �Լ� ����
	void run() { // �μ�x ��ȯx 
		while(true) { // while s
			if(gas>0) {
				System.out.println("�޸��ϴ�.(gas�ܷ� : " + gas + ")" );
				gas--;
			}
			else {
				System.out.println("����ϴ�. (gas�ܷ� : " + gas + ")");
				return; // �Լ� Ż��(�޼ҵ� ����)
			}
		} // while e
	}

} // c e
