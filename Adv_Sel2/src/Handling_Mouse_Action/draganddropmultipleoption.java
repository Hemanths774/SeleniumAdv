package Handling_Mouse_Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropmultipleoption
{
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		driver.get("https://demoapps.qspiders.com/dragDrop/dragToMultiple?sublist=2");
		WebElement ele1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement ele2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement ele3 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Thread.sleep(2000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		ele1.click();
		ele2.click();
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(ele2, ele3).perform();
		Thread.sleep(2000);
		
		
		
		WebElement ele4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement ele5 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement ele6 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		ele4.click();
		ele5.click();
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		act.dragAndDrop(ele5, ele6).perform();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
