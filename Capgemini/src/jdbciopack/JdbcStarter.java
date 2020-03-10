package jdbciopack;

public class JdbcStarter {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setEmpId(2367);
		e.setEmpName("Akash");
		e.setSalary(23146);
		e.setCity("Delhi");
		new JdbcCrudDemo().addEmployee(e);
	}

}
