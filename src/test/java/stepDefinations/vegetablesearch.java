package stepDefinations;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import loanapplication.javaproject.Base;

import io.cucumber.datatable.DataTable;


public class vegetablesearch {
	public WebDriver driver;
	
	@Given("user logins to the green page")
	public void user_logins_to_the_green_page() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");
			driver=Base.newmethod();
			 //driver.get("http://rahulshettyacademy.com/seleniumPractise/#/");
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 
			
	    }

	    @When("^search for \"([^\"]*)\"$")
	    public void search_for_something(String s)  {
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys(s);	
	    
	    }

	    @Then("^results for \"([^\"]*)\" will be retrieved$")
	    public void results_for_something_will_be_retrieved(String s)  {
	    	Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(s));
	    }
	    @Then("^\"([^\"]*)\" is displayed$")
	    public void something_is_displayed(String s)  {
	    	Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(s));
	       
	    }
	   

	    @And("^items added to the cart$")
	    public void items_added_to_the_cart()  {
	    	
	    	driver.findElement(By.cssSelector("a.increment")).click();
	    	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	        
	    }

	    @And("^user navigated to checkout$")
	    public void user_navigated_to_checkout()  {
	    	driver.findElement(By.cssSelector("a.cart-icon")).click();
	    	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	    	
	    }
	    
	  


}
