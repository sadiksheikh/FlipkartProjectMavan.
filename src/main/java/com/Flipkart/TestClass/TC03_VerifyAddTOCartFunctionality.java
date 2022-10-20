package com.Flipkart.TestClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Flipkart.POMClass.HomePOMClass;

public class TC03_VerifyAddTOCartFunctionality extends TestBaseClass
{
	private WebDriver driver;

	@Test
	public void verifyAddTOCartFunctionality()
	{
	
	HomePOMClass hp = new HomePOMClass(driver);
	
	hp.SendKeySearchBox();
	hp.ClickOnSearchButton();
	hp.ClickOnMobile();
	hp.ClickAddtoCart();
	
	log.info("Apply Validation");
	
	String expecteditem = "Flipkart (1)";
	String actualitem = hp.GetTextAddToCart();
	log.info(actualitem);
	
	Assert.assertEquals(actualitem, expecteditem);
	}
	
	
}
