package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/linkSrc.html");

		Thread.sleep(3000);
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
