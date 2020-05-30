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

public class frames {

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
		driver.get("http://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		//WebElement a =driver.findElement(By.id("nav-link-accountList"));
		//Actions ab =new Actions(driver);
		//ab.moveToElement(a).contextClick().build().perform();
		//WebElement b =driver.findElement(By.id("twotabsearchtextbox"));
		//ab.moveToElement(b).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		//System.out.println(driver.getTitle());-0ko[pl./,"
		
		
		Set <String>ids= driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		String Parent =it.next();
		String child =it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		driver.switchTo().window(Parent);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		

		
	}
	}
