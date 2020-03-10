package com.cg.Lab8;

import java.io.FileOutputStream;
import java.util.Scanner;

public class outputNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		try {
		FileOutputStream fos = new FileOutputStream("numbers.txt");
		for(int i=0; i<11; i++) {
			
		}
		fos.close();
		System.out.println("Numbers");

	}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
