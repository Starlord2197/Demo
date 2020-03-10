package Lab2;

import java.util.Scanner;

enum gender {
	M,F;

	public static String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}

public class PersonDemo {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		System.out.println("enter First Name");
		String firstname= scr.next();
		System.out.println("enter Last Name");
		String lastName= scr.next();
		System.out.println("enter the Gender");
		String Gender= scr.next();
		System.out.println("enter the Age");
		int Age= scr.nextInt();
		System.out.println("enter the Phone Number");
		String phoneNumber= scr.next();
		
		if ((Gender.equals("M")) || (Gender.equals("F"))) {
			
			Person p = new Person();
			p.setFirstName(firstname);
			p.setLastName(lastName);
			p.setGender(gender.charAt(0));
			p.setAge(Age);
			p.setPhoneNumber(phoneNumber);
		}
		
		else
			System.out.println("please enter correct gender values");
		
		
		
	}

}
