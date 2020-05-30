package loanapplication.javaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       DesiredCapabilities ch= DesiredCapabilities.chrome();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        ChromeOptions c= new ChromeOptions();
        c.merge(ch);
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000); 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		//driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("is enabled");
			Assert.assertTrue(true);
			
		}
		
		else
		
		{
			Assert.assertFalse(false);
		}
		//driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
       // System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();	
       // driver.findElement(By.id("checkBoxOption1")).click();
       // System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
       // driver.findElement(By.id("checkBoxOption1")).click();
      //  System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        //Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
       // System.out.println(driver.findElements(By.cssSelector("input[value='checkbox']")).size());
		//WebElement N =driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin']/div/input"));
		//N.sendKeys("MUM");
		//N.sendKeys(Keys.ARROW_DOWN);
		//N.sendKeys(Keys.ENTER);
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Select s=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		s.selectByValue("9");
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
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
