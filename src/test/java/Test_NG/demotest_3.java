package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demotest_3 {

	
	@Test
	public void test_1() {
		System.out.println("test 1 completed");
		System.out.println("test 2 completed");
	
	
	String Expected ="HappyDay";
	String actual ="Happyday";
	
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(actual,Expected); // false
	
	System.out.println("testdone");
	soft.assertAll();
}
	
	@Test
	public void test_2() {
		System.out.println("test 3 completed");
		System.out.println("test 4 completed");

	
	String Expected ="Orangeflower";
	String actual ="orangeflower";
	
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(actual,Expected); // false
	System.out.println("testdone");
	soft.assertAll();
}
}
