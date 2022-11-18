package waletpomclass;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcaseforloop {
	WebDriver driver;
	@Test

	
	public void  dropdown() throws InterruptedException, EncryptedDocumentException, IOException{
		driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	

		//WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6Im1vbG11bGlya2lAdnVzcmEuY29tIiwiaWF0IjoxNjY2ODQ4Njc0LCJleHAiOjE2NjY4NzAyNzR9.y1P6UzNuCHpRdXkWqW7Hn64kBnkzzTqfJL3856Qr-sI");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='ng-untouched ng-pristine ng-invalid']")).sendKeys("ruchi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("paliwal");
		Thread.sleep(3000);
		WebElement list = driver.findElement(By.xpath("//select[@class='ng-untouched ng-pristine ng-invalid']"));
		Select country = new Select(list);
		List<WebElement> c=country.getOptions();
		for (int j = 0; j < c.size(); j++) {
			country.selectByIndex(j);
			 Thread.sleep(3000);
	         String s = c.get(j).getText();
	      
	         System.out.println(s);
	         
	      }
  
}}
