package Test_NG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demotest_4
{
	@Test
	public void test_1() throws Exception 
	{
		//browser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//type casting
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//Scroll By Pixel
		
		js.executeScript( "window.scrollBy(0,500)", "");
		
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,-500)", "");
		
		Thread.sleep(7000);
		//SCROLL BY ELEMENT
		WebElement gujrati=driver.findElement(By.xpath( "//a[@title='Gujarati']"));
		gujrati.click();
		
		js.executeScript(  "arguments[0].ScrollIntoView()", gujrati);
		
		
	}
	
	

}
