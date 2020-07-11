package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import loanapplication.javaproject.Base;

public class Hooks  {
	public WebDriver driver;
	    @Before("@regTest")
		public void supermethod() {
		
		System.out.println("newton");
	}
	    @After("@searchTest")
		public void supemethod() throws IOException {
	    	
	    	driver=Base.newmethod();
	    	driver.close();
		
		System.out.println("newton1");
	}

}
