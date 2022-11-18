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

public class Testnextbuttononprofile {
	WebDriver driver;
	
  @Test
  public void profilepage() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	  WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImxhYnVwb3FpQHRlbGVnLmV1IiwiaWF0IjoxNjY3OTA0NzU3LCJleHAiOjE2Njc5MjYzNTd9.kV4YAAnXsUs-1VKEvZ50ShZcQxGWR6BTzy5CqPzHee4");
		Thread.sleep(5000);
		Nextbuttonforwelcomepage t1 =PageFactory.initElements(driver,Nextbuttonforwelcomepage.class);
		  t1.getproceedbutton();
		  Reporter.log(" passed-proceed button is working");
		  Thread.sleep(5000);
			
		  t1.firstnametext();
		  Reporter.log("paased-firstname is entered on textbox");
		  Thread.sleep(5000);
			
		  t1.lastnametext();
		  Reporter.log("paased-lastname is entered on textbox");
		  Thread.sleep(5000);
			
		  t1.countryselected();
		  Reporter.log(" passed-country is selected from drop down");
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
		  Reporter.log(" passed-date is selcted from calander");
		  Thread.sleep(5000);
			
		  t1.nextbutton3();
		  Reporter.log(" passed-after entering all mandatory field Next button is enabled and next button is working  ");
		  Thread.sleep(5000);
			
		  //t1.nextbuttonwelcomepage();
		  //Thread.sleep(5000);
		  
		  String expected_result = "We have setup your BTC and LTC wallets.";
			Reporter.log("Expected result-welcome page should be opened");
			String actual_result1 = driver.findElement(By.xpath("//h4[text()='We have setup your BTC and LTC wallets. ']")).getText();
			Reporter.log("Actual result-welcome page is opened");
			String actual_result2=actual_result1; 
		    Assert.assertEquals(expected_result, actual_result2, " message is not match");
		    Reporter.log("passed=Verify that if user click on next buttonwith mandatory field then next inforrmative page should be opened. .");
			

		  driver.close();
			
		  
	  }
		
		

  }

