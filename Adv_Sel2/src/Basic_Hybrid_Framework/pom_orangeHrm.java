package Basic_Hybrid_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_orangeHrm {
	@FindBy(name="username")
	private WebElement un_txt;
	@FindBy(name="password")
	private WebElement pass_txt;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login_btn;
	
	public pom_orangeHrm(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getUN()
	{
		return un_txt;
	}
	public WebElement getPASS()
	{
		return pass_txt;
	}
	public WebElement getLogin()
	{
		return login_btn;
	}

}
