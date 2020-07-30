package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class carloan {
	@Test(groups={"smoke"})
	public void carwebLogin() {
		System.out.println("CarWebLogin");
	}
	
	@BeforeClass
	public void beforeclass(){
		System.out.println("i will execute before carloan class");
	}
	
	@Test(dataProvider="getdata")
	public void carmobileLogin(String username, String password) {
		System.out.println("CarMobileLogin");
		System.out.println(username);
		System.out.println(password);
	}
	
	@AfterSuite
	public void beforeSuite() {
		System.out.println("I am the last one to Print");
	}
	
	//@Test(dependsOnMethods= {"carmobileLogin"})
	@Test
	public void carapiLogin() {
		System.out.println("CArAPILogin");
	}
	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[3][2];
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		return data;
				
	}
}
