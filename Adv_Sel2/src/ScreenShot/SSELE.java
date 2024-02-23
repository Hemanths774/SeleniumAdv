package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SSELE {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com");
		WebElement ele = driver.findElement(By.name("username"));
		ele.sendKeys("Hello");
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dst= new File("./photo/eledefect.png");
		FileHandler.copy(src, dst);
		Thread.sleep(500);
		driver.quit();
		}

}
