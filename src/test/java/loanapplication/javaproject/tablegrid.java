package loanapplication.javaproject;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class tablegrid {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
       DesiredCapabilities ch= DesiredCapabilities.chrome();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        ChromeOptions c= new ChromeOptions();
        c.merge(ch);
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.quit();
		//driver.get("http://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		File src=    ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\sende\\screenshot.png"));
		//WebElement n= driver.findElement(By.id("product"));
		//int p=n.findElements(By.tagName("tr")).size();
		//System.out.println(n.findElements(By.tagName("tr")).size());
		//System.out.println(n.findElements(By.tagName("th")).size());
		
		//List<WebElement> q =driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		//System.out.println(q.get(0).getText());
		//System.out.println(q.get(1).getText());
		//System.out.println(q.get(2).getText());
		
		
		
		
		
		
	}

}
