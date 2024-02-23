package handling_testng;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;




public class runner {
	
	@Test
	public void run ()
	{
		{
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--start-maximized");
			WebDriver driver= new ChromeDriver(options);
			driver.get("https://www.instagram.com");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys("hello");
			driver.findElement(By.name("password")).sendKeys("hellooo");
			driver.findElement(By.xpath("//div[text()='Log in']")).submit();
			driver.close();
		}
		}
		@Test
		public void run1()
		{
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://chercher.tech/practice/frames");
			
			driver.switchTo().frame("frame1");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
			driver.switchTo().frame("frame3");
			driver.findElement(By.xpath("//input[@id='a']")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			WebElement dd = driver.findElement(By.id("animals"));
			Select select= new Select(dd);
			select.selectByIndex(2);
			driver.close();
			
			
	
	}
}
	
