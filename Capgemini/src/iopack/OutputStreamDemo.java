package iopack;

import java.io.FileOutputStream;

public class OutputStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		
		try(FileOutputStream os = new FileOutputStream("test1.txt")) {
		}
		catch (Exception e) {
		}
		try {
			fos = new FileOutputStream("test1.txt",true);
		fos.write(83);
		fos.write('B');
		fos.write(120);
		fos.write(676);
		}
		finally {
			if(fos!=null)
				fos.close();
		}
		System.out.println("write done");
		

	}

}
