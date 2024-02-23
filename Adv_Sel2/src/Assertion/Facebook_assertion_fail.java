package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook_assertion_fail {
	@Test
	public void assertion() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele1 = driver.findElement(By.name("email"));
		boolean enb = ele1.isEnabled();
		Assert.assertEquals(enb, false);
		ele1.sendKeys("hi");
		driver.close();
	}
}
