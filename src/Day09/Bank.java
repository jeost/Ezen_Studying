package Day09;

public class Bank { // c s

	//필드
	private String bankbookN;	//계좌번호(중복x 본인식별용)
	private String pw;	//비밀번호
	private String bankbookO;	//계좌주인
	private int bMoney;	//예금액
	
	//생성자
		//빈생성자
	public Bank() {}
		//모든필드 생성자
	
	//메소드
	public Bank(String bankbookN, String pw, String bankbookO, int bMoney) {
		this.bankbookN = bankbookN;
		this.pw = pw;
		this.bankbookO = bankbookO;
		this.bMoney = bMoney;
	}

	public String getBankbookN() {
		return bankbookN;
	}

	public void setBankbookN(String bankbookN) {
		this.bankbookN = bankbookN;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getBankbookO() {
		return bankbookO;
	}

	public void setBankbookO(String bankbookO) {
		this.bankbookO = bankbookO;
	}

	public int getbMoney() {
		return bMoney;
	}

	public void setbMoney(int bMoney) {
		this.bMoney = bMoney;
	}
	

		//계좌생성
		//입금
		//출금
		//이체
		//내계좌목록
		//대출
} // c e
