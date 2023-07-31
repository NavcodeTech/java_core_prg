package day6;

public class User implements Comparable<User>{
	private int useriD;
	private String usertName;
	private float userSalary;
	
	@Override
	public int compareTo(User u) {
		if(u.getUseriD()<this.getUseriD())
			return 1;
		else if(u.getUseriD()>this.getUseriD())
			return -1;
		else
		return 0;
	}
	@Override
	public String toString() {
		return "User [useriD=" + useriD + ", usertName=" + usertName + ", userSalary=" + userSalary + "]";
	}
	public User(int useriD, String usertName, float userSalary) {
		super();
		this.useriD = useriD;
		this.usertName = usertName;
		this.userSalary = userSalary;
	}
	public int getUseriD() {
		return useriD;
	}
	public String getUsertName() {
		return usertName;
	}
	public float getUserSalary() {
		return userSalary;
	}
	
	
}
