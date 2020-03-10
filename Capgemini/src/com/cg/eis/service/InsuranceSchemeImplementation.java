package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class InsuranceSchemeImplementation extends Employee implements insuranceschemeinterface {

	@Override
	public String calculateInsuranceScheme(double salary, String designation) {
		// TODO Auto-generated method stub
		if(salary<5000 && designation.equals("Clerk"))
			return "Noscheme";
		else if(salary>=40000 && designation.equals("Manager"))
			return "Scheme A";
		else if(salary>=20000 && salary<40000 && designation.equals("Programmer"))
			return "Scheme B";
		else if(salary>5000 && salary<20000 && designation.equals("System Associate"))
			return "Scheme c";	
		
		
		return null;
	}
		
}
