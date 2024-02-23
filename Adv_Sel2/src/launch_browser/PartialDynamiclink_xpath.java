package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialDynamiclink_xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/multiple%20Xpath.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains (text(),'Google')]")).click();
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.quit();
		
	}

}
