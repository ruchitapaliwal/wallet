package waletpomclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Disabledandenabledbutton {
	
	WebDriver driver;
	
	 @DataProvider(name="login")
    public static Object[][] getDataFromDataprovider(){
        return new Object[][] {
            { "ruchitap@nu10.co" },
            { "Krishna@gjhjk" },
            { "Bhupesh@n....co" }
        }; 

	 }
	 
	 
	 

@Test(dataProvider="login")
public void  logindata(String username) throws InterruptedException, IOException
{

	WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/dev/login");
//	driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
//	Thread.sleep(5000);	
	driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys(username);
	Thread.sleep(5000);	
	Reporter.log("enterd email id",true);
	
	driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container']")).click();
	Thread.sleep(5000);	
	
    driver.findElement(By.xpath("//button[text()='Get Started']")).click();
    
    WebElement loginbutton = driver.findElement(By.xpath("//button[text()='Get Started']"));
    		if(loginbutton.isEnabled())
    		{
    			Reporter.log("button is enabled",true);
    			System.out.println("button is enabled");
    		}
    		else {
    			Reporter.log("button is disabled",true);
    			System.out.println("button is dispalyed");
    			Baseclass.TakesScreenShot();
    			driver.close();
  
  
 }
    		}}
