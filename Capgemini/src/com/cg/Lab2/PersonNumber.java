package com.cg.Lab2;

import java.util.Scanner;

public class PersonNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. to be checked : ");
		int number=scan.nextInt();
		if(number>=0) {
			System.out.println("The no. is positive");
		}
		else {
			System.out.println("The no. is negative");
		}
	}

}
