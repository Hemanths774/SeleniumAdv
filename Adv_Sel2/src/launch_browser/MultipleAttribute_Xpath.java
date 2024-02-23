package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleAttribute_Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name' and @placeholder='Enter your name']")).sendKeys("hello");
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
