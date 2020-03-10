package com.cg.eis.exceptions;

public class Utilities {
	
	public static void namevalidation (String name) throws NameException {
		String pattern = "[A-Za-z]{2,6}";
		if(!name.matches(pattern))
			throw new NameException("Enter Alphabets only");
	}
	public static boolean accnovalidation (String accno) {
		String pattern = "[0-9]{3}";
		if(accno.matches(pattern))
		{
			return true;
		}
		else {
			return false;
		}
	}
}
