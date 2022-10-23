package com.Flipkart.POMClass;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMClass {
	private WebDriver driver;
	private Actions act;
	private List<String> a;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[8]/a/div")
	private WebElement logoutButton;
	
	
	public void ClickLogoutButton()
	{
		act.click(logoutButton).perform();
	}

	
	public HomePOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
		a = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
	}
	
	
	
//	Add to Cart
	
	@FindBy(xpath = "//input[@class='_3704LK']")
	WebElement searchbox;
	
	public void SendKeySearchBox()
	{
		searchbox.sendKeys("vivo T1 5g");
	}
	
	@FindBy(xpath = "//button[@class='L0Z3Pu']")
	WebElement searchbutton;
	
	public void ClickOnSearchButton()
	{
	searchbutton.click();	
	}
	
	@FindBy(xpath = "//div[@class='_4rR01T']")
	WebElement selectmobile;
	
	public void ClickOnMobile() 
	{
	selectmobile.click();	
	}
	
	
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement addtocart;
	
	public void ClickAddtoCart()
	{
		addtocart.click();
	}
	
	
	
	// Add To Cart HTML Code
	
	
	@FindBy(xpath = "//div[@class='_2FYYw1 _2_OGP3 _2T1qz2']")
	WebElement addtocartText;
	
	public String GetTextAddToCart()
	{
		String totalproducts = addtocartText.getText();
		return totalproducts;
		
	}
	
	
	
	
	
	
	
	
	
	
}
