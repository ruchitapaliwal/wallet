package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Baseclass {
	static WebDriver driver;

	public static WebDriver Launchbrowserall(String url) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Ruchita\\New folder\\chromedriver.exe");  
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	return driver;
	
	}
	public static void TakesScreenShot() throws IOException {
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String str = RandomString.make(5);
			File destination=new File("C:\\Users\\HP\\Desktop\\scrreenshot\\data\\result_"+str+".png");
			FileHandler.copy(source, destination);
		 
		
	}
	 public static void WaitOne() {
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		}
     public static WebDriver cloesbrowser1() {
	 driver.quit();
      return driver;	 
 }
//     public static WebDriver Nivapay_Wallet_launch(int rownum,int cellnum) throws EncryptedDocumentException, IOException, InterruptedException
//		{
//			FileInputStream myfile = new FileInputStream("C:\\Users\\HP\\Desktop\\urlexcel\\url.xlsx");
//			Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
//			String value = mysheet.getRow(rownum).getCell(cellnum).getStringCellValue();
//			System.setProperty("webdriver.chrome.driver", "C:\\Ruchita\\New folder\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.get(value);
//			driver.manage().window().maximize();
//			Thread.sleep(3000);
//			return driver;
//			
//		}
     public static WebDriver Nivapay_Wallet_launch(int rownum,int cellnum,String url) throws EncryptedDocumentException, IOException, InterruptedException
		{
			FileInputStream myfile = new FileInputStream("C:\\Users\\HP\\Desktop\\urlexcel\\url.xlsx");
			Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
			String value = mysheet.getRow(rownum).getCell(cellnum).getStringCellValue();
			System.setProperty("webdriver.chrome.driver", "C:\\Ruchita\\New folder\\chromedriver.exe");  
			driver = new ChromeDriver();
			driver.get(value);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			return driver;
			
		}
 
}
