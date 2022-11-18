package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcaseforconfimationlink {
	WebDriver driver;
  @Test
  public void verificationlink() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	 // WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJ1Y2hpdGFwQG51MTAuY28iLCJpYXQiOjE2Njc1NTgwMTQsImV4cCI6MTY2NzU3OTYxNH0.-88SxEAFxt4Gprulh0EatadZKes2UPkOHDh5u7uc2GM");
		Thread.sleep(5000);
		
		String expected_result = "Thanks for verifying your Email Address. Let’s proceed.";
		String actual_result1= driver.findElement(By.xpath("//span[text()='Thanks for verifying your Email Address. Let’s proceed.']")).getText();
	       String actual_result2=actual_result1; 
	       Assert.assertEquals(expected_result, actual_result2, " message is not match");
	       //Reporter.log("Pass- Check in Cvv, mandatory field is marked with a red asterisk symbol.",true);
	       Reporter.log("passed -link is verified",true);
	       driver.close();
  }
}
