package iopack;

import java.io.FileWriter;


public class CharWriteDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("test4.txt");
		fw.write(34);
		fw.write("hello");
		fw.close();
		System.out.println("prg ends");

	}

}
