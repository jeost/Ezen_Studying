package Day10;

public interface GamePad {
	// ���
		//��� �ʵ�
		//�߻�޼ҵ�
	public void A��ư();
	public void B��ư();
	public void C��ư();
		//����Ʈ�޼ҵ�
	default void GamePadEnd() {
		System.out.println("�����е� ����.");
	}
		//�����޼ҵ�
	static void Charge() {
		System.out.println("�����е� ����");
	}
}
