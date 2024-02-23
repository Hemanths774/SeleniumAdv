package AutoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='file']")).click();
		Runtime.getRuntime().exec("C:\\Users\\heman\\OneDrive\\Desktop\\AutoIt_Scripts\\uploadfile.exe");
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
	}

}
