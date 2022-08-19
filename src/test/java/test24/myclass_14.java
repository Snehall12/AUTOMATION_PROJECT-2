package test24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myclass_14 {

	public static void main(String[] args) throws Exception {

		//to open browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				 driver.get( "https://demo.guru99.com/test/newtours/register.php");
				 driver.manage().window().maximize();
				 
				 String path="C:\\Users\\ASUS\\eclipse-workspace\\AUTOMATION_PROJECT 2\\datasheet\\sheet1.xlsx";
				FileInputStream fsi=new FileInputStream(path);
				XSSFWorkbook wb=new XSSFWorkbook(fsi);
				
				WebElement first_name=driver.findElement(By.xpath("//input[@name='firstName']"));
				String A=wb.getSheet("login").getRow(0).getCell(0).getStringCellValue();
				first_name.sendKeys(A);
				 
		
				WebElement last_name=driver.findElement(By.xpath("//input[@name='lastName']"));
				String B=wb.getSheet("login").getRow(0).getCell(1).getStringCellValue();
				last_name.sendKeys(B);
				 
				WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
				String C=wb.getSheet("login").getRow(0).getCell(1).getStringCellValue();
				phone.sendKeys(C);
				 
	}

}
