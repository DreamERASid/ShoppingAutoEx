package com.Shopping.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Shopping.TestBase.TestBase;
import com.Shopping.TestPages.HomePage;
import com.Shopping.TestPages.LoginPage;

public class LoginTest extends TestBase
{
	HomePage home;
	LoginPage loginp;
	
	public LoginTest()
	{
		super();
	}
	
	@BeforeMethod
	void setUp()
	{
		intilization();
		
	}
	
	
	@Test
	void verifyvalidlogin()
	{
		home=new HomePage();
		loginp=new LoginPage();
		loginp=home.clickonlogin();
		loginp.login(prop.getProperty("u"),prop.getProperty("p"));
		
		String needurl="https://automationexercise.com/";
		
		String currenturl=driver.getCurrentUrl();
		
		Assert.assertEquals(needurl,currenturl);
	}
	
	@AfterMethod
	void teardown()
	{
		driver.quit();
	}
  
 
}
