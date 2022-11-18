package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testgetstartedbuttoncllickable {
	WebDriver driver;
  @Test
  public void buttonisclickable() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	

		//WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImxlemV4dXFvQGRlY2FiZy5ldSIsImlhdCI6MTY2Nzg3OTI0MCwiZXhwIjoxNjY3OTAwODQwfQ.9Ve2hJ1kxd-lax0_csIg1WhWkPhibRVkmLtNi1a0mJ4");
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("ruchitap@nu10.co");
		Thread.sleep(5000);	
		
		driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container']")).click();
		Thread.sleep(5000);	
		
	    driver.findElement(By.xpath("//button[text()='Get Started']")).click();
	    Thread.sleep(5000);	
	    String expected_result="We have sent a verification link to your email address. Please check your email to verify.";  
	       String actual_result1= driver.findElement(By.xpath("//span[text()='We have sent a verification link to your email address. Please check your email to verify.']")).getText();
	       String actual_result2=actual_result1; 
	       Assert.assertEquals(expected_result, actual_result2, " message is not match");
	       //Reporter.log("Pass- Check in Cvv, mandatory field is marked with a red asterisk symbol.",true);
	    
	       Thread.sleep(3000);
	    Reporter.log("Passed-Get started button is clickable",true);

	    
	    driver.close();
	    
  }
}
