package test24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myclass_10 {

	public static void main(String[] args) throws InterruptedException {

		// to open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get( "https://demo.guru99.com/test/drag_drop.html");
		 driver.manage().window().maximize();
		
		 Actions act=new Actions(driver);
		 
		//1st action
		 WebElement button_src=driver.findElement( By.xpath( " (//a[@class='button button-orange'])[5]"));
		 
		WebElement button_dest=driver.findElement( By.xpath( " (//li[@class='placeholder'])[1]"));
		
		act.dragAndDrop( button_src, button_dest).build().perform();
		Thread.sleep(3000);
		
		//2nd action
		WebElement button_src1=driver.findElement(By.xpath(  "(//a[@class='button button-orange'])[1]"));
		WebElement button_dest1=driver.findElement( By.xpath( " ( //li[@class='placeholder'])[1]"));
		act.dragAndDrop( button_src1, button_dest1).build().perform();
		Thread.sleep(3000);
		
		//3rd action
		
		WebElement button_src2=driver.findElement(By.xpath(  "( //a[@class='button button-orange'])[6]"));
		WebElement button_dest2=driver.findElement( By.xpath( " (  //li[@class='placeholder'])[1]"));
		act.dragAndDrop( button_src2, button_dest2).build().perform();
		Thread.sleep(3000);
		
		//4th action
		WebElement button_src3=driver.findElement(By.xpath(  "(  //a[@class='button button-orange'])[4]"));
		WebElement button_dest3=driver.findElement( By.xpath( " (   //li[@class='placeholder'])[1]"));
		act.dragAndDrop( button_src3, button_dest3).build().perform();
		
		
	}
	

}
