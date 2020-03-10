package jdbciopack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcCrudDemo {
	
	public void addEmployee(Employee e) throws Exception {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url ="jdbc:oracle:thin:@localhost:1521:XE"; //"driver/ipad/port/database istance";
		String user = "system";
		String password="orcl11g";
		Connection connection=DriverManager.getConnection(url, user, password);
		PreparedStatement ps=connection.prepareStatement("insert into employee values(?,?,?,?)");
		ps.setInt(1,e.getEmpId());
		ps.setString(2,e.getEmpName());
		ps.setInt(3,e.getSalary());
		ps.setString(4,e.getCity());
		int rowCount=ps.executeUpdate();
//		Statement statement=connection.createStatement();
//		String query = "insert into employee values("+e.getEmpId()+",'"+e.getEmpName()+"',"+e.getSalary()+",'"+e.getCity()+"')";
//		int rowCount=statement.executeUpdate(query);
		System.out.println(rowCount+"Row inserted");
		
		connection.close();
	}
	
	public void fetchEmployees() throws Exception{
		String url ="jdbc:oracle:thin:@localhost:1521:XE"; //"driver/ipad/port/database istance";
		String user = "system";
		String password="orcl11g";
		Connection connection=DriverManager.getConnection(url, user, password);
		Statement statement=connection.createStatement();
		
		ResultSet rs=statement.executeQuery("Select*from employee");
		while(rs.next()) {
			System.out.println(rs.getInt("empId"));
			System.out.println(rs.getString("empName"));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getString(4));
		}
		statement.close();
	}
	
}
