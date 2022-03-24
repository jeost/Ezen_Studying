package Day08;

public class class_설계_예제 { // c s
			// 회원클래스
	// 1. 필드 [ private 권장 ]
	private String id;
	private String pw;
	private String name;
	private String point;
	// 2. 생성자
		// [필드 0개] 빈생성자
	public class_설계_예제() {}
		// [필드 3개] 특정 생성자 [회원가입시 사용예정]
	public class_설계_예제(String id, String pw, String name) {}
		// [필드 4개] 풀생성자 [모든 회원정보 호출시 사용예정]
	public class_설계_예제(String id, String pw, String name, String point) {
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
	
	// 3. 메소드
		// private 필드 사용시 get or set 메소드
	
} // c e
