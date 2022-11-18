package waletpomclass;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import baseclass.Baseclass;

public class Testscanqrscode {
	WebDriver driver;
  @Test
  public void qrcode() throws EncryptedDocumentException, IOException, InterruptedException, NotFoundException {
	  
			 // WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJ1Y2hpdGFwQG51MTAuY28iLCJpYXQiOjE2Njg0MDYzODUsImV4cCI6MTY2ODQyNzk4NX0.7es6YEUGYWiXekSVwdQhuNtDPXGSWHuGxiD17rUGztg");
			  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[text()='Proceed']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//div[@class='image-wrap'])[2]")).click();
				Thread.sleep(5000);
				String qrcodeurl = driver.findElement(By.xpath("//img[@src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJQAAACUCAYAAAB1PADUAAAAAklEQVR4AewaftIAAATCSURBVO3BQW4ERxIEwfDC/P/LvjzmqYBG53ApKczwR6qWnFQtOqladFK16KRq0UnVopOqRSdVi06qFp1ULTqpWnRSteikatFJ1aKTqkUnVYs+eQnIb1LzlwCZ1NwAuVEzAflNat44qVp0UrXopGrRJ8vUbALyBpAn1ExAngByo2YC8oSaTUA2nVQtOqladFK16JMvA/KEmieA3Kh5Q80mIJOaN4A8oeabTqoWnVQtOqla9Mm/jJoJyBtqJiBPqJnUTEAmNf9kJ1WLTqoWnVQt+uQ/Rs0EZFIzAZnU3ACZgPyXnFQtOqladFK16JMvU/OXALkBMqmZgLyhZpOav+SkatFJ1aKTqkWfLAPyl6mZgExqJiCTmgnIpGYCcgNkUnMD5C87qVp0UrXopGrRJy+p+UuATGo2AXkDyBNq/klOqhadVC06qVr0yUtAJjUTkE1qJjVPAJnUTEDeADKpuQFyA2STmm86qVp0UrXopGrRJy+pmYBMam6ATGr+n9Q8AeQJIN+k5gkgk5o3TqoWnVQtOqlahD/yhwG5UTMBmdTcANmkZgIyqbkBMql5Asik5jedVC06qVp0UrXok18GZFIzAZnU/CY1m9RMQG7UTEAmNX/ZSdWik6pFJ1WLPnkJyKRmE5BJzQTkCSCTmgnIE2omIJOaGzU3at4AcqNm00nVopOqRSdVi/BHFgGZ1ExAnlDzBJAbNROQJ9RMQCY1N0C+Sc0EZFIzAZnUvHFSteikatFJ1SL8kUVAJjU3QJ5QMwF5Q80EZFIzAblR801AnlAzAZnUbDqpWnRSteikatEnf5yaCciNmieATGqeUHMDZFJzA+RGzQ2QGzUTkEnNGydVi06qFp1ULfrkJSDfBGRScwNkUjMBuQFyo2YC8gaQGzUTkEnNpGYCcqNm00nVopOqRSdViz75MiCTmknNG0AmNROQb1LzBJAbNROQSc0EZFLzBJBJzRsnVYtOqhadVC3CH3kByKRmAnKj5gbIpGYCcqPmBsik5gbIjZoJyKRmAnKj5gkgN2q+6aRq0UnVopOqRZ/8MjU3QCY1E5AbNROQSc0bat4A8gSQSc2NmhsgN2reOKladFK16KRq0SdfpuYNIDdqJiA3QCY1E5BNam6APAFkk5pNJ1WLTqoWnVQtwh/5BwPyhJoJyKTmDSBvqHkCyKTmBsiNmjdOqhadVC06qVr0yUtAfpOaSc0NkBs1TwCZ1HwTkEnNDZAbNd90UrXopGrRSdWiT5ap2QTkBsik5gbIpOYGyKTmRs0E5A01b6iZgNyoeeOkatFJ1aKTqkWffBmQJ9RsUnMDZFIzqZmAPKHmBsgE5A01E5DfdFK16KRq0UnVok/+ZYBMaiYgk5oJyKRmUjMBmdRMQCY1N2pugExq/pKTqkUnVYtOqhZ98h+jZgLyBJBJzQRkUjMBmdRMQJ4AMql5Qs2mk6pFJ1WLTqoWffJlar5JzRtqboBMaiYgk5oJyA2QSc0TQG7UTEC+6aRq0UnVopOqRZ8sA/KbgHyTmhs1E5BJzRNAbtRMaiYgN2q+6aRq0UnVopOqRfgjVUtOqhadVC06qVp0UrXopGrRSdWik6pFJ1WLTqoWnVQtOqladFK16KRq0UnVopOqRf8DAyUwM0aYJXwAAAAASUVORK5CYII=']")).getAttribute("src");
				Thread.sleep(5000);
				System.out.println(qrcodeurl);
				URL url= new URL(qrcodeurl);
				BufferedImage bufferedimage = ImageIO.read(url);
				LuminanceSource luminanceSource=new BufferedImageLuminanceSource(bufferedimage);
		        BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminanceSource));
		        Result result =new MultiFormatReader().decode(binaryBitmap);
		        System.out.println(result.getText());
				
  }
}
