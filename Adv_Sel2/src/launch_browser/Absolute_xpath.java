package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/absoluteXpath.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/input")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/a")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
