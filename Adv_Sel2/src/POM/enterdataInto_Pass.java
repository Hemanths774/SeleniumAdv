package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class enterdataInto_Pass {
	@Test
	public void enterpass()
	{
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		pom_FB_MWP pw= new pom_FB_MWP(driver);
		pw.pass_Txt("hiFirst");
		driver.navigate().refresh();
		pw.pass_Txt("hiReturns");
		driver.quit();
	}

}
