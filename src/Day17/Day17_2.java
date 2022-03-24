package Day17;

public class Day17_2 {

	public static void main(String[] args) {
		
		Box<Integer> box1 = new Box<>();
		
		box1 = Util.<Integer>boxing(100);
		//확인
		System.out.println(box1.get());
		
		Pair<Integer , String > p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer , String > p2 = new Pair<Integer, String>(1, "사과");
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		
		if(result1) {
			System.out.println("동등한 객체");
		}else {
			System.out.println("동등하지 않은 객체");
		}
	}
}
