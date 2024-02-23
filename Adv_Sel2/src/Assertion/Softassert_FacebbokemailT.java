package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert_FacebbokemailT{
	@Test
	public void emailTF()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.name("email"));
		Dimension size = ele.getSize();
		int wdh = size.getWidth();
		SoftAssert s= new SoftAssert();
		s.assertEquals(wdh, "50");
		s.assertAll();
		
	}

}
