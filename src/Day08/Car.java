package Day08;

public class Car { // c s

	//�ʵ�
	private int speed;
	private boolean stop;
	//������ ����
	
	//�޼ҵ�
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) { // sS s
		if(speed<0) {
			this.speed=0;
			return;
		}else {
			this.speed=speed;
		}
	} // sS e
	
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
} // c e
