package waletpomclass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcasefornextbuuttoonfunctionilty {
	WebDriver driver;
	@Test
	public void  loginuser1() throws InterruptedException, EncryptedDocumentException, IOException
	{
		driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	

		WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InNlZnlzeW5pQG1haWxvLmljdSIsImlhdCI6MTY2Nzg3OTY4MCwiZXhwIjoxNjY3OTAxMjgwfQ.a09t2UusvHvETQuCPAxL1a_ONZUq-xJFMujN_xwdrKk");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Reporter.log(" passed-proceed button is working");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='ng-untouched ng-pristine ng-invalid']")).sendKeys("ruchi");
		Reporter.log("paased-firstname is entered on textbox");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("paliwal");
		Reporter.log("paased-lastname is entered on textbox");
		Thread.sleep(3000);
		Select country = new Select(driver.findElement(By.xpath("//select[@class='ng-untouched ng-pristine ng-invalid']")));
		country.selectByIndex(1);
		Reporter.log(" passed-country is selected from drop down");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-icon-button mat-button-base']")).click();
		Reporter.log(" passed-date is selcted from calander");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-calendar-previous-button mat-icon-button mat-button-base']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[2]")).click();
		Reporter.log(" passed-date is selected");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Reporter.log(" passed-after entering all mandatory field Next button is enabled and next button is working  ");
		Thread.sleep(5000);
		String expected_result = "We have setup your BTC and LTC wallets.";
		Reporter.log("Expected result-welcome page should be opened");
		String actual_result1 = driver.findElement(By.xpath("//h4[text()='We have setup your BTC and LTC wallets. ']")).getText();
		Reporter.log("Actual result-welcome page is opened");
		String actual_result2=actual_result1; 
	    Assert.assertEquals(expected_result, actual_result2, " message is not match");
	    Reporter.log("passed=Verify that if user click on next buttonwith mandatory field then next inforrmative page should be opened. .");
		
		
		
		//driver.findElement(By.xpath("//span[@class='highlight']")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
}
	
}
