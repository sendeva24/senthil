package loanapplication.javaproject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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

public class sorting {

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
		driver.get("http://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		List<WebElement> p=driver.findElements(By.xpath("//tbody/tr/td[2]"));
		
		ArrayList<String> original= new ArrayList<String>();
		
		for( int i=0;i<p.size();i++)
		
		{
			original.add(p.get(i).getText());
			//System.out.println(original.add(p.get(i).getText()));
		}
		
		ArrayList<String> copy = new ArrayList<String>();
		
		for (int i=0;i<original.size();i++)
				
				{
					copy.add(original.get(i));
				}
           
		Collections.sort(copy);
		
		for(String s:original)
		{
			System.out.println(s);
		}
 for(String q:copy)
 {
	 System.out.println(q);
 }
		
	Assert.assertTrue(original.equals(copy));
		
	}

}
