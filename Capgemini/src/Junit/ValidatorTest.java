package Junit;

import org.junit.Test;

import junit.framework.Assert;

public class ValidatorTest {
	
	@Test
	public void testForFalse(){
		Validator v = new Validator();
		boolean flag=v.validatorAge(11);
		Assert.assertFalse(flag);
		
	}
	@Test
	public void testForTrue(){
		Validator v = new Validator();
		boolean flag=v.validatorAge(20);
		Assert.assertTrue(flag);
}
}
