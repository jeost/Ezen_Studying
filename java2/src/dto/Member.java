package dto;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Member {

	private int mNum; // ȸ����ȣ
	private String mId; // ȸ�����̵�
	private String mPw; // ȸ����й�ȣ
	private String mEMail; // �̸���
	private String mAddress; // �ּ�
	private int mPoint;
	private String mSince; // ������
	private String mLdate;
	public Member() {}
	public Member(int mNum, String mId, String mPw, String mEMail, String mAddress, int mPoint, String mSince, String mLdate) {
		super();
		this.mNum = mNum;
		this.mId = mId;
		this.mPw = mPw;
		this.mEMail = mEMail;
		this.mAddress = mAddress;
		this.mPoint = mPoint;
		this.mSince = mSince;
		this.mLdate = mLdate;
	}
	
	public static void sendMail(String �޴¸���, String ����) {
		//������ ����
		String �����¸��� = "cys74072@naver.com";
		String �����¸��Ϻ�� = "��й�ȣ �ֱ�";
		
		//ȣ��Ʈ ����
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.naver.com"); // ȣ��Ʈ �ּ�
		properties.put("mail.smtp.port", 587); // ȣ��Ʈ ��Ʈ ��ȣ
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
		//����ó��
			//Session.getDefaultInstance(������ü, ������ü)
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(�����¸���, �����¸��Ϻ��);
			}
		});
		
		//���� ������
		try {
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(�����¸���));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(�޴¸���));
		
		//����
		message.setSubject("���ã�� ���� �׽�Ʈ");
		message.setText("��й�ȣ : "+����);
		
		//����
		Transport.send(message);
		}catch(Exception e) {System.out.println(e);}
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
	public String getmLdate() {
		return mLdate;
	}
	public void setmLdate(String mLdate) {
		this.mLdate = mLdate;
	}
	
}
