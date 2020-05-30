package loanapplication.javaproject;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class implicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,5);
		
		String[] importantitems = { "Cucumber", "Brocolli","Beetroot","Carrot" };
		driver.get("http://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		implicitwait b = new implicitwait();
		b.additems(driver, importantitems);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.promoBtn")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}

	public void additems(WebDriver driver,String[] importantitems)
	{
		int j=0;
	
 List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	
	for (int i = 0; i < products.size(); i++) {
		String[] name = products.get(i).getText().split("-");
		String formatName=name[0].trim();

		List<String> totallist = Arrays.asList(importantitems);
  
		if(totallist.contains(formatName))
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			
			if (j==importantitems.length)
			{
				break;
				
			}
		}
	}
	}
}
