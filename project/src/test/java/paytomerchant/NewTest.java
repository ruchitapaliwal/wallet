package paytomerchant;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import utilityclass.Excelsheet;

public class NewTest extends Excelsheet {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Launchbrowserall("https://www.facebook.com/");
	  Thread.sleep(3000);
	  
	  
	  WebElement test1 = driver.findElement(By.id("email"));
	  
	  WebElement test2 = driver.findElement(By.id("pass"));
	  
	  test1.sendKeys(Excelsheet.readfromexel(0, 0));
	  Thread.sleep(3000);
	  
	  test2.sendKeys(Excelsheet.readfromexel(0, 1));
	  
	  
	 
  }
}
