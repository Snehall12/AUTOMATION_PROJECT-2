package test24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myclass_9 {

	public static void main(String[] args) throws InterruptedException {

		//to open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get( "https://www.facebook.com/login/");
		 driver.manage().window().maximize();
		
		 Actions act=new Actions(driver);
		 
		 WebElement txt_email=driver.findElement(By.xpath(  "//input[@id='email']"));
		 act.keyDown(txt_email,  Keys.SHIFT).sendKeys( "software").keyUp(Keys.SHIFT).build().perform();
		
		 act.keyDown(Keys.CONTROL).sendKeys("a").keyUp( Keys.CONTROL).build().perform();
		 Thread.sleep( 3000);
		 act.keyDown( Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL ).build().perform();
		 Thread.sleep(4000);
		 
		 WebElement txt_password=driver.findElement(By.xpath(  "//input[@id='pass']"));
		 txt_password.click();
		 act.keyDown( Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL ).build().perform();
		 Thread.sleep(5000);
		 
		 WebElement button_login=driver.findElement(By.xpath(  "//button[@name='login']"));
		 button_login.click();
		 button_login.sendKeys("enter");
		 Thread.sleep(2000);
		 
		 driver.close();
		 
		
	}

}
