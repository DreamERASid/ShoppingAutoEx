package com.Shopping.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Shopping.TestBase.TestBase;
import com.Shopping.TestPages.HomePage;

public class HomePageTest extends TestBase
{
	HomePage home;
	

	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	void setUp()
	{
		intilization();
		home=new HomePage();
		
	}
	
	
	
	@Test(priority = 0)
	void verifyPageTitle()
	{
		
		String title=home.verifytitle();
		
		Assert.assertEquals(title,"Automation Exercise");
	}
	
	
	@Test(priority = 1)
	void verifyHomePageLanding()
	{
		boolean elementvisible=home.verifyhomepage();
		
		Assert.assertEquals(true,elementvisible);
	}
	
	
	
	
	@AfterMethod
	void teardown()
	{
		driver.quit();
	}
  

	
}
