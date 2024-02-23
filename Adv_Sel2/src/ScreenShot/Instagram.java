package ScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		Getdefect.CaptureScreenShot(driver);
		driver.findElement(By.name("username")).sendKeys("hello");
		Thread.sleep(2000);
		Getdefect.CaptureScreenShot(driver);
		driver.findElement(By.name("password")).sendKeys("12345");
		Thread.sleep(2000);
		Getdefect.CaptureScreenShot(driver);
		Thread.sleep(1000);
		driver.quit();
		
	}

}
