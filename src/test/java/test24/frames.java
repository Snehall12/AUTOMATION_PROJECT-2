package test24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {

	

	public static void main(String[] args) throws Exception {
		 WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.get( "https://demo.automationtesting.in/Frames.html");
	      driver.manage().window().maximize();
	      
	      WebElement frame1=driver.findElement(By.xpath( "//a[@class='analystic']"));
	     
	      frame1.click();
	      WebElement inner3frame=driver.findElement(By.xpath( "//input[@type='text']"));
          inner3frame.sendKeys( "welcome");
	      
		//driver.switchTo().parentFrame();
	      
	      
	      
	      
	    /* WebElement frame2=driver.findElement(By.xpath( "//a[@class='analystic']"));
	      Thread.sleep(2000); 
	      frame2.click();*/
	     /* driver.switchTo().frame(frame);
	      WebElement innerframe=driver.findElement(By.xpath( "//iframe[@name='SingleFrame']"));
	      Thread.sleep(2000); 
	      driver.switchTo().frame(innerframe);
	      
	      WebElement inner3frame=driver.findElement(By.xpath( "//input[@type='text']"));
	          inner3frame.sendKeys( "welcome");*/
	}
	
	

}
