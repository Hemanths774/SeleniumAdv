package Handling_Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/uploadfile.html");
		Thread.sleep(5000);
		driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\heman\\OneDrive\\Desktop\\Adv_sele\\checkbox.html");
		Thread.sleep(5000);
		driver.quit();
		
	
	}

}