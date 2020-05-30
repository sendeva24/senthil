package loanapplication.javaproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class gb {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\sende\\javaproject\\src\\sen.properties");
		prop.load(fis);
		prop.setProperty("browser", "firefox");
		prop.getProperty("url");
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream("C:\\Users\\sende\\javaproject\\src\\sen.properties");
		prop.store(fos, null);
		

	}

}
