package Handling_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/mouseHover?sublist=0");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//img[@src='/static/media/message-hint.b2a6e0d93a0cc13121a0.png']"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(1000);
		driver.quit();
		
		
		
	}

}
