package Day09;

public class Student extends People{ // 서브클래스명 extends 슈퍼클래스명
	//필드
	public int studentNo; // 학생 번호
	//생성자
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	//메소드
}