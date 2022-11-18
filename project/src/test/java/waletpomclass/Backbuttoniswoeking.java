package waletpomclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Backbuttoniswoeking  {
  WebDriver driver;
  @Test
  public void browser() throws InterruptedException, IOException {
	  

	  	WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/dev/login");
	  //driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	  	Thread.sleep(5000);	
  
	  	
	  
  	
	  	driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("ruchitap@nu10.co");
	  	Thread.sleep(5000);	
	  	Reporter.log("valid emaild is entered",true);
	  	
		
		  	
	  	driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container']")).click();
	  	Thread.sleep(5000);
		
		
		  	
	  	driver.findElement(By.xpath("//button[text()='Get Started']")).click();
	  	
	  	Thread.sleep(5000);
	  	Baseclass.TakesScreenShot();
		
	  	
	  
	  	driver.findElement(By.xpath("//button[text()='Back to Login']")).click();
	  	Baseclass.TakesScreenShot();
	  	Reporter.log("click on backbutton",true);
	  	
	  	Thread.sleep(5000);
	  	
	  	String expected_result = "Buy, Hold, Transfer, Sell Crypto on Niva Pay";
	  	String actual_result1= driver.findElement(By.xpath("//span[text()='Buy, Hold, Transfer, Sell Crypto on Niva Pay']")).getText();
	       String actual_result2=actual_result1; 
	       Assert.assertEquals(expected_result, actual_result2, " message is not match");
	       //Reporter.log("Pass- Check in Cvv, mandatory field is marked with a red asterisk symbol.",true);
	       Reporter.log("Passed-button is clickable",true);
	       Thread.sleep(3000);
	    Reporter.log("Passed-button is clickable",true);
	  driver.close();
	  
  }
  
}
