package Day09;

public class Day09_4 {

	public static void main(String[] args) {
		// p.296~297
		int r=10;
		// ����Ŭ������ ��ü ����
		Calculator calculator = new Calculator();
		// ����Ŭ������ ���� ��ü�� �޼ҵ带 ȣ��
		System.out.println(" �� ���� : " + calculator.areaCircle(r));
		System.out.println();
		
		// ����Ŭ������ ��ü ����
		Computer computer = new Computer();
		System.out.println(" �� ���� : " + computer.areaCircle(r));
	}
}