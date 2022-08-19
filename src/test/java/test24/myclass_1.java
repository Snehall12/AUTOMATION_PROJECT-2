package test24;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myclass_1 {

	public static void main(String[] args) throws Exception  {
		//  FOR BROWSER OPEN
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get( "https://www.facebook.com/");
      driver.manage().window().maximize();
      Thread.sleep(3000);
      
      
     // FOR OPEN NEXT APPLICATION
      String title=driver.getTitle();
      System.out.println(title);
      
      String url=driver.getCurrentUrl();
      System.out.println(url);
      
      driver.navigate().to( "https://www.myntra.com/login");
      Thread.sleep(3000);
      
      driver.navigate().back();
      Thread.sleep( 3000);
      
      driver.navigate().forward();
      Thread.sleep( 3000);
      
      driver.navigate().to( "https://www.meesho.com/");
      Thread.sleep( 3000);
      
      driver.navigate().refresh();
      Thread.sleep( 1000);
      
      driver.navigate().back();
      Thread.sleep(3000);
      
      //identify the web element
      WebElement  txt_email=driver.findElement(By.id( "email"));
      txt_email.sendKeys( "kumar@gmail.com");
      
      
      
      
     
      
      
      
	}

}
