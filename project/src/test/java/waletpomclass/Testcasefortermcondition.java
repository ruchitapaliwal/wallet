package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcasefortermcondition {
	WebDriver driver;
  @Test
  public void clickonlink() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	  //WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/dev/login");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//span[@class='highlight']")).click();
		Thread.sleep(7000);	
		
		String expected_result="Hey, This is Terms and conditions Page";  
	       String actual_result1= driver.findElement(By.xpath("//div[@class='modal-wrap']")).getText();
	       String actual_result2=actual_result1; 
	       Assert.assertEquals(expected_result, actual_result2, " message is not match");
	       //Reporter.log("Pass- Check in Cvv, mandatory field is marked with a red asterisk symbol.",true);
	    
	       Thread.sleep(3000);
	    Reporter.log("Passed-link is clickable",true);

		driver.close();
  }
}
