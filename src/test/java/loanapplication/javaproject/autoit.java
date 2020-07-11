package loanapplication.javaproject;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class autoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://altoconvertpdftojpg.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("dropzoneInput-label")).click();
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\downloads2 backup\\newautofile.exe");
		WebDriverWait w= new WebDriverWait(driver,10);
		w.until((ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@type='button']")))));
		driver.findElement(By.xpath("//button[@type='button']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));

		driver.findElement(By.linkText("Download Now")).click();
       Thread.sleep(5000);
       
       File f=new File(System.getProperty("User.dir")+"\\downloads.jpg");
       if(f.exists())
    	   
       {
    	   Assert.assertTrue(f.exists());
    	   
    	   if(f.delete())
    		   
    		   System.out.println("file deleted");
       }
		

	}

}
