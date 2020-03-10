package com.pack.lab.service;

import java.util.*;

import com.pack.lab.work.LabWork;

public class LabWorkImplementation implements LabWorkInterface {

	List<LabWork> c2 = new ArrayList<LabWork>();
	
	@Override
	public void addLabWork(LabWork c1) {
		// TODO Auto-generated method stub
		c2.add(c1);
	}

	@Override
	public List<LabWork> DisplayLabWork() {
		// TODO Auto-generated method stub
		return c2;
	}

	@Override
	public boolean searchName(String search) {
		 
	        if(search.equals(c2)) {        	
	        	return true;
	        }
	        else
	        	return false;
	}
	
	@Override
	public boolean deleteCustomer(String name) {
		boolean available= false;
		for(Customer cst1:custList) {
			if(cst1.getName()==name)
			{
				custList.remove(cst1);
				available = true;
				break;
			}
		
		
	}
		return available;
	}
	
	@Override
	public boolean updateCustomer(int accId, String updatename) {
		boolean available= false;
		for(Customer cst1:custList) {
			if(cst1.getName()==name)
			{
				custList.remove(cst1);
				available = true;
				break;
			}
		
		
	}
		return available;
	}

		
	}


