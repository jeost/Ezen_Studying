package Day08;

public class class_����_���� { // c s
			// ȸ��Ŭ����
	// 1. �ʵ� [ private ���� ]
	private String id;
	private String pw;
	private String name;
	private String point;
	// 2. ������
		// [�ʵ� 0��] �������
	public class_����_����() {}
		// [�ʵ� 3��] Ư�� ������ [ȸ�����Խ� ��뿹��]
	public class_����_����(String id, String pw, String name) {}
		// [�ʵ� 4��] Ǯ������ [��� ȸ������ ȣ��� ��뿹��]
	public class_����_����(String id, String pw, String name, String point) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	
	// 3. �޼ҵ�
		// private �ʵ� ���� get or set �޼ҵ�
	
} // c e
