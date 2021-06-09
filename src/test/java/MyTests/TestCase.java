package MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase {

	SoftAssert softAssert = new SoftAssert();
	@Test
	public void test1() {
		System.out.println("Open Browser");
		
		Assert.assertEquals(true, true); //hard assertion
		
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on sign in button");
		
		Assert.assertEquals(true, true); //hard assertion
		System.out.println("validate Home Page");
		
		softAssert.assertEquals(true, false,"Home Page titile is missing"); //soft assertion
		
		System.out.println("goto deals page");
		System.out.println("create a deal");
		softAssert.assertEquals(true, false,"not able to create a deal"); //soft assertion
		
		System.out.println("go to contact page");
		System.out.println("create a contact");
		softAssert.assertEquals(true, false,"not able create a contact"); //soft assertion
		
		softAssert.assertAll();
	}
	
	public void test2() {
		System.out.println("logout");
		softAssert.assertEquals(true, false);
		softAssert.assertAll();
	}
}
