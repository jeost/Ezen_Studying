package Day09;

public class HankookTire extends Tire { // c s
	//�ʵ�
	//������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//�޼ҵ�
	@Override // ����Ŭ���� �� �޼ҵ� ������
	public boolean roll() { // Ÿ�̾� ȸ�� �޼ҵ� ����
		++accumulatedRotation; // ���� ȸ���� 1 ����
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "HankookTire ���� : " + (maxRotation-accumulatedRotation)+"ȸ");
			return true; // ����ȸ��
		}else {
			System.out.println("***" + location+ " HankookTire ��ũ ***");
			return false; // ��ũ
		}
	}
} // c e
