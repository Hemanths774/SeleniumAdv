package Handling_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class multipleTab_mouseHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/mouseHover/tab?sublist=3");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//li[text()='Men ']"));
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//li[text()='Women ']"));
		act.moveToElement(ele1).perform();
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.xpath("//li[text()='Kids ']"));
		act.moveToElement(ele2).perform();
		Thread.sleep(3000);
		WebElement ele3 = driver.findElement(By.xpath("//li[text()='Home & Living']"));
		act.moveToElement(ele3).perform();
		Thread.sleep(3000);
		WebElement ele4 = driver.findElement(By.xpath("//li[text()='Beauty ']"));
		act.moveToElement(ele4).perform();
		Thread.sleep(5000);
		driver.quit();
	}
	
	

}
