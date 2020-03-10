package com.capgemini.employee;

public class Utilities {
	public static boolean nameValidate(String name) {
		String pattern = "[A-Za-z]{3,10}";
		if(name.matches(pattern)) return true;
		return false;
	}
	public static boolean accountNumberValidate(String customerID) {
		String pattern = "[0-9]{3,10}";
		if(customerID.matches(pattern)) return true;
		return false;
	}
	public static boolean amountValidate(String Amount) {
		//String pattern = "[1]{0,1}[0-9]{4,5}";
		String pattern = "[0-9]{0,6}";
		if(Amount.matches(pattern)) return true;
		return false;
	}
	public static boolean amountValidate(int Amount) {
		if(Amount >= 1000 && Amount <= 100000) return true;
		return false;
	}
	public static boolean optionValidate(String option) {
		String pattern = "[1-4]{1}";
		if(option.matches(pattern)) return true;
		return false;
	}
	public static boolean noOfCustomerValidate(String n) {
		String pattern = "[0-9]{1,2}";
		if(n.matches(pattern)) return true;
		return false;
	}
}
