package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_FB_MWP {
@FindBy(id="pass")
private WebElement pass_Txt;
public pom_FB_MWP(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
public void pass_Txt(String pass)
{
	pass_Txt.sendKeys(pass);
}

}
