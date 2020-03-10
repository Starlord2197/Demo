package iopack;

import java.io.BufferedOutputStream;

import java.io.FileOutputStream;

public class BufferWriteDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileOutputStream fos = new FileOutputStream("test2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write(100);
		bos.write(102);
		bos.close();
		fos.close();
		System.out.println("prg ends");
	}

}
