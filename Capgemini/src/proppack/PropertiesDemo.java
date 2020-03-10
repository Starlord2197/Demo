package proppack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties p = new Properties();
//		p.setProperty("url", "jdbc:oracle:thin");
//		p.setProperty("username", "system");
//		p.setProperty("password", "orcl11g");
//		FileOutputStream out = new FileOutputStream("jdbc.properties");
//		p.store(out, "prop stored");
//		out.close();
		FileInputStream in = new FileInputStream("app.properties");
		p.load(in);
		
		System.out.println(p.getProperty("101"));
		p.list(System.out);


}
}