package com.pack.lab.work;

import java.util.*;
import java.util.Scanner;
import com.pack.lab.service.LabWorkImplementation;

public class LabWorkDemo {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		List<LabWork> lis =new ArrayList<LabWork>();	
		LabWorkImplementation imp = new LabWorkImplementation();
		while(true) {
			System.out.println("please enter : "+"\n"+"1. Add new Customer"+"\n"+"2. Diplay all details"+"\n"+"3. Search Name"+"\n"+"4. Search Name"+"\n"+"5. Exit");
			int option = src.nextInt();
			switch(option) {
			case 1 :System.out.println("Name : ");
			String name =src.next();
			System.out.println("age : ");
			String age =src.next();
			LabWork c1=new LabWork();

			c1.setAge(Integer.parseInt(age));
			c1.setName(name);
			imp.addLabWork(c1);
				break;
			case 2 :System.out.println(imp.DisplayLabWork());
				break;
			case 3 :System.out.println("Enter name to search");
		           	String search = src.next();
		           	boolean  ab=  imp.searchName(search) ;
	                   if(ab==true) {
	        	       System.out.println("Find");	
	                   }
	                   else 
	            	   System.out.println("Customer not exist");
			        break;
			case 4 :
				System.out.println("please enter the name");
				String name=scr.next();
				boolean delete=imp1.deleteCustomer(name);
				if(deleted)
					System.out.println("deleted");
				else
					System.out.println("you provide wrong name");
				break;
			case 5 :
				System.exit(0);
			default:
				System.out.println("Enter correct choice ");
			}
		}
	} 

}
