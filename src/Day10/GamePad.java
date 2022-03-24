package Day10;

public interface GamePad {
	// 멤버
		//상수 필드
		//추상메소드
	public void A버튼();
	public void B버튼();
	public void C버튼();
		//디폴트메소드
	default void GamePadEnd() {
		System.out.println("게임패드 종료.");
	}
		//정적메소드
	static void Charge() {
		System.out.println("게임패드 충전");
	}
}
