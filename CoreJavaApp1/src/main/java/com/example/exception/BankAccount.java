package com.example.exception;

public class BankAccount {
	int accNo;
	String custName;
	String accType;
	float balance;
	
	public BankAccount(int accNo, String custName, String accType, float balance) throws InsufficientFundsException {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		
		if(accType.equals("Savings") && balance<1000)
		{
			throw new InsufficientFundsException("insufficent funds in your savings account");
		}
		else if(accType.equals("Current") && balance<5000)
		{
			throw new InsufficientFundsException("insufficent funds in your currennt account");
		}
		else if(balance<=0)
			throw new InsufficientFundsException("Deposit amount should be greater than Zero.");
		else
		this.balance = balance;
	}
	
	
	public int getAccNo() {
		return accNo;
	}


	public String getCustName() {
		return custName;
	}


	public String getAccType() {
		return accType;
	}


	void deposit(float amount) throws NegativeAmountException
	{
		if(amount<=0)
			throw new NegativeAmountException("negative amount");
		else
			balance=balance+amount;
	}
	void withdraw(float amount) throws InsufficientFundsException, NegativeAmountException, LowBalanceException
	{
		if(amount<=0)
		{
			throw new NegativeAmountException("negative amount");
		}
		else if(amount>balance)
		{
			throw new InsufficientFundsException("Insufficient funds");
		}
		else if(accType.equals("Savings") && (balance-amount)<1000)
		{
			throw new LowBalanceException("insufficent funds in your savings account");
		}
		else if(accType.equals("Current") && (balance-amount)<5000)
		{
			throw new LowBalanceException("insufficent funds in your currennt account");
		}
		else
			balance=balance-amount;
	}
	float getBalance() throws  LowBalanceException
	{
		 if(accType.equals("Savings") && balance<1000)
		{
			throw new LowBalanceException("insufficent funds in your savings account");
		}
		else if(accType.equals("Current") && balance<5000)
		{
			throw new LowBalanceException("insufficent funds in your current account");
		}
		else
			return balance;
	}
	public void display_details()
	{
		 System.out.println("Bank Details:");
		 System.out.println("Customer's AccNo :"+accNo);
		 System.out.println("Customer's Name :"+custName);
		 System.out.println("Customer's AccType :"+accType);
		 System.out.println("Customer's Balance :"+balance);
	}
}
