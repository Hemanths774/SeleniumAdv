package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sixth_locator {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create a ")).click();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
