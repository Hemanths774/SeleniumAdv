package Child_browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_both_PandChi {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		driver.findElement(By.id("tabButton")).click();
		Set<String> all_id = driver.getWindowHandles();
		for (String id : all_id) 
		{
			driver.switchTo().window(id);
			Thread.sleep(3000);
			driver.close();
			
		}
		
	}

}
