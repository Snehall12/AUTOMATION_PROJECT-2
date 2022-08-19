package test24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myclass_3 {

	public static void main(String[] args) throws InterruptedException {

     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     
     driver.get( "https://www.facebook.com/login/");
     driver.manage().window().maximize();
       
     //webelement ------->xpath by attribute
     WebElement txt_Email=driver.findElement(By.xpath( "//input[@id='email']"));
     txt_Email.sendKeys( "snehalk@gmail.com");
     
     WebElement txt_Password=driver.findElement( By.xpath( "//input[@id='pass']"));
     txt_Password.sendKeys("123456");
     
     //webelement ------->xpath by contains
     WebElement btn_login=driver.findElement(By.xpath(" //button[contain(@id,'u_0_2_')]"));
     btn_login.click();
     Thread.sleep( 3000);
     
     
     WebElement forgot=driver.findElement(By.xpath("//a[text()='Forgotten account?"));
     forgot.click();
     Thread.sleep( 3000);
     
     
     WebElement new_button=driver.findElement(By.xpath("button"));
     new_button.click();
     
     
     WebElement signup_btn=driver.findElement( By.name( "Create New Account"));
     signup_btn.click();
	}

}
