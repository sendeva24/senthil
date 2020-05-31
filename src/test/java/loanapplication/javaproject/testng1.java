package loanapplication.javaproject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;






public class testng1 {
	
	
	
	

	
	
	@Test
	public void sen2() {
		System.out.println("test2");
		String s = System.getProperty("user.dir")+"\\reports\\index.html";
		
		
		
	}
	@Test(dependsOnMethods= {"sen12"})
	public void sen3() {
		
		System.out.println("test3");
	}
	@Parameters({"url","name"})
	@Test
	public void sen12(String google,String username) 
	{
		
		System.out.println("test12");
		System.out.println(google);
		System.out.println(username);
	}
	@Test(enabled=false)
	public void sen13() {
		
		System.out.println("test13");
	}
	@DataProvider
	public Object[][] sen14() {
		
		Object[][] data= new Object[3][2];
		data[0][0]="first";
		data[0][1]="pass1";
		data[1][0]="second";
		data[1][1]="pass2";
		data[2][0]="three";
	    data[2][1]="pass3";
	    return data;
		
		
	}
	@BeforeSuite
	public void sen15() {
		
		System.out.println("test15");
	}
	@AfterSuite
	public void sen16() {
		
		System.out.println("test16");
	}
	
    @Test(dataProvider="sen14")	
        public void sen20(String usname ,String pw) {
		
		System.out.println("test20");
		System.out.println(usname);
		System.out.println(pw);
    }
			
	@Test
	public void sen50() {
		
		System.out.println("test50");
	}
	
	@Test
	public void sen51() {
		
		System.out.println("test51");
	}
	
	@Test
	public void sen52() {
		
		System.out.println("test51");
	}
	
	@Test
	public void sen53() {
		
		System.out.println("test51");
	}
	
	@Test
	public void sen54() {
		
		System.out.println("test51");
	}
	@Test
	public void sen55() {
		
		System.out.println("test51");
	}
		
		
	
	}
    
    
	

