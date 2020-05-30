package loanapplication.javaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class dynmicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        DesiredCapabilities ch= DesiredCapabilities.chrome();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        ChromeOptions c= new ChromeOptions();
        c.merge(ch);
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		//Thread.sleep(10000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//driver.findElement(By.id("divpaxinfo")).click();
		//Select s=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		//s.selectByValue("9");
		//driver.findElement(By.id("divpaxinfo")).click();
		//Select s=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		//s.selectByValue("option2");
		//s.selectByIndex(3);
		//System.out.println(driver.findElement(By.xpath("//h2[@class='_8eso _3ma']")).getText());
		//driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("sendeva35@icloud.com");
		//driver.findElement(By.xpath("//body/header/div/a")).click();
		//driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("$amman30");
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.id("u_0_b")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("userNavigationLabel")).click();
		
		
		
	}

}
