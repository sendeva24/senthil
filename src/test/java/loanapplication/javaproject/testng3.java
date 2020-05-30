package loanapplication.javaproject;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng3 {
	
	@Test
	public void sen5() {
		
		System.out.println("test5");
	}
	@BeforeMethod
	public void sen6() {
		
		System.out.println("beforemethod");
	}

	@AfterMethod
	public void sen7() {
		
		System.out.println("aftermethod");
	}
	@BeforeClass
	public void sen8() {
		
		System.out.println("test8");
	}
	@Test
	public void sen9() {
		
		System.out.println("test9");
		Assert.assertTrue(false);
	}
	@AfterTest
	public void sen10() {
		
		System.out.println("test10");
	}
	@BeforeTest
	public void sen11() {
		
		System.out.println("tes11");
	}
	@AfterClass
	public void sen117() {
		
		System.out.println("tes17");
	}

}
