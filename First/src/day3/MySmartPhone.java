package day3;

public class MySmartPhone extends UserPhone implements Phone,BasicMobilePhone,SmartPhone{
	private String country;

	public String getCountry() {
		return country;
	}

	public MySmartPhone(int phoneid, String phoneModel, float phoneCost, String country) {
		super(phoneid, phoneModel, phoneCost);
		this.country = country;
	}

	@Override
	public void playVideo() {
		System.out.println("My smart phone plays video.");
	}

	@Override
	public void internetSurfing() {
		System.out.println("My smart Phone has internet surfing.");
	}

	@Override
	public void internetGaming() {
		System.out.println("My smart phone has internet gaming.");
	}

	@Override
	public void internetBanking() {
		System.out.println("My smart phone has internet banking.");
	}

	@Override
	public void videoCall() {
		System.out.println("My smart phone can perform video call.");
	}

	@Override
	public void message() {
		System.out.println("messaging facility");
	}

	@Override
	public void call() {
		System.out.println("Calling facilities");
	}

	@Override
	public void userPhoneInfo() {
		System.out.println("My smart Phone info:");
		System.out.println("Id:"+getPhoneid());
		System.out.println("Model:"+getPhoneModel());
		System.out.println("Cost:"+getPhoneCost());
		System.out.println("OS:"+os);
		
	}
	public static void main(String args[])
	{
		MySmartPhone msp=new MySmartPhone(766776,"samsung",2000,"India");
		msp.userPhoneInfo();
		
		System.out.println("Features in my phone are:");
		msp.call();
		msp.message();
		msp.internetGaming();
		msp.internetSurfing();
		msp.internetBanking();
		msp.videoCall();
		msp.playVideo();
		
	}
	
	
}
