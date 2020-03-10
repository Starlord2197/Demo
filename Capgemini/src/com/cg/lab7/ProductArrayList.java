package com.cg.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductArrayList 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List <String> l = new ArrayList ();
//		l.add("soap");
//		l.add("deptergent");
//		l.add("milk");
//		l.add("chips");
		System.out.println("how many elements");
		int a = sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<a; i++)
		{
			
		String st = sc.next();
		l.add(st);
		}
		
		Collections.sort(l);
		System.out.println(l);
		for (String s : l) 
		{
			System.out.println(s);
		}

	}

}
