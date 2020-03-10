package com.capgemini.bank;

import java.util.Scanner;

public class customerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);		
		System.out.println("please enter the name");
		String name = scr.next();
		System.out.println("please enter the balance");
		double balance= scr.nextDouble();
		
		customer cst = new customer();
		cst.setCustName(name);
		cst.setBalance(balance);
		
		System.out.println("please enter 1 to see the balance /n enter 2 to deposit /n enter 3 to withdraw and /n enter 4 to exit");
		int option = scr.nextInt();
		switch(option) {
		case 1: cst.getBalance();
		        break;
		case 2:
			    System.out.println("please enter amount to deposit");
			    int amountDeposit = scr.nextInt();
			    cst.deposit(amountDeposit);
			    break;
			    
		case 3:
			System.out.println("please enter amount to withdrawl");
			int amountWithdraw = scr.nextInt();
			boolean check = cst.withdraw(amountWithdraw);
			break;
			
		case 4:
			   System.exit(1);
			
		default: 
			     System.out.println("please select appropiate option");
			
			    
		}
		

	}

}
