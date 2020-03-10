package iopack;

import java.io.FileReader;

public class CharReadDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("test4.txt");
		int ch=fr.read();
		while(ch!=1)
		{
			System.out.println();
			ch=fr.read();
		}
		
		

	}

}
