package myfirst;

public class User {
		int userId;
		String userName;
		float userSalary;
		public User()//default constructor
		{
			userId=98898;
			userSalary=34000;
			userName="Atul Singh";
		}
		
		public void userInfo()
		{
			System.out.println("user information");
			System.out.println("\tuser id "+userId);
			System.out.println("\tuser name "+userName);
			System.out.println("\tuser salary"+userSalary);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1=new User();
		User user2=new User();
		
		
		
		System.out.println("user id "+user1.userId);
		System.out.println("user name "+user1.userName);
		System.out.println("user Salry "+user1.userSalary);
		
		user2.userId=87788;
		user2.userName="Aman kumar";
		user2.userSalary=20000;
		user1.userInfo();
		user2.userInfo();

	}

}
