package Day17;

public class Day17_2 {

	public static void main(String[] args) {
		
		Box<Integer> box1 = new Box<>();
		
		box1 = Util.<Integer>boxing(100);
		//Ȯ��
		System.out.println(box1.get());
		
		Pair<Integer , String > p1 = new Pair<Integer, String>(1, "���");
		Pair<Integer , String > p2 = new Pair<Integer, String>(1, "���");
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		
		if(result1) {
			System.out.println("������ ��ü");
		}else {
			System.out.println("�������� ���� ��ü");
		}
	}
}
