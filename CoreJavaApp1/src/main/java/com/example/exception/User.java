package com.example.exception;

public class User {
	private int userId;
	private String userName;
	private float userSalary;
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public float getUserSalary() {
		return userSalary;
	}
	public void setUserId(int userId) throws UserException {
		if(userId<=0)
		{
			throw new UserException("invalid UserId");
		}
		else if(userId<5000 || userId>10000)
		{
			throw new UserException("Invalid userId range");
		}
		this.userId = userId;
	}
	public void setUserName(String userName) throws UserException {
		if(userName.isBlank())
			throw new UserException("Empty or blank user name");
		this.userName = userName;
	}
	public void setUserSalary(float userSalary) throws UserException {
		if(userSalary<=0)
			throw new UserException("User salary can't be zero");
		this.userSalary = userSalary;
	}
	

}
