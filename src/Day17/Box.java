package Day17;

public class Box<T> {
			//제네릭 타입. 이름은 아무거나 넣어도 된다.
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
}
