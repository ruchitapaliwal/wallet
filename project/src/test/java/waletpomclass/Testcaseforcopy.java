package waletpomclass;

import static org.testng.Assert.assertTrue;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcaseforcopy {
	WebDriver driver;
  @Test
  public void copy() throws EncryptedDocumentException, IOException, InterruptedException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
		 // WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJ1Y2hpdGFwQG51MTAuY28iLCJpYXQiOjE2NjgxNDY5MDksImV4cCI6MTY2ODE2ODUwOX0.8fHjP6MdW-3RjmlHpPu3DH7bZskcc_J0IUaKBPwBckE");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='Proceed']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='image-wrap'])[2]")).click();
			Thread.sleep(5000);
			
//		WebElement copybutton = driver.findElement(By.xpath("//img[@src='./../../assets/icons/copy-btn.svg']"));
//		String beforeValue=copybutton.getAttribute("placeholder");
//		System.out.println("beforevalue");
//		
//		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//		StringSelection strSel = new StringSelection(beforeValue);
//		clipboard.setContents(strSel, null);
			
			
			
			driver.findElement(By.xpath("//img[@src='./../../assets/icons/copy-btn.svg']")).click();
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.chord(Keys.LEFT_CONTROL, "v")).build().perform();
			
			
			
}}
