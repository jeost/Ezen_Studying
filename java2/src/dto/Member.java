package dto;

public class Member {

	private int mNum; // ȸ����ȣ
	private String mId; // ȸ�����̵�
	private String mPw; // ȸ����й�ȣ
	private String mEMail; // �̸���
	private String mAddress; // �ּ�
	private int mPoint;
	private String mSince; // ������
	public Member() {}
	public Member(int mNum, String mId, String mPw, String mEMail, String mAddress, int mPoint, String mSince) {
		super();
		this.mNum = mNum;
		this.mId = mId;
		this.mPw = mPw;
		this.mEMail = mEMail;
		this.mAddress = mAddress;
		this.mPoint = mPoint;
		this.mSince = mSince;
	}
	public int getmNum() {
		return mNum;
	}
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPw() {
		return mPw;
	}
	public void setmPw(String mPw) {
		this.mPw = mPw;
	}
	public String getmEMail() {
		return mEMail;
	}
	public void setmEMail(String mEMail) {
		this.mEMail = mEMail;
	}
	public String getmAddress() {
		return mAddress;
	}
	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}
	public int getmPoint() {
		return mPoint;
	}
	public void setmPoint(int mPoint) {
		this.mPoint = mPoint;
	}
	public String getmSince() {
		return mSince;
	}
	public void setmSince(String mSince) {
		this.mSince = mSince;
	}
	
}
