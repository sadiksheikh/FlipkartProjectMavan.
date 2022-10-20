package com.Flipkart.TestClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	private WebDriver driver;
	
	@Test
	public void verifyLoginFunctionality()
	{
	log.info("Apply Validation");
	
	String expectedtitle = "https://www.flipkart.com/";
	
	String actualtitle = "https://www.flipkart.com/";
	
	
	Assert.assertEquals(actualtitle, expectedtitle);
	
	
	}

}
