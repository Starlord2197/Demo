package com.capgemini.banking;

import java.util.Scanner;

public class BankingSystemdemo {
	
	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50};
		
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
		for(int value:arr) {
			System.out.println(value);
		}
		
		 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		    System.out.println(cars[0]);
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("how many customers you want to add");
		int count = scr.nextInt();
		
		BankingSystem[] arrCustomer = new BankingSystem[count];
		
		for(int index=0;index<arrCustomer.length;index++) {
			
			String name;
			
			
			System.out.println("please enter account no");
			int accNo = scr.nextInt();
			System.out.println("please enter the type");
			String type = scr.next();
			while (true) {
				System.out.println("please enter the name");
				name = scr.next();
			boolean nameFlag= Utilities.namevalidation(name);
			if(!nameFlag)
				System.out.println("please enter the name in alphabets only");
			else 
				break;
			}
			System.out.println("please enter the balance");
			double balance= scr.nextDouble();
			
			BankingSystem bank = new BankingSystem();
			bank.setcName(name);
			bank.setAccType(type);
			bank.setBalance(balance);
			arrCustomer[index]= bank;
		}
		
		System.out.println("Enter Account number to be checked");
		int accNo=scr.nextInt();
	
		boolean checkCustomer= false;
		for(BankingSystem bank: arrCustomer) {
			if(accNo == bank.getAccNo()) {
				
		while(true) 
		{
			System.out.println("please enter 1 to see the balance /n enter 2 to deposit /n enter 3 to withdraw and /n enter 4 to exit");
			int option = scr.nextInt();
			switch(option) {
			case 1:
				    System.out.println(bank.getBalance());
			        break;
			case 2:
				    System.out.println("please enter amount to deposit");
				    int Deposit = scr.nextInt();
				    bank.deposit(Deposit);
				    break;
				    
			case 3:
				System.out.println("please enter amount to withdrawl");
				int Withdraw = scr.nextInt();
				boolean check = bank.withdraw(Withdraw);
			    if(!check)
					System.out.println("insufficient balance");
				break;
			case 4:
				   System.exit(0);
				    
			}
			checkCustomer = true;

		}
			}
			
		
		}
		if(!checkCustomer)
			System.out.println("no customer found");
		
		}
		
		
	}

