package day3;

public interface Phone {
	void call();
	public static final String os="Android"; 
}
 interface BasicMobilePhone
 {
	 void call();
	 void message();
 }
 interface SmartPhone extends Phone,BasicMobilePhone
 {
	 void playVideo();
	 void internetSurfing();
	 void internetGaming();
	 void internetBanking();
	 void videoCall();
 }

