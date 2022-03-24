package Day17;

public class Day17_1 {

	public static void main(String[] args) {
		Box<String> box1= new Box<String>();
		box1.set("엄");
		String str = box1.get();
		
		Box<Integer> box2 = new Box<>();
		box2.set(6);
		int value = box2.get();
		
		
		Product<Tv, String> product1 = new Product<>();
		
		product1.setKind(new Tv());
		product1.setModel("스마트tv");
		
		Tv tv = product1.getKind();
		String tvmodel = product1.getModel(); // 형변환 필요없음
		
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		Car car = product2.getKind();
		String carmodel = product2.getModel();
		
		Product<Integer , Double >product3 = new Product<>();
	}
}
