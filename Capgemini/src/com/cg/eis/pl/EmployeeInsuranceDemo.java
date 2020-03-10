package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.InsuranceSchemeImplementation;

public class EmployeeInsuranceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the employee details");
		System.out.println("enter emp id");
		String id= scr.next();
		System.out.println("please enter name");
		String name= scr.next();
		System.out.println("please enter salary");
		String salary = scr.next();
		System.out.println("please enter the designation");
		String designation = scr.next();
		
		Employee emp = new Employee();
		emp.setId(Integer.parseInt(id));
		emp.setName(name);
		emp.setSalary(Double.parseDouble(salary));
		emp.setDesignation(designation);
		
		InsuranceSchemeImplementation emp1=new InsuranceSchemeImplementation();
		emp.setInsuranceScheme(emp1.calculateInsuranceScheme(Integer.parseInt(salary), designation));
		
		System.out.println(emp);

	}

}
