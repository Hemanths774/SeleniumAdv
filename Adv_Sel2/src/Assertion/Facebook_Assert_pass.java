package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook_Assert_pass {
	@Test
	public void assertion() 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String C_URL = driver.getCurrentUrl();
		Assert.assertEquals(C_URL, "https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("hello");
		driver.close();
		
		}

}
