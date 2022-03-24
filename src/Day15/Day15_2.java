package Day15;

public class Day15_2 {
	public static void main(String[] args) {
		//구현객체 만들기 : 구현한 메소드 재사용 가능
		GamePad pad1 = new Sound_Voltex();
	//인터페이스명 객체명 = new 구현한클래스명();
		
		
		//익명객체 만들기 : 여기서 구현한 메소드 재사용 불가
		GamePad pad2 = new GamePad() {
			
			@Override
			public void D버튼() {
				
			}
			
			@Override
			public void C버튼() {
				
			}
			
			@Override
			public void B버튼() {
				
			}
			
			@Override
			public void A버튼() {
				
			}
		};
		
		//인터페이스 내 구현객체 교체
		//게임교체
		pad1 = new Metal_slug();
		
		Game g1 = new Game();
		g1 = new Sound_Voltex();
		g1 = new Metal_slug();
		
	}
}
