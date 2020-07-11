package loanapplication.javaproject;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.net.Urls;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SAUCELABS {
	
	public static final String USERNAME="SENTHIL";
	public static final String ACCESS_KEY="SENTHIL";
	public static final String URL="HTTP://"+USERNAME+":"+ACCESS_KEY+"@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		
	DesiredCapabilities N=  DesiredCapabilities.chrome();
	N.setCapability("Platform", "Windows10");
	N.setCapability("version", "Chrome");
	WebDriver Driver=new RemoteWebDriver(new java.net.URL(URL), N);
	Driver.get("http://google.com");
	System.out.println(Driver.getTitle());
	
	
		// TODO Auto-generated method stub

	}

}
