package dto;

public class RoomLive {

	private int livenum;
	private int ronum;
	private String mId;
	public RoomLive(int livenum, int ronum, String mId) {
		super();
		this.livenum = livenum;
		this.ronum = ronum;
		this.mId = mId;
	}
	public RoomLive() {}
	public int getLivenum() {
		return livenum;
	}
	public void setLivenum(int livenum) {
		this.livenum = livenum;
	}
	public int getRonum() {
		return ronum;
	}
	public void setRonum(int ronum) {
		this.ronum = ronum;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	
}
