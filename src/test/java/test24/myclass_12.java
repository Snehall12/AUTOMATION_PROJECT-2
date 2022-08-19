package test24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myclass_12 {

	public static void main(String[] args)  {

		// to open browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				 driver.get( "https://demo.guru99.com/test/delete_customer.php");
				 driver.manage().window().maximize();
				 
				 WebElement custom_id=driver.findElement(By.xpath("//input[@name='cusid']"));
				 custom_id.sendKeys( "12345");
		         
				 
				 
		        WebElement btn_submit=driver.findElement(By.xpath( "//input[@name='submit']"));
		        btn_submit.click();
		        
		        Alert alert=driver.switchTo().alert();
		        String a1=alert.getText();
		        System.out.println(a1);
		        alert.dismiss();
		        
		        
		        
		        
	}

}
