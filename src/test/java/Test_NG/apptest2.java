package Test_NG;

import org.testng.annotations.Test;

public class apptest2 {

	
	//test case by priority
	@Test(priority=3)
	public void X()
	{
		System.out.println("TEST 1");
			}
	
	@Test(priority=2)
	public void Y() {
		System.out.println("TEST 2");
			}
	
	
	@Test(invocationCount=3,priority=4)
	public void Z () {
		System.out.println("TEST 3");
			}
	
	@Test(priority=5)
	public void S() {
		System.out.println("TEST 4");
			}
	
	@Test(priority=1)
	public void V() {
		System.out.println("TEST 5");
			}
	
}
