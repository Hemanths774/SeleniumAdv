package Handling_Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddDiv {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000);
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='30']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
