package loanapplication.javaproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	
	public static WebDriver driver;
	public static Properties p;
	
	public static WebDriver newmethod() throws IOException {
		
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\sende\\javaproject\\src\\sen.properties");
		p.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get(p.getProperty("url"));
		return driver;
	}

}
