package lamdapack;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

import iopack.Employee;

public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(new MaxFinderImp1().findMax(12,  33));
		BiFunction<Integer, Integer, Integer> mf = (x,y)-> x>y?x:y;
		System.out.println(mf.apply(12,  44));
		
		Consumer<String> d = s-> {System.out.println(s);
						System.out.println("Welcome");
		};
		d.accept("hi");
		
		IntSupplier is = ()-> 1+2;
		System.out.println("frm supplier" +is.getAsInt());
		
		Predicate<Integer> iseven = (a)->
		{
			if(a%2==0)
				return true;
			else
			return false;
		};
		System.out.println(iseven.test(33));

		
		MaximumFinder biggestAmgThree=(a,b,c)-> 
		{
			if(a>b && a>c) 
				return a;
				else if(b>c)
					return b;
				else
					return c;
		};
		
		System.out.println(biggestAmgThree.findMax(3,6,1));
		
		Consumer<Integer> i = (a)->System.out::println(a);
		Consumer<Integer> j = (a)->System.out::println;
		j.accept(34);
		
		Consumer<String> c = System.out::println;
		c.accept("Welcome");
		
		Employee emp = new Employee();
		emp.setEmpId(12);
		emp.setEmpName("ram");
		
		Consumer<Employee> empConsumer = (e)->System.out.println(e.getEmpName());
		empConsumer.accept(emp);
		
		Function<Employee> empFun=(e)->e.GetEmpName();
		
	}
	
//	@FunctionalInterface
//	interface MaxFinder {
//		int findMax(int a, int b);
//	}
	
//	interface Display{
//		void disp(String s);
//	}
//	
	interface MaximumFInder {
		int findMax(int a, int b,int c);
		
		
	}
	
//	class MaxFinderImp1 implements MaxFinder{
//		
//		@Override
//		public int findMax(int a,int b) {
//			return a>b?a:b;
//		}
//	}

}
