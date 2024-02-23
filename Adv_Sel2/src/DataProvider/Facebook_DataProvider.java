package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook_DataProvider {
	@Test(dataProvider = "facebook")
	public void run(String UN, String PWD)
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(UN);
		driver.findElement(By.id("pass")).sendKeys(PWD);
		driver.findElement(By.name("login")).click();
		
	}
	@DataProvider(name = "facebook")
	public Object[][] data()
	{
		return new Object [][] {
			{"ABC", "ABC@123"},
			{"XBY", "xby@456"},
			{"nbv", "NVT%567"}
		};				
			
		
	}

}
