package Day15;

import java.time.LocalDate;
import java.time.LocalTime;

public class Car {
	//�ʵ�
	private LocalDate date;
	private String carNum;
	private LocalTime enterTime;
	private LocalTime outTime;
	private int money;
	
	//������
		//�������
	public Car() {}
		//Ǯ������
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public LocalTime getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(LocalTime enterTime) {
		this.enterTime = enterTime;
	}

	public LocalTime getOutTime() {
		return outTime;
	}

	public void setOutTime(LocalTime outTime) {
		this.outTime = outTime;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
