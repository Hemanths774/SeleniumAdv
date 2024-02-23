package com.AOS.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_AOS_Login {
	@FindBy(id = "email")
	private WebElement email;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "loginBtn")
	private WebElement loginBtn;
	
	
	public pom_AOS_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEmail()
	{
		return email;
	}
	public WebElement getpassword()
	{
		return password;
	}
	public void getLoginBtn()
	{
		loginBtn.click();
	}
	


}
