package Junit;

public class oddOrEven {
	
	public String OddOrEven(int a) {
		if(a==0) {
			throw new RuntimeException("zero not accepted");
		}
		else if(a%2==0)
		{
			return "even";
		}
		else
			return "odd";
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddOrEven o = new oddOrEven();
		System.out.println(o.OddOrEven(0));
		

	}

}
