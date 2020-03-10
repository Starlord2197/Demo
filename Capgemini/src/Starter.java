class Starter {
	int empId=5;
	Starter(int eid){
		empId=eid;
	}

}

class ContractEmployee extends Starter{
	int empId=20;
	ContractEmployee() {
		super(10);
		System.out.println(super.empId);
	}
}

public class Starter{
	public static void main(String[] args) {
		ContractEmployee ce = new ContractEmployee();
	}
	
}