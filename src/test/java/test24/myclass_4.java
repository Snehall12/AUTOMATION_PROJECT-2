package test24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myclass_4 {

	public static void main(String[] args) throws InterruptedException {
      
		 WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.get( "https://www.facebook.com/r.php?locale=en_GB&display=page");
	      driver.manage().window().maximize();

      
      
      WebElement txt_fname=driver.findElement( By.xpath("//input[@name='firstname']") );
      txt_fname.sendKeys( "snehal");
      Thread.sleep( 2000);
      
      WebElement txt_lname=driver.findElement( By.xpath("//input[@name='lastname']") );
      txt_lname.sendKeys( "kumar");
      Thread.sleep( 2000);
      
      
      WebElement txt_email=driver.findElement( By.xpath("//input[@name='reg_email__']") );
      txt_email.sendKeys( "myteam@12369");
      Thread.sleep( 2000);
      
      WebElement txt_password=driver.findElement( By.xpath("//input[@name='reg_passwd__']") );
      txt_password.sendKeys( "@123456");
      Thread.sleep( 2000);
      
      //by inex
      WebElement txt_day=driver.findElement( By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]" ));
      txt_day.sendKeys("12");
      Thread.sleep( 2000);
      
      WebElement txt_month=driver.findElement( By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]" ));
      txt_month.sendKeys("april");
      Thread.sleep( 2000);
      
      WebElement txt_year=driver.findElement( By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]" ));
      txt_year.sendKeys("1996");
      Thread.sleep( 2000);
      
      
      


	}

}
