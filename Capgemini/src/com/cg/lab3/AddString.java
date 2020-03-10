package com.cg.lab3;

public class AddString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		   String s1="Abhishek ";  
		   String s2="Barolia";  
		   String s3=s1.concat(s2);  
		   System.out.println(s3);
		   	   
		   for(int i=0; i< s3.length(); i++) 
		   {
			   if(i%2!=0) 
			   {
				   s3 = s3.substring(0,i-1) + "#" + s3.substring(i, s3.length());
			   } 
		   }
		   System.out.println(s3);

	
		   String s4 = "abcdefghijklmnopqrstuvwxyz";
		   StringBuffer updatedString = new StringBuffer();
		   char[] characters = s4.toCharArray();
		
		    for (int index = 0; index < characters.length; index++) 
		    {
		
		    	char c = characters[index];
		    	c = Character.toUpperCase(c);
		    	updatedString.append(c);
		    }
		    System.out.println("Modified string is: " + updatedString.toString());

	}
}