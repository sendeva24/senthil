package loanapplication.javaproject;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class countlinks {

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
		//WebDriverWait w=new WebDriverWait(driver,5);
		
		//String[] importantitems = { "Cucumber", "Brocolli","Beetroot","Carrot" };
		driver.get("http://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> w =driver.findElements(By.tagName("a"));
		System.out.println(w.size());
		
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement coloumn=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumn.findElements(By.tagName("a")).size());
	     
		
		for(int i=1;i<coloumn.findElements(By.tagName("a")).size();i++)
		{
		String s=Keys.chord(Keys.CONTROL,Keys.ENTER);
		coloumn.findElements(By.tagName("a")).get(i).sendKeys(s);
			
		}
		
		Set <String> id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		
		while(it.hasNext());
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
		

		
	}
	}
