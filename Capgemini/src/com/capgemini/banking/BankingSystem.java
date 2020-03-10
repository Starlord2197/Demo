package com.capgemini.banking;

public class BankingSystem {
	
	private String cName;
	private int accNo;
	private String accType;
	private double balance;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		this.balance = this.balance+amount;
	}
	
	public boolean withdraw(int amount) {
		if (this.balance>amount)
		{
			this.balance=this.balance- amount;
			return true;
		}
		else {
			return false;
		}
	}
	

}
