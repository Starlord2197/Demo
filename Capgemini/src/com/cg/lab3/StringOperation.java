package com.cg.lab3;


import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter First name");
		String fname = kb.next();
		System.out.println("Enter Last name");
		String lname = kb.next();
		
		addStrings(fname,lname);
		replaceString(lname);
		duplicateChar(lname);
		oddUpercase(lname);
		
		System.out.println("Enter String to check positive or not");
		String check = kb.next();
		
		if(positiveStrings(check)==true)
			System.out.println("Positive String");
		else
			System.out.println("Negative String");
	}

	private static void addStrings(String fname, String lname) {
		// TODO Auto-generated method stub
		String fullname=fname+lname;
		System.out.println("Fullname :"+fullname);
	}
	
	private static void replaceString(String lname) {
		// TODO Auto-generated method stub
		char[] lname1 = lname.toCharArray();
		for (int i = 0; i < lname.length(); i++) {
			lname1[i] = '#';
			i++;
		}
		for (char s : lname1) {
			System.out.print(s);
		}
	}
	
	private static void duplicateChar(String lname) {
		// TODO Auto-generated method stub
		char[] str1 = lname.toCharArray();
		int j=0;
		int k = 0;
		for (int i = 0; i < str1.length; i++) {
			for (j = 0; j < i; j++) {
				if (str1[i] == str1[j]) {
					break;
				}
				if (j == i) {
					str1[k++] = str1[i];
				}
			}
		}
		System.out.print(String.valueOf(Arrays.copyOf(str1, j))); 
		System.out.println();
		}
	private static void oddUpercase(String lname) {
		// TODO Auto-generated method stub
		for (int i = 0, len = lname.length(); i < len; i++) {
		    char ch = lname.charAt(i);
		    if (i % 2 == 0) {
		        System.out.print(Character.toLowerCase(ch));
		    } else {
		        System.out.print(Character.toUpperCase(ch));
		    }
		}
		System.out.println();
	}
	
	private static boolean positiveStrings(String check) {
		int n = check.length();  
	    char c[] = new char [n];   
	    for (int i = 0; i < n; i++) {  
	        c[i] = check.charAt(i);  
	    }   
	    Arrays.sort(c);  
	    for (int i = 0; i < n; i++)  
	        if (c[i] != check.charAt(i))   
	            return false;  
	            
	    return true; 
	}
	
	
}


