package com.cg.lab3;

public class CharacterConverter {
	 
	   public static void main(String[] args) {
		
		String sample = "abcdefghijklmnopqrstuvwxyz";
		
		StringBuffer updatedString = new StringBuffer();
		
		char[] characters = sample.toCharArray();
		
		for (int index = 0; index < characters.length; index++) {
		
			char c = characters[index];
			c = Character.toUpperCase(c);
			updatedString.append(c);
		}
		System.out.println("Modified string is: " + updatedString.toString());
	   }
	}