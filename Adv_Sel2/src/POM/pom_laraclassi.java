package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_laraclassi {
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
	public pom_laraclassi(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void loginlink()
	{
		loginlink.click();
	}
	public void signuplink()
	{
		signuplink.click();
	}
	public void search(String txt)
	{
		search.sendKeys(txt);
	}
	public void location(String txt1)
	{
		location.sendKeys(txt1);
	}
	public void Findbtn()
	{
		Findbtn.click();
	}
}
