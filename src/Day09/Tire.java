package Day09;
//���� Ŭ������ ���
public class Tire { // c s
	//�ʵ�
	public int maxRotation; // �ִ� ȸ����
	public int accumulatedRotation; // ���� ȸ����
	public String location; // Ÿ�̾��� ��ġ
	
	//������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//�޼ҵ�
	public boolean roll() { // Ÿ�̾� ȸ�� �޼ҵ� ����
		++accumulatedRotation; // ���� ȸ���� 1 ����
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Tire ���� : " + (maxRotation-accumulatedRotation)+"ȸ");
			return true; // ����ȸ��
		}else {
			System.out.println("***" + location+ " Tire ��ũ ***");
			return false; // ��ũ
		}
	}
} // c e
