package com.AOS.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_AOS  {
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginlink;
	@FindBy(xpath = "//a[text()='Signup']")
	private WebElement signuplink;
	@FindBy(xpath = "//input[@placeholder='What ?']")
	private WebElement search;
	@FindBy(name = "location")
	private WebElement location;
	@FindBy(xpath = "//strong[text()='Find']")
	private WebElement Findbtn;
	public pom_AOS(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void get_loginlink()
	{
		loginlink.click();
	}
	public void get_signuplink()
	{
		signuplink.click();
	}
	public void get_search(String txt)
	{
		search.sendKeys(txt);
	}
	public void get_location(String txt1)
	{
		location.sendKeys(txt1);
	}
	public void get_Findbtn()
	{
		Findbtn.click();
	}
}
