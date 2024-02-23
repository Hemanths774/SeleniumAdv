package Youtube_Play;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Youtube_Base {
	
		public WebDriver driver;
		@BeforeMethod
		public void openyoutube()
		{
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.youtube.com");
			
		}
		@AfterMethod
		public void closeyoutube()
		{
			driver.close();
		}
		
	}


