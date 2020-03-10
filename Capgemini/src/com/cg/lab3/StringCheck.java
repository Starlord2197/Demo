package com.cg.lab3;

public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ANT";
		int flag = 0;
		char str1[]=str.toCharArray();
		int n =str1.length;
		for(int i=0;i<n-1;i++)
		{
			int a =(int) str1[i];
			int b =(int) str1[i+1];
			if(a<b) {
				flag = 1;
			}
			flag=0;
			if(flag ==1) {
				System.out.println("negative");
				break;
			}
		
		else {
			System.out.println("positive");
			break;
		}
		}

	}

}
