package Day15;

public class Day15_2 {
	public static void main(String[] args) {
		//������ü ����� : ������ �޼ҵ� ���� ����
		GamePad pad1 = new Sound_Voltex();
	//�������̽��� ��ü�� = new ������Ŭ������();
		
		
		//�͸�ü ����� : ���⼭ ������ �޼ҵ� ���� �Ұ�
		GamePad pad2 = new GamePad() {
			
			@Override
			public void D��ư() {
				
			}
			
			@Override
			public void C��ư() {
				
			}
			
			@Override
			public void B��ư() {
				
			}
			
			@Override
			public void A��ư() {
				
			}
		};
		
		//�������̽� �� ������ü ��ü
		//���ӱ�ü
		pad1 = new Metal_slug();
		
		Game g1 = new Game();
		g1 = new Sound_Voltex();
		g1 = new Metal_slug();
		
	}
}
