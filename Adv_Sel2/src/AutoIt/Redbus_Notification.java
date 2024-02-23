package AutoIt;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus_Notification {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\heman\\OneDrive\\Desktop\\AutoIt_Scripts\\redbus.exe");
		Thread.sleep(1000);
		driver.quit();
		
	}

}
