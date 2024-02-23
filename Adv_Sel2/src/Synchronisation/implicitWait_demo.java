package Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class implicitWait_demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/progress/timer?sublist=2");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("5");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebElement ele = driver.findElement(By.xpath("//p[text()='Do you like Automation']/../select"));
		Select sel = new Select(ele);
		sel.selectByValue("Yes");
		
		
		
		
	}

}
