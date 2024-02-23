package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		TakesScreenshot tss= (TakesScreenshot)driver;
		File tmp = tss.getScreenshotAs(OutputType.FILE);
		File pmt=new File("./photo/defect.jpeg");
		FileHandler.copy(tmp, pmt);
		Thread.sleep(1000);
		driver.quit();
		
	}

}
