package com.Flipkart.TestClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Flipkart.POMClass.HomePOMClass;

public class TC02_VerifyLogoutFunctionality extends TestBaseClass
{
	private WebDriver driver;
	@Test
	public void verifyLogoutFunctionality()
	{
		HomePOMClass hp = new HomePOMClass(driver);
		hp.ClickLogoutButton();
		log.info("Logout done");
		
		log.info("Apply Validation");
		
		String expectedUrl = "https://www.flipkart.com/";
		
		String actualUrl = driver.getCurrentUrl();
		log.info(actualUrl);
		
		Assert.assertEquals(actualUrl, expectedUrl);
	
		
	}
	
}
