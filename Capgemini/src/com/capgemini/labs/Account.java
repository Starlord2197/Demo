package com.capgemini.labs;

public abstract class Account {
	
	private static long accNo=10000;
	private double ballance;
	private Person accHolder;
	public abstract boolean withdraw(double amount);
	Account() {
		accNo++;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ballance=" + ballance + ", accHolder=" + accHolder + "]";
	}
	public static long getAccNo() {
		return accNo;
	}
	public static void setAccNo(long accNo) {
		Account.accNo = accNo;
	}
	public double getBallance() {
		return ballance;
	}
	public void setBallance(double ballance) {
		this.ballance = ballance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void Deposit(double amount) {
		ballance = this.ballance+amount;
	}
	
	

}
