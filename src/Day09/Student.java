package Day09;

public class Student extends People{ // ����Ŭ������ extends ����Ŭ������
	//�ʵ�
	public int studentNo; // �л� ��ȣ
	//������
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	//�޼ҵ�
}