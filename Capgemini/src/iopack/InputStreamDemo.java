package iopack;

import java.io.FileInputStream;


public class InputStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("test1.txt");

		int value=fis.read();
		while(value!=-1) {
			System.out.println(value);
			value=fis.read();
		}
		fis.close();
	}

}
