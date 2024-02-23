package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_instagram {
	@FindBy(xpath = "//span[text()='Phone number, username, or email']")
	private WebElement un_Txt;
	@FindBy(xpath = "//span[text()='Password']")
	private WebElement pwd_Txt;
	@FindBy(xpath = "//div[text()='Log in']")
	private WebElement login_Btn;

	public pom_instagram(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void un_Txt(String txt) {
		un_Txt.sendKeys(txt);
	}

	public void pwd_Txt(String txt1) {
		pwd_Txt.sendKeys(txt1);
	}

	public void login_Btn() {
		login_Btn.click();
		
	}

}
