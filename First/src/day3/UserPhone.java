package day3;

public abstract class UserPhone {
	private int phoneid;
	private String phoneModel;
	private float phoneCost;
	public UserPhone(int phoneid, String phoneModel, float phoneCost) {
		super();
		this.phoneid = phoneid;
		this.phoneModel = phoneModel;
		this.phoneCost = phoneCost;
	}
	public int getPhoneid() {
		return phoneid;
	}
	public String getPhoneModel() {
		return phoneModel;
	}
	public float getPhoneCost() {
		return phoneCost;
	}
	
	public  abstract void userPhoneInfo();

}
