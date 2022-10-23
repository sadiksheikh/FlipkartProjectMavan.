package com.Flipkart.TestClass;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Flipkart.POMClass.LoginPOMClass;





public class TestBaseClass {
	
	
	private WebDriver driver;
	Logger log = Logger.getLogger("FlipkartProjectMavan");
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName)
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "./DriverFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		PropertyConfigurator.configure("log4j.properties");
		driver.manage().window().maximize();
		log.info("Window Maximize");
		
		driver.get("https://www.flipkart.com/");
		log.info("Flipkart site is Open");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		log.info("Wait Apply");
	
	LoginPOMClass lp = new LoginPOMClass(driver);
	lp.SendUserName();
	log.info("Enter UserName");
	
	lp.SendPassword();
	log.info("Enter Password");
	
	lp.ClickLoginButton();
	log.info("Click Login Button");
	
//	}
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//		log.info("Browser is Closed");
//	}
	
}
}