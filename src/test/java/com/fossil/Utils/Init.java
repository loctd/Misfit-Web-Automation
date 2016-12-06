package com.fossil.Utils;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Init {

	private FirefoxDriver driver;
	
	protected void setUpBeforeInit()
	{
		//Init driver
		Reporter.log("=============Start Test===========", true);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://misfit.com");
		
	}
	
	protected void setUpBeforeInitMethod()
	{
		//Init Test page
		//login to authorize if needed
	}
	
	protected void tearDownAfterInitMethod()
	{
		//log out if needed
		
	}
	
	protected void tearDownAfterInit()
	{
		//log out if needed, close browser
		driver.close();
		
	}
	
}
