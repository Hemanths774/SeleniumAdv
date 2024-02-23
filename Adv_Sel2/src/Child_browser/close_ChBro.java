package Child_browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class close_ChBro {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		driver.findElement(By.id("tabButton")).click();
		String Parent_id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		int count = all_id.size();
		System.out.println("the Count of id : "+count);
		all_id.remove(Parent_id);
		int count1 = all_id.size();
		System.out.println("the Count  of id after removing : "+count1);
		for (String id : all_id) 
		{
			driver.switchTo().window(id);
			Thread.sleep(3000);
			driver.close();
			
		}
	}

}
