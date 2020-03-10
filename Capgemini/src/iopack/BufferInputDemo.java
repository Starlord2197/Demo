package iopack;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInputDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("test2.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int a=bis.read();
		while(a!=-1) {
			System.out.println(a);
			a=bis.read();
		}
		bis.close();
		fis.close();
		System.out.println("prg ends");

	}

}
