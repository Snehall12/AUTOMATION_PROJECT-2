package test24;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myclass_11 {

	public static void main(String[] args) throws  IOException {

		// to open browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				 driver.get( "https://www.facebook.com/login/");
				 driver.manage().window().maximize();
				
				 //webelement ------->xpath by attribute
			    /* WebElement txt_Email=driver.findElement(By.xpath( "//input[@id='email']"));
			     txt_Email.sendKeys( "softwaretest@gmail.com");
			     
			     WebElement txt_Password=driver.findElement( By.xpath( "//input[@id='pass']"));
			     txt_Password.sendKeys("123456");
			     
			     //webelement ------->xpath by contains
			     WebElement btn_login=driver.findElement(By.xpath("  //button[@name='login']"));
			     btn_login.click();

			     
			       String path="C:\\Users\\ASUS\\eclipse-workspace\\SK_AUTOMATION_PROJECT\\screenshot";
		         TakesScreenshot ts=(TakesScreenshot)driver;
		         File src=ts.getScreenshotAs( OutputType.FILE);
		         File trg=new File(path+"\\test1.png");
		         FileUtils.copyFile(src, trg);*/
		WebElement screen=driver.findElement(By.xpath( "//img[@class='_97vu img']"));
		    
				// TakesScreenshot ts=(TakesScreenshot)driver;
		         File src=screen.getScreenshotAs( OutputType.FILE);
		         File trg=new File(".\\screenshot\\fb2.png");
		         FileUtils.copyFile(src, trg);
		
		
	}

}
