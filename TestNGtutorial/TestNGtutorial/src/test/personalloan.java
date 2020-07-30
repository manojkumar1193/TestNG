package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class personalloan {
	@Test(groups= {"smoke"})
	public void personalwebLogin() {
		System.out.println("PersonalWebLogin");
	}
	
	@Parameters({"URL"})
	@Test
	public void personalmobileLogin(String aaaa) {
		System.out.println("PersonalMobileLogin");
		System.out.println(aaaa);
	}
	
	@BeforeSuite
	public void afterSuite() {
		System.out.println("I am the first one to print");
	}
	
	@Test
	public void personalapiLogin() {
		System.out.println("PersonalAPILogin");
	}
	
	@Test
	public void notpersonalapiLogin() {
		System.out.println("NotPersonalAPILogin");
	}
}
