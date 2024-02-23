package Handling_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_hold {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/clickHold?scenario=1&sublist=0");
		Thread.sleep(5000);
		WebElement Ch_hold = driver.findElement(By.id("circle"));
		Actions act = new Actions(driver);
		act.clickAndHold(Ch_hold).perform();
		Thread.sleep(1000);
		act.release(Ch_hold).perform();
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
	}
	

}
