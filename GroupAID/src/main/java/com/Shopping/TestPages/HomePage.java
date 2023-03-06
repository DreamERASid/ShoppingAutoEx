package com.Shopping.TestPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.Shopping.TestBase.TestBase;

public class HomePage extends TestBase
{
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement home;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	WebElement Products;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	WebElement Cart;
	
	@FindBy( xpath= "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	WebElement loginelement;
	
	@FindBy( xpath= "//h2[contains(text(),'Category')]")
	WebElement cate;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonhomelink()
	{
		home.click();
	}
	
	public String verifytitle()
	{
		String title=driver.getTitle();
		
		return title;
	}
	
	public boolean verifyhomepage()
	{
		boolean catedis=cate.isDisplayed();
		return catedis;
	}
	

	public LoginPage clickonlogin()
	{
		loginelement.click();
		return new LoginPage();
		
	}
}
