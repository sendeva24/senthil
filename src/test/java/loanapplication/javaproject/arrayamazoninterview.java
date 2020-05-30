package loanapplication.javaproject;

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
import org.openqa.selenium.support.ui.Select;

public class arrayamazoninterview {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] importantitems = { "Cucumber", "Brocolli","Beetroot","Carrot" };
		driver.get("http://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
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
		// driver.findElement(By.id("alertbtn")).click();
		// System.out.println(driver.switchTo().alert().getText());
		// driver.switchTo().alert().accept();

		// Select s=new
		// Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		// s.selectByValue("9");
		// driver.findElement(By.id("divpaxinfo")).click();
		// Select s=new
		// Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		// s.selectByValue("option2");
		// s.selectByIndex(3);
		// System.out.println(driver.findElement(By.xpath("//h2[@class='_8eso
		// _3ma']")).getText());
		// driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("sendeva35@icloud.com");
		// driver.findElement(By.xpath("//body/header/div/a")).click();
		// driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("$amman30");
		// driver.findElement(By.linkText("Forgot account?")).click();
		// driver.findElement(By.id("u_0_b")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.id("userNavigationLabel")).click();

	}

}
