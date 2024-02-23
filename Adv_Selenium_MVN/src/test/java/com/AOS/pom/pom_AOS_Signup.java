package com.AOS.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_AOS_Signup {
	@FindBy(id = "gender")
	private WebElement gender;
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement name;
	@FindBy(xpath = "//input[@id='user_type-3']")
	private WebElement userType;
	@FindBy(id = "country")
	private WebElement country;
	@FindBy(xpath = "//input[@placeholder='Phone Number']")
	private WebElement phoneNumber;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	@FindBy(xpath ="//input[@id='password']")
	private WebElement password;
	@FindBy(xpath = "//input[@id='password_confirmation']")
	private WebElement password_Confirmation;
	@FindBy(xpath = "//input[@id='term']")
	private WebElement terms_click;
	@FindBy(xpath = "//button[@id='signup_btn']")
	private WebElement registerbtn;
	
	public pom_AOS_Signup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement get_gender()
	{
		return gender;
	}
	public WebElement get_name()
	{
		return  name;
	}
	public void get_type()
	{
		userType.click();
	}
	public WebElement get_country()
	{
		 return country;
	}
	public WebElement get_phonenumber()
	{
		return phoneNumber;
	}
	public WebElement get_email()
	{
		return email;
	}
	public WebElement get_password()
	{
		return password;
	}
	public WebElement get_passconfirmation()
	{
		return password_Confirmation;
	}
	public void get_terms()
	{
		terms_click.click();
	}
	public void get_registerbtn()
	{
		registerbtn.click();
	}
} 
