package iopack;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectReadDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee o=(Employee)ois.readObject();
//		Employee e=(Employee)o;
		System.out.println(o.getEmpName());
		
		ois.close();
		fis.close();
		

	}

}
