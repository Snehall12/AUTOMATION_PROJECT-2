package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class apptest1 {

	//depends on one another
	@Test
	public void X() {
		System.out.println("TEST 1");
			}
	
	@Test
	public void Y()
	{
		System.out.println("TEST 2");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="Y")
	public void Z()
	{
		System.out.println("TEST 3");
	}
	
	
}


