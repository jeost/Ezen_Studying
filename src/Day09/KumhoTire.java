package Day09;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); // ����Ŭ���� �� ������ ȣ��[�ڵ� ���̱�]
	}
	//�޼ҵ�
	@Override
	public boolean roll() { // Ÿ�̾� ȸ�� �޼ҵ� ����
		++accumulatedRotation; // ���� ȸ���� 1 ����
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "KumhoTire ���� : " + (maxRotation-accumulatedRotation)+"ȸ");
			return true; // ����ȸ��
		}else {
			System.out.println("***" + location+ " KumhoTire ��ũ ***");
			return false; // ��ũ
		}
	}
} // c e