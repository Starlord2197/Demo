package com.cg.lab7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class EmployeeService {

	public static void main(String[] args) 
	{
		HashMap<Integer, Employee> map=new HashMap<Integer, Employee>();
		Employee e=new Employee();
		
		
			
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
		e.setId(id);
		
		System.out.println("enter name");
		String name= sc.next();
		e.setName(name);
		
		System.out.println("enter salary ");
		Double sal = sc.nextDouble();
		e.setSalary(sal);
		
		System.out.println("enter designation");
		String designation = sc.next();
		e.setDesignation(designation);
		
		System.out.println("enter insurance scheme");
		String insurance = sc.next();
		e.setInsuranceScheme(insurance);
		
		Integer key = null;
		map.put(key, e);
		
//		Employee emp = new Employee(id, name, sal, designation, insurance);
//		Map<String, Employee > list = new HashMap<String, Employee>();
//		System.out.println(list.put("name", new Employee(12, "abcd", 345677, "IT", "sal")));
		
		
		
				
	}

}
//
//e.setId(id);
//e.setName(name);
//e.setSalary(salary);		
//e.setDesignation(designation);
//e.setInsuranceScheme(insuranceScheme);
