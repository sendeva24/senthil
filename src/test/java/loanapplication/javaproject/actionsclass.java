package loanapplication.javaproject;

import java.util.Arrays;
import java.util.List;
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

public class actionsclass {

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
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		WebElement a =driver.findElement(By.id("nav-link-accountList"));
		Actions ab =new Actions(driver);
		//ab.moveToElement(a).contextClick(target)
		//ab.moveToElement(a).contextClick().
		//WebElement b =driver.findElement(By.id("twotabsearchtextbox"));
		//ab.moveToElement(b).click().keyDown(Keys.CONTROL+C).sendKeys("hello").doubleClick().build().perform();
		

		
		
	}
}
