package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNG1 {

@Test
public void demo() {
	System.out.println("Hello");
	Assert.assertTrue(false);
}

@BeforeMethod()
public void beforeevery() {
	System.out.println("this will print before every method");
}
@Parameters({"URL"})
@Test
public void demo1(String bbbb) {
	System.out.println("hello1");
	System.out.println(bbbb);
}
}
