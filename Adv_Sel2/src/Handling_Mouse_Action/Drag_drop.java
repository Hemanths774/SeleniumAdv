package Handling_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		WebElement ele = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement ele1 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement ele2 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
		Actions act = new Actions(driver);
		act.moveToElement(ele).dragAndDrop(ele, ele2).perform();
		Thread.sleep(5000);
		act.moveToElement(ele1).dragAndDrop(ele1, ele2).perform();
		Thread.sleep(5000);
		driver.quit();
		
		


	}

}
