package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcheckboxclickable {
	WebDriver driver;
	
  @Test
  public void selectoncheckbox() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	  //WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/dev/login");
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("ruchitap@nu10.co");
		Thread.sleep(5000);	
		
	 WebElement button = driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container']"));
		Thread.sleep(3000);	
		button.click();
		
		if (button.isSelected()) {
			System.out.println("test case is passed");
			Reporter.log("checkbox is selected");
			
		} else {
			System.out.println("test case is failed");
			Reporter.log("checkbox is selected");

		}
		Thread.sleep(3000);	
		driver.close();
		//Assert.assertEquals(true, button.isSelected());
		//System.out.println("Checkbox is selected – Assert passed");
	//Reporter.log("test case is passed",true);
//		
		
//		 boolean expected_result = button.isSelected();  
//	       mesg = driver.findElement(By.xpath("//mat-checkbox[@class='mat-checkbox my-1 mat-accent mat-checkbox-checked']")).;
//	       String actual_result=mesg; 
//	       Assert.assertEquals(expected_result, actual_result, "Error message is not match");
      //Reporter.log("test ",true);
//		
		
  }
}
