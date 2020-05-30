package loanapplication.javaproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class celenderui {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       DesiredCapabilities ch= DesiredCapabilities.chrome();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        ChromeOptions c= new ChromeOptions();
        c.merge(ch);
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("travel_date")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"));
		{
				driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next]")).click();
		}
				
		
		List<WebElement> w = driver.findElements(By.className(".day"));
		
		for(int i=0;i<w.size();i++)
		
		{
			String x=w.get(i).getText();
			
			if (x.equalsIgnoreCase("23"))
			
			{
				w.get(i).click();
				break;
			}
			
			{
				driver.quit();
			}
		}
		
		
		
		
	}

}
