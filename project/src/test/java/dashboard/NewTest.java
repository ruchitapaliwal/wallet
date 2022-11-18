package dashboard;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.xpath.XPath;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class NewTest {
	WebDriver driver;
  @Test
  public void wallet() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Launchbrowserall("http://prod-web-alb-1200110994.us-east-1.elb.amazonaws.com/");
	   

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("rtadmin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("RtAdmin@2022");
		
		driver.findElement(By.xpath("//button[@class='login-btn']")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[text()='Transfers']")).click();
		
driver.findElement(By.xpath("//button[text()='Month To Date']")).click();

Thread.sleep(5000);
         for(int i=1; i<=200; i++)
		{
		
		
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\Excel\\address.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
		 
		WebElement value1 = driver.findElement(By.id("react-select-3-input"));
		
		value1.sendKeys(value);
		
	//	System.out.println("entering value  ");
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
	    act.moveToElement(value1).sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(9000);
		
		
		System.out.println("entering key ");
		
		
	//	System.out.println("gettext running  ");

	}
WebElement status = driver.findElement(By.xpath("//div[text()='Expired']"));
   String transaction = status.getText();
   System.out.println("entering key "+transaction);
   
	  
  
  
  
  }
}
