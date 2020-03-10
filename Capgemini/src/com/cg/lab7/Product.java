package com.cg.lab7;

public class Product 
{

	public static void main(String args[])
	{
		String temp;
		String arr[] = {"system" , "detergent" ,"chips" , "milk" };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			for (i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}

	}
}

