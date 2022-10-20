package com.Flipkart.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass {
	
	private WebDriver driver;
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement username;
	
	public void SendUserName()
	{
		username.sendKeys("8421338768");
	}
	
	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;
	
	public void SendPassword()
	{
		password.sendKeys("84213338768S@d!k");
	}
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginbutton;
	
	public void ClickLoginButton()
	{
		loginbutton.click();
	}

	public LoginPOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
