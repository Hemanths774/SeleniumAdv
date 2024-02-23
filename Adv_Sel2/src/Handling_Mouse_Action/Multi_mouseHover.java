package Handling_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Multi_mouseHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/mouseHover/tab?sublist=3");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//li[text()='Men ']"));
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(By.xpath("//span[text()=\"Men's Top wear\"]"));
		act.moveToElement(ele1).perform();
		Thread.sleep(5000);
		WebElement ele2 = driver.findElement(By.xpath("(//li[@class='font-bold'])[1]"));
		act.moveToElement(ele2).perform();
		Thread.sleep(5000);
		
		WebElement ele3 = driver.findElement(By.xpath("(//span[text()=\"Men's T-Shirts\"])[1]"));
		act.moveToElement(ele3).perform();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
