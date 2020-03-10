package com.capgemini.employee;

import java.util.Scanner;

public class BankDemo {
	private static final String NULL = null;

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String n;
		while(true) {
			System.out.println("No. of customer: ");
			n = scr.next();
			boolean flag = Utilities.noOfCustomerValidate(n);
			if(!flag) System.out.println("Range(0, 99)");
			else break;
		}
		Customer[] c = new Customer[Integer.parseInt(n)];
		String customer_Id, firstName, lastName, Amount, cusID = null;
		for(int i = 0; i < c.length; i++) {
			while(true) {
				System.out.println("Customer ID");
				customer_Id = scr.next();
				boolean flag = Utilities.accountNumberValidate(customer_Id);
				if(!flag) System.out.println("Only numbers are allowed");
				else break;
			}
			while(true) {
				System.out.println("First Name");
				firstName = scr.next();
				boolean flag = Utilities.nameValidate(firstName);
				if(!flag) System.out.println("Only alphabets are allowed");
				else break;
			}
			while(true) {
				System.out.println("Last Name");
				lastName = scr.next();
				boolean flag = Utilities.nameValidate(lastName);
				if(!flag) System.out.println("Only alphabets are allowed");
				else break;
			}
			while(true) {
				System.out.println("Amount:");
				Amount = scr.next();
				boolean flag = Utilities.amountValidate(Amount);
				if(!flag) System.out.println("Only numbers are allowed");
				else if(!Utilities.amountValidate(Integer.parseInt(Amount))) System.out.println("Range(1000 - 100000)");
				else break;
			}
			Customer cNew = new Customer();
			cNew.setCustomerId(Integer.parseInt(customer_Id));
			cNew.setFirstName(firstName);
			cNew.setLastName(lastName);
			cNew.setAmount(Integer.parseInt(Amount));
			c[i] = cNew;
		}
		while(true) {
		while(true) {
			System.out.println("Welcome! \nEnter Customer ID:");
			cusID = scr.next();
			boolean flag = Utilities.accountNumberValidate(cusID);
			if(!flag) System.out.println("Only numbers are allowed");
			else break;
		}
		boolean exist = false;
		for(Customer customer: c) {
			if(Integer.parseInt(cusID) == customer.getCustomerId()){
				exist = true;
				System.out.println("Please select from the options available:");
				while(true) {
					String option;
					while(true) {
						System.out.println(" 1. Check Balance \n 2. Deposit \n 3. Withdraw \n 4. Exit\n");
						option = scr.next();
						boolean flag = Utilities.optionValidate(option);
						if(!flag) System.out.println("Only numbers are allowed");
						else break;
					}	
					switch(Integer.parseInt(option)) {
					case 1: System.out.println(customer.getAmount());
							break;
					case 2: 
							String dAmount;
							while(true) {
							System.out.println("Deposit Amount (if not enter 0): ");
							dAmount = scr.next();
							boolean flag = Utilities.amountValidate(dAmount);
							if(!flag) System.out.println("Only numbers are allowed");
							else if(!Utilities.amountValidate(Integer.parseInt(dAmount))) System.out.println("Range(1000 - 100000)");
							else break;
							}	
							customer.depositAmount(Integer.parseInt(dAmount));
							break;
					case 3:
							String wAmount;
							while(true) {
							System.out.println("Withdraw Amount (if not enter 0): ");
							wAmount = scr.next();
							boolean flag = Utilities.amountValidate(wAmount);
							if(!flag) System.out.println("Only numbers are allowed");
							else if(!Utilities.amountValidate(Integer.parseInt(wAmount))) System.out.println("Range(1000 - 100000)");
							else break;
							}
							if(customer.withDrawAmount(Integer.parseInt(wAmount)) == false) 
								System.out.println("Balance Insufficient");
							break;
					case 4: System.exit(1);
					default: System.out.println("Please select the appropriate option :( ");
					}
				}
			}
		}
		if(!exist) System.out.println("Customer not found");
		else break;
	}
	}
}
