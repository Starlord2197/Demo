package com.cg.lab7;
import java.util.HashMap;
import java.util.Scanner;

import com.cg.lab7.Employee;

public class ProductDemo
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter id");
		String id = sc.next();
		System.out.println("enter salary");
		String salary = sc.next();
		System.out.println("enter designation");
		String designation = sc.next();
		System.out.println("enter InsuranceSheme");
		String InsuranceScheme=sc.next();
			
		Employee e = new Employee();
		e.setId(Integer.parseInt(id));
		e.setName(name);
		e.setSalary(Double.parseDouble(salary));
		e.setDesignation(designation);
		//e.setInsuranceScheme(designation,Double.parseDouble(salary));		
		HashMap<String, Employee> mapinfo = new HashMap<String,Employee>();
		
		 
		
		
	}

	public String getInsuranceScheme(String designation, double salary) 
	{
		
		
				if (salary > 5000 && salary < 20000 && designation.equals("System Associate")) {
					return( "Scheme C");
				} else if (salary > 20000 && salary < 40000 && designation.equals("Programmer")) {
					return("Scheme B");
				} else if (salary >= 40000 && designation.equals("Manager")) {
					return("Scheme A");
				} else if (salary < 5000 && designation.contentEquals("Clerk")) {
					return("No Scheme");
				} else
					return("please enter correct information");
				
			

		
	}

}
