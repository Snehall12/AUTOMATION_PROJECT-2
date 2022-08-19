package test24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class myclass_2 {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "https://www.facebook.com/");
		driver.manage().window().maximize();
		 
		 //identify the web element  ---->id
	      WebElement  txt_email=driver.findElement(By.id( "email"));
	      txt_email.sendKeys( "kumar@gmail.com");
	      
	      //identify the web element  ---->id
	      WebElement  txt_password=driver.findElement(By.id( "pass"));
	      txt_password.sendKeys( "123456");
	      
	      //identify the web element  ---->name
	      WebElement btn_login=driver.findElement( By.name( "login"));
	     btn_login.click();
	     btn_login.sendKeys("enter");
	     
	     String title=driver.getTitle();
	     System.out.println(title);
	      
	     
	}

}
