package Day15;

public class 학생 extends 사람{
	String 이름;
	
	public 학생(String 이름) {
		super(이름);
	}
	@Override
	public void 이름호출() {
		System.out.println("자식클래스");
		System.out.println( this.이름 );
		System.out.println( super.이름 );
	}
}
