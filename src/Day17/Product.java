package Day17;

public class Product<T, M> {

	// ÇÊµå
	private T kind;
	private M model;
	
	public static <d> Box<d> boxing(d kind){
		Box<d> box = new Box<>();
		box.set(kind);
		return box;
	}
	//get, set
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}
