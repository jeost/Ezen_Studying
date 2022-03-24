package Day07;

public class Car { // c s
	//클래스 선언

	// 1. 필드
	int gas; // 깨스 변수 저장
	
	// 2. 생성자
		//생성자 없어서 기본생성자
	
	// 3. 메소드
	void setGas(int gas) { // 인수o 반환x 
		// gas를 외부에서 받음
		this.gas = gas;	// 내부 gas에 저장
	} // this.필드명 : 내부(현클래스파일)변수
	boolean isLeftGas() { // 논리반환 메소드명()
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}	
		else {
			System.out.println("gas가 있습니다.");
			return true; // 내부변수에 gas가 0이 아니면 true 반환
			
		}
	}// boolean e
		// gas가 0일때까지 실행하며 가스 1씩 -- 메소드
		// gas가 0이면 함수 종료
	void run() { // 인수x 반환x 
		while(true) { // while s
			if(gas>0) {
				System.out.println("달립니다.(gas잔량 : " + gas + ")" );
				gas--;
			}
			else {
				System.out.println("멈춥니다. (gas잔량 : " + gas + ")");
				return; // 함수 탈출(메소드 종료)
			}
		} // while e
	}

} // c e
