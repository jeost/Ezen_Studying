package Day09;

public class Day09_2 { // c s
	public static void main(String[] args) { // m s
	
		// p.290 ~ 292 예제
		// 1. 서브클래스로 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		// 2. 서브클래스로 객체 생성
		System.out.println(" 모델 : " + dmbCellPhone.model);
		System.out.println(" 색상 : " + dmbCellPhone.color);
		
		// 3. 서브클래스로 만들어진 객체로 본인 멤버접근
		System.out.println(" 채널 : " + dmbCellPhone.channel);
		
		// 4. 서브클래스로 만들어진 객체로 슈퍼클래스 내 멤버[메소드] 접근
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.recieveVoice("안녕하세요");
		dmbCellPhone.sendVoice("반갑습니다");
		dmbCellPhone.hangUp();
		
		//메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDMb();
	} // m e
} // c e
