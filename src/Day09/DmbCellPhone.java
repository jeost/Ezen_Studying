package Day09;

public class DmbCellPhone extends CellPhone { // c s
	//서브클래스로 슈퍼클래스 선택
	//필드
	int channel;
	//생성자
	DmbCellPhone(String model, String color, int channal) {
		this.model = model;
		this.color = color;
		// 현재 클래스에 없는 필드라서 슈퍼클래스 내 멤버를 호출
		this.channel = channel;
	}
	//메소드
	void turnOnDmb() {
		System.out.println(" 채널 : " +channel+ "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	void turnOffDMb() {
		System.out.println(" DMB 방송 수신을 멈춥니다.");
	}
} // c e
