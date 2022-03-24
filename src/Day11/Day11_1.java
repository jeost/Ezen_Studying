package Day11;

public class Day11_1 {
	// p. 386 확인문제
		private static void printSound(Soundable soundable) {
							//메소드명 	//인수(변수, 배열, 객체, 인터페이스 다 가능)
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
			
			
		// 5. 익명객체 [ 인터페이스가 직접 구현 ]
			Action action = new Action() {
				@Override
				public void work() {
					System.out.println("복사를 합니다.");
				}
			};
		}
		Soundable[] soundable = new Cat[100]; // 배열로도 넣기 가능
		
		
}
