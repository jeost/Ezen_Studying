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

	private int mNum; // 회원번호
	private String mId; // 회원아이디
	private String mPw; // 회원비밀번호
	private String mEMail; // 이메일
	private String mAddress; // 주소
	private int mPoint;
	private String mSince; // 가입일
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
	
	public static void sendMail(String 받는메일, String 내용) {
		//보내는 정보
		String 보내는메일 = "cys74072@naver.com";
		String 보내는메일비번 = "비밀번호 넣기";
		
		//호스트 설정
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.naver.com"); // 호스트 주소
		properties.put("mail.smtp.port", 587); // 호스트 포트 번호
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
		//인증처리
			//Session.getDefaultInstance(설정객체, 인증객체)
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(보내는메일, 보내는메일비번);
			}
		});
		
		//메일 보내기
		try {
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(보내는메일));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(받는메일));
		
		//내용
		message.setSubject("비번찾기 제목 테스트");
		message.setText("비밀번호 : "+내용);
		
		//전송
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
