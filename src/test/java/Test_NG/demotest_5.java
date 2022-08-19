package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demotest_5 {

	
	@Test
	public void test_2() throws Exception 
	{
		//browser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "https://www.facebook.com/login/");
		driver.manage().window().maximize();
			
			
		WebElement punjabi=driver.findElement(By.xpath( "//a[@title='Punjabi']"));
		Thread.sleep(6000);
		punjabi.click();
		
}
	public static void handle_ScrollByElement(WebDriver driver,WebElement element)
	{
		//type casting
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript( "arguments[0].ScrollIntoView()", element);
	
	}
}