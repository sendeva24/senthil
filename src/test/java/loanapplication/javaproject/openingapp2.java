package loanapplication.javaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class openingapp2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        DesiredCapabilities ch= DesiredCapabilities.chrome();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        ChromeOptions c= new ChromeOptions();
        c.merge(ch);
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.xpath("//h2[@class='_8eso _3ma']")).getText());
		driver.findElement(By.cssSelector("input")).sendKeys("sendeva35@icloud.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("$amman30");
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.id("u_0_b")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("userNavigationLabel")).click();
		
		
		
	}

}
