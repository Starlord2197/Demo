package com.capgemini.labs;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
//		System.out.println("enter for kathy");
//		System.out.println("enter name");
//		String name = scr.next();
//		
//		System.out.println("enter age");
//		String age = scr.next();
//		
//		Person p = new Person();
//		p.setFirstName(name);
//		p.setAge(Integer.parseInt(age));
//		
//		
//		System.out.println("enter balance");
//		String ballance = scr.next();
//		
//		Account act = new Saving();
//		Account.setAccNo(Account.getAccNo());
//		act.setBallance(Double.parseDouble(ballance));
//		act.setAccHolder(p);
		
		System.out.println("enter for Smith");
		System.out.println("enter name");
		String name1 = scr.next();
		
		System.out.println("enter age");
		String age1 = scr.next();
		
		Person p1 = new Person();
		p1.setFirstName(name1);
		p1.setAge(Integer.parseInt(age1));
		
		System.out.println("enter balance");
		String ballance1 = scr.next();
		
		Account act1 = new Saving();
		Account.setAccNo(Account.getAccNo());
		act1.setBallance(Double.parseDouble(ballance1));
		act1.setAccHolder(p1);
		
		System.out.println("enter Withdraw amount");
		String wamount= scr.next();
		
		boolean test=act1.withdraw(Double.parseDouble(wamount));
		if(!test)
			System.out.println("Transaction failed.");
		System.out.println("You Balance is "+act1.getBallance());
//		System.out.println(act);
		System.out.println(act1);
	}

}
