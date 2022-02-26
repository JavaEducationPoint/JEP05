package com.jep.pageFactory;

import org.openqa.selenium.WebDriver;

import com.jep.pages.Homepage;
import com.jep.pages.LoginPage;

public class PageeFactory {
	
	WebDriver driver;
	Homepage homePage;
	LoginPage loginPage;
	
	public PageeFactory(WebDriver driver)
	{
		this.driver=driver;
	}

	public Homepage getHomePage()
	{
		homePage= new Homepage(driver);
		return homePage;
	}
	public LoginPage getLoginPage()
	{
		loginPage= new LoginPage(driver);
		return loginPage;
	}
}
