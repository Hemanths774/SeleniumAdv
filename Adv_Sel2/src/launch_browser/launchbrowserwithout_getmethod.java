package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchbrowserwithout_getmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/multiple%20Xpath.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains (text(),'Google')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		driver.quit();
		
	}

}
