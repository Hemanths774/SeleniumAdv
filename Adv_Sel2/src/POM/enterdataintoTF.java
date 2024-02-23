package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class enterdataintoTF {
	@Test
	public void enter() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		pom_facebook p= new pom_facebook(driver);
		Thread.sleep(1000);
		p.getUN();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		p.getUN();
		Thread.sleep(1000);
		driver.quit();
	}

}
