package Day09;

public class Bank { // c s

	//�ʵ�
	private String bankbookN;	//���¹�ȣ(�ߺ�x ���νĺ���)
	private String pw;	//��й�ȣ
	private String bankbookO;	//��������
	private int bMoney;	//���ݾ�
	
	//������
		//�������
	public Bank() {}
		//����ʵ� ������
	
	//�޼ҵ�
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
	

		//���»���
		//�Ա�
		//���
		//��ü
		//�����¸��
		//����
} // c e
