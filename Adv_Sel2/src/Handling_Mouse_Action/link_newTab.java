package Handling_Mouse_Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class link_newTab {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		WebElement K_link = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Actions act= new Actions(driver);
		act.contextClick(K_link).perform();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
