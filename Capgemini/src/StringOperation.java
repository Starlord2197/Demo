
public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fName = "Abhishek";
		String lName = "Barolia";
		String fullName = fName+lName;
		System.out.println(fullName);
		char[] a1=fullName.toCharArray();
		for(int i=0;i<fullName.length();i++)
		{
			a1[i] = '$';
			i++;
		}
		for(int i=0;i<fName.length();i++) {
			System.out.println(a1[i]);
		}

	}

}
