package handling_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InstaLogin {
	@Test
	public void login()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("s.hemanth966@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12456633");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}

}
