package com.capgemini.employee;

public class Customer {
	private int customerid, Amount;
	private String firstName, lastName;
	public int getCustomerId() {
		return customerid;
	}
	public void setCustomerId(int customerid) {
		this.customerid = customerid;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCustomerName() {
		return this.firstName + " " + this.lastName;
	}
	public void setAmount(int Amount) {
		this.Amount = Amount;
	}
	public int getAmount() {
		return Amount;
	}
	public void depositAmount(int depositAmount) {
		setAmount(Amount + depositAmount);
	}
	public boolean withDrawAmount(int withDrawAmount) {
		if(getAmount() - withDrawAmount > 0) {
			setAmount(Amount - withDrawAmount);
			return true;
		}
		else return false;
	}
}
