package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcaseforwihoutclickoncheckbox {
	WebDriver driver;
  @Test
  public void disabledbutton() throws InterruptedException, EncryptedDocumentException, IOException {
	 driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	  //WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/dev/login");
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("ruchitp@nu10.co");
		Thread.sleep(5000);	
		
		//driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container']")).click();
		//Thread.sleep(5000);	
		
	    WebElement button = driver.findElement(By.xpath("//button[text()='Get Started']"));
	    if (button.isEnabled()) {
	    	System.out.println("Testcase is failled");
	    	Reporter.log("button is enabled");
			
		} else {
			System.out.println("Testcase is passed");
			Reporter.log("button is disabled");
			

		}
	    Thread.sleep(5000);	
	    
	    
//	     boolean expected_result = button.getAttribute(disabled);  
//	        actual_result1= driver.findElement(By.xpath("//button[text()='Get Started']")).click();
//	       String actual_result2=actual_result1; 
//	       Assert.assertEquals(expected_result, actual_result2, " message is not match");
//	    driver.close();
//	  
  }
}
