package iopack;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("test1.txt");
		System.out.println(f.canRead());
		System.out.println(f.getName());
		System.out.println(f.exists());
		System.out.println(f.lastModified());
		System.out.println(f.length());
		Path p = Paths.get("c:/sample.txt"); 
		System.out.println();
		System.out.println();
		System.out.println();

	}

}
