package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Facebook_SoftAssert {
	@Test
	public void sftAssert()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Help']"));
		String val = ele.getCssValue("font-family");
		SoftAssert s= new SoftAssert();
		s.assertEquals(val, "ArialBold");
		driver.findElement(By.name("email")).sendKeys("AssertPass");
		s.assertAll();
		
	}
	
	

}
