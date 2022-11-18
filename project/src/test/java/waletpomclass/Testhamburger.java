package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testhamburger {
	WebDriver driver;
	
  @Test
  public void hamburger() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	 // WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJ1Y2hpdGFwQG51MTAuY28iLCJpYXQiOjE2NjY4NTQyNTQsImV4cCI6MTY2Njg3NTg1NH0.epDDtLZjea_Scn36akoI9by45fX_FnbF1z2mCgLMNqk");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='nav-bar']")).click();
		Thread.sleep(3000);
		
	  
  }
}
