package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcasenextbuttononwelcopepage {
	WebDriver driver;
  @Test
  public void nextbuttonworkingonwelcomepage() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	 
	 // WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImRlcHVkaWJvQGx5cmljc3BhZC5uZXQiLCJpYXQiOjE2Njc5MDUwMjMsImV4cCI6MTY2NzkyNjYyM30.oxi3Lh_thyFhb_7p898aXbJtwBn_rA5iejkyE-1h8W8");
		Thread.sleep(5000);
		Nextbuttonforwelcomepage t1 =PageFactory.initElements(driver,Nextbuttonforwelcomepage.class);
		  t1.getproceedbutton();
		  Thread.sleep(5000);
			
		  t1.firstnametext();
		  Thread.sleep(5000);
			
		  t1.lastnametext();
		  Thread.sleep(5000);
			
		  t1.countryselected();
		  Thread.sleep(5000);
			
		  t1.dateselecctfromcalander();
		  Thread.sleep(5000);
			
		  t1.year();
		  Thread.sleep(5000);
			
		  t1.arrowselect();
		  Thread.sleep(5000);
			
		  t1.selectyear1();
		  Thread.sleep(5000);
		  
			
		  t1.selectmos();
		  Thread.sleep(5000);
			
		  t1.date();
		  Thread.sleep(5000);
			
		  t1.nextbutton3();
		  Thread.sleep(5000);
			
		  t1.nextbuttonwelcomepage();
		  Thread.sleep(5000);
		  
		  String expected_result = "My Balance";
			Reporter.log("Expected result-dashboard page should be opened");
			String actual_result1 = driver.findElement(By.xpath("//span[text()='My Balance']")).getText();
			Reporter.log("Actual result-dashboard page is opened");
			String actual_result2=actual_result1; 
		    Assert.assertEquals(expected_result, actual_result2, " message is not match");
		    Reporter.log("passed=Verify that if user click on next buttonwith then next inforrmative page should be opened. .");
			

		  driver.close();
			
		  
	  }
		
		
  }
  