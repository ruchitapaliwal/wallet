package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testpurchasebutton { 
	WebDriver driver;
  @Test
  public void clickonpurchasebutton() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	 // WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJ1Y2hpdGFwQG51MTAuY28iLCJpYXQiOjE2NjgwNTQwMTAsImV4cCI6MTY2ODA3NTYxMH0.c-OjWMkXXBkev9YknG85kJNyNX5PhXuffEnLJA4T6Jc");
		Thread.sleep(5000);
		dashboard t1 =PageFactory.initElements(driver,dashboard.class);
		t1.button();
		Thread.sleep(5000);
		t1.purchasearrow();
		Thread.sleep(5000);
		Reporter.log("when user click on purchase button. purchase screen should be opend.");
		t1.enteramount();
		Thread.sleep(5000);
		Reporter.log("when user enter amount on textbox.");
		t1.purchase1button();
		Thread.sleep(3000);
		Reporter.log("when click on purchase button");
		driver.close();
		String expected_result = "Card Details";
		Reporter.log("Expected result-paymentgatway page should be opened");
		String actual_result1 = driver.findElement(By.xpath("//h4[text()='Card Details']")).getText();
		String actual_result2=actual_result1; 
		Reporter.log("Actual result-paymentgatway page has opened");
	    Assert.assertEquals(expected_result, actual_result2, " message is not match");
	    Reporter.log("passed=Verify that if user click on button buttonthen paymentgatway page should be opened.");
		
	   driver.close();
	  
  }
}
