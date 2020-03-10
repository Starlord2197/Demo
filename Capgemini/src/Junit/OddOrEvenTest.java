package Junit;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class OddOrEvenTest {
	
	@Test
	public void testForOdd() {
		int testData=11;
		String expectedResult="odd";
		oddOrEven obj = new oddOrEven();
		String actualResult=obj.OddOrEven(testData);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testForEven() {
		int testData=12;
		String expectedResult="even";
		oddOrEven obj = new oddOrEven();
		String actualResult=obj.OddOrEven(testData);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test(expected =RuntimeException.class)
	public void testForException() {
		int testData=0;
		oddOrEven obj = new oddOrEven();
		obj.OddOrEven(testData);
	}
	
	@Before
	public void setup() {
		
	}
	

}
