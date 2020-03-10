package com.pack.lab.service;

import java.util.*;

import com.pack.lab.work.LabWork;

public interface LabWorkInterface {
	
public void addLabWork(LabWork c1);
public List<LabWork> DisplayLabWork();
public boolean searchName(String search);
public boolean deleteCustomer(Customer cst);
public updateCustomer(int accId, String updatename);
}
