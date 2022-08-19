package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ASSART_1 {

	
	@Test
	public void test_1() {
		System.out.println("test 1 completed");
		System.out.println("test 2 completed");
	}
	
	String Expected ="Happy Day";
	String actual ="Happy Day";
	
	Assert.assertEquals(actual,Expected);
	syso
		// TODO Auto-generated method stub

	}
	
}



