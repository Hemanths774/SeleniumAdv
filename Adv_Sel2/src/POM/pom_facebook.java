package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_facebook {
	@FindBy(id="email")
	private WebElement un_Txt;
	public pom_facebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void getUN()
	{
		un_Txt.sendKeys("hi");
	}
}
