package Day08;

public class Day08_4 { // c s

	// p. 267~268 : Setter , Getter �޼ҵ�
		
	public static void main(String[] args) { // m s
		
		Car myCar = new Car();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		System.out.println("���� �ӵ� : "+ myCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		//����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		} 
		System.out.println("���� �ӵ� : "+ myCar.getSpeed());
	} // m e
} // c e
