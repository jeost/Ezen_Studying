package Day11;

public class Day11_1 {
	// p. 386 Ȯ�ι���
		private static void printSound(Soundable soundable) {
							//�޼ҵ�� 	//�μ�(����, �迭, ��ü, �������̽� �� ����)
			System.out.println(soundable.sound());
		}
		
		public static void dbWork(DataAccessObject dao) {
			dao.select();
			dao.insert();
			dao.update();
			dao.delete();
		}
		
		public static void main(String[] args) {
			printSound(new Cat());
			printSound(new Dog());
			
			dbWork(new OracleDAO());
			dbWork(new MysqlDao());
			
			
		// 5. �͸�ü [ �������̽��� ���� ���� ]
			Action action = new Action() {
				@Override
				public void work() {
					System.out.println("���縦 �մϴ�.");
				}
			};
		}
		Soundable[] soundable = new Cat[100]; // �迭�ε� �ֱ� ����
		
		
}
