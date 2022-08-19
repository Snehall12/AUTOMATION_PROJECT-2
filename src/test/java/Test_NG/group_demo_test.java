package Test_NG;

import org.testng.annotations.Test;

public class group_demo_test {

	
	
	@Test(priority=3,groups="regression")
	public void a_test1()
	{
		System.out.println("TEST 1");
	}
	
	@Test(priority=2,groups="sanity")
	public void b_test2()
	{
		System.out.println("TEST 2");
	}
	
	@Test(priority=1,groups="regression")
	public void c_test3()
	{
		System.out.println("TEST 3");
	}
	
	@Test(priority=4,groups="regression")
	public void d_test4()
	{
		System.out.println("TEST 4");
	}
	
	@Test(priority=5,groups="sanity")
	public void e_test5()
	{
		System.out.println("TEST 5");
	}
	
	@Test(priority=6,groups="critical regression")
	public void f_test6()
	{
		System.out.println("TEST 6");
	}
}
