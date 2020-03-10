package Collections;

import java.util.Scanner;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Collection> l1 =new ArrayList<Collection>();
		Scanner scr = new Scanner(System.in);
		
		while(true) {
			System.out.println("please Enter 1 to add new customer"
		+ "\n Enter 2 to display all customers"
		+	"\n Enter 3 to exit");
			
			int option = scr.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter Name");
				String name=scr.next();
				System.out.println("Enter Amount");
				String amount=scr.next();
				System.out.println("Account Type");
				String type=scr.next();
				Collection c1=new Collection();
				c1.setName(name);
				l1.add(c1);
				c1.setAmount(Double.parseDouble(amount));
				l1.add(c1);
				c1.setType(type);
				l1.add(c1);
				
				break;
			case 2: 
				System.out.println(l1);
				break;
			case 3:
				System.exit(1);
			default:
				System.out.println("please enter Correct option");
			}
		}

	}

}
