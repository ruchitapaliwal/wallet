package waletpomclass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testproceeddbutton {
	WebDriver driver;

	
	
	@Test
	 public void functionalityproceed() throws InterruptedException, EncryptedDocumentException, IOException {
		driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
		//WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJ1Y2hpdGFwQG51MTAuY28iLCJpYXQiOjE2Njc1NTgwMTQsImV4cCI6MTY2NzU3OTYxNH0.-88SxEAFxt4Gprulh0EatadZKes2UPkOHDh5u7uc2GM");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(3000);
		
	}
	
}
