package com.cg.Lab2;

import java.util.Scanner;

enum Gender {
	M,F;
}
public class PersonDetailsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the First Name");
		String firstName = scr.next();
		System.out.println("Enter the Last Name");
		String lastName = scr.next();
		System.out.println("Enter the Gender");
		String Gender = scr.next();
	
		if(Gender.equals("M") || Gender.equals("F")) {
		
		PersonDetails p =new PersonDetails();
		p.setFirstName(firstName);
		p.setLastName(lastName);
		p.setGender(Gender);
	
		
		System.out.println(p);
		
	}
		
		else
			System.out.println("Please enter correct Gender");
		

	}

}
