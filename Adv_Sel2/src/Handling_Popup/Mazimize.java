package Handling_Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mazimize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized","--incognito");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.quit();
		
	}

}
