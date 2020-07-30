package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homeloan {
	@Test(groups={"smoke"})
	public void homewebLogin() {
		System.out.println("HomeWebLogin");
	}
	
	//@Test(enabled=false)
	@Test
	public void homemobileLogin() {
		System.out.println("HomeMobileLogin");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("i will execute after homeloan class");
	}
	
	@BeforeTest
	public void beforemobileLogin() {
		System.out.println("I will execute first");
	}
	
	@AfterTest
	public void atermobileLogin() {
		System.out.println("I will execute last");
	}
	
	//@Test(timeOut=4000) //wait for 40 seconds until this method executes.
	//@Parameters({"URL"})
	@Test
	public void homeapiLogin() {
		System.out.println("HomeAPILogin");
	}
}
