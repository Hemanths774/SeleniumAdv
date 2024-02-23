package Handling_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Copy']"));
		Actions act= new Actions(driver);
		act.contextClick(ele).click(ele1).perform();
		Thread.sleep(2000);
		driver.quit();
		
				
	}

}
