package test24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myclass_6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get( "https://demo.guru99.com/test/newtours/register.php");
		 driver.manage().window().maximize();
		 
		 //identify
		WebElement drp_country= driver.findElement(By.xpath("//select[@name='country']"));
		
		HandleDropDown(drp_country,"BRAZIL");
		
		Thread.sleep(6000);
		
		Select sel=new Select(drp_country);
		System.out.println(sel.getFirstSelectedOption().getText());
	
		//select by index
		sel.selectByIndex(3);
		
		Thread.sleep(3000);
	
		//select by value
		sel.selectByValue("INDIA");
		Thread.sleep(3000);
		
		//select by visible text
		sel.selectByVisibleText("BRAZIL");
		
		List<WebElement>list=sel.getOptions();
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String text=list.get(i).getText();
			System.out.println(text);
			if(text.equals("FIJI"))
			{
			sel.selectByVisibleText( "FIJI");
				break;
			}
		}
		
		
	}
	
	public static void HandleDropDown(WebElement element,String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText( text);
	}
	
}
