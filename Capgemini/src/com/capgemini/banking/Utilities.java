package com.capgemini.banking;

public class Utilities {
	public static boolean namevalidation(String name) {
		String pattern = "[A-Za-z]{3,10}";
		if(name.matches(pattern))
			return true;
		else
			return false;
	}
}
