package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demotest_2 {

	@Test
	public void test_1() {
		System.out.println("test 1 completed");
		System.out.println("test 2 completed");
	
	
	String Expected ="Happy Day";
	String actual ="Happy Day";
	
	Assert.assertEquals(actual,Expected); //true
	System.out.println("test done");
}
	@Test
	public void test_2() {
		System.out.println("test 1 completed");
		System.out.println("test 2 completed");
	
	
	String Expected ="Orange flower";
	String actual ="orange flower";
	
	Assert.assertEquals(actual,Expected); // false
	System.out.println("test done");
}
	
}