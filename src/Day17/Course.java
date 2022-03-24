package Day17;

public class Course<T> {

	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name=name;
		students = (T[]) (new Object[capacity]);
	}
	
	public String getName() {return name;}
	public T[] getStudents() {return students;}
	
}
