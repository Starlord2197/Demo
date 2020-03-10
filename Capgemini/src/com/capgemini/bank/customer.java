package com.capgemini.bank;

public class customer {
	
	private String custName;
	private int accNo;
	private double balance;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	@Override
	public String toString() {
		return "customer [custName=" + custName + ", accNo=" + accNo + ", balance=" + balance + "]";
	}
	public void deposit(int amount) {
		this.balance = this.balance+ amount;
	}
	
	public boolean withdraw(int amount) {
		
		if(this.balance>amount)
		{
			this.balance= this.balance- amount;
			return true;
		}
		else 
		{
			return false;
		}
	}
}