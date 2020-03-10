package com.capgemini.Customer;

import java.util.Scanner;

public class CustomerDemo {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Number of customer");
		String name,account_number,balance,damount,wamount;
		int count=scr.nextInt();

		Customer[] arrCustomer=new Customer[count];
		for(int index=0;index<arrCustomer.length;index++) {
			while(true) {
			System.out.println("ENTER Customer name");
			name=scr.next();
			boolean nameFlag=Utilities.nameValidation(name);
			if(!nameFlag)
				System.out.println("Plz enter in alphabets only");
			else	
			break;
			}
			while(true) {
			System.out.println("ENTER Customer Account Number");
			account_number=scr.next();
			boolean nameFlag=Utilities.accountValidation(account_number);
			if(!nameFlag)
				System.out.println("Plz enter in numbers only");
			else	
			break;
			}
			while(true) {
			System.out.println("ENTER Customer Balance");
			balance=scr.next();
			boolean nameFlag=Utilities.accountValidation(balance);
			if(!nameFlag)
				System.out.println("Plz enter in numbers only");
			else	
				break;
			}
			
			
			Customer c1=new Customer();
			c1.setCustName(name);
			c1.setAccNo(Integer.parseInt(account_number));
			c1.setBalance(Integer.parseInt(balance));
			arrCustomer[index]=c1;
		}
		
		System.out.println("ENTER the Account Number to be searched for");
		long accno2=scr.nextLong();
		boolean checkacc=false;
		for(Customer c1:arrCustomer) {
			if (accno2==c1.getAccNo()) {
				checkacc=true;
				while (true) {
					System.out.println("Choose 1 for see Balance\nChoose 2 for Deposit Money\nChoose 3 for Withdraw Money\n Choose 4 for exit");
					int option=scr.nextInt();

					switch(option) {
					case 1:
						System.out.println("Your Balance is");
						System.out.println(c1.getBalance());
						break;
					case 2:
						while(true) {
							System.out.println("Enter amount to deposit");
							damount=scr.next();
							boolean nameFlag=Utilities.depositValidation(damount);
							if(!nameFlag)
								System.out.println("Plz enter in numbers only");
							else
								c1.Deposit(Integer.parseInt(damount));
								break;
							}
						break;
					case 3:
						System.out.println("Enter amount to Withdraw");
						wamount=scr.next();
						boolean check=c1.Withdraw(Integer.parseInt(wamount));
						if(check==true) {
							
						}
						else {
							System.out.println("Balance is low");
						}
							
						break;
					case 4:
						System.exit(1);
					default:
						System.out.println("Enter Appropiate Option");
						
					}
					
				}
			
			}
		}
		if (checkacc==false) {
			System.out.println("Enter Correct account number");
		}
		
	}
		

}

