package com.jep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement username;
	
	@FindBy(id="'ap_email")
	WebElement username1;
	
	 public void enterText()
	 {
		 username.sendKeys("hello");
	 }

}
