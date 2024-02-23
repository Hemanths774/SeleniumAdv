package handling_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class instagram_Reported {
	@Test
	public void run()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Reporter.log("browser is launched", true);
		driver.get("https://www.instagram.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Instagram is Opened", true);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("s.hemanth966@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12456633");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Reporter.log("Enter valid Un and Passord and clicked on Login", true);
		driver.close();
	}

}
