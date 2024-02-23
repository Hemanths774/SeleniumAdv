package Handling_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Performm_click_actions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://demoapps.qspiders.com/mouseHover/rating?sublist=2");
		Actions act	= new Actions(driver);
		WebElement Mh_ov = driver.findElement(By.xpath("(//*[local-name()='svg'])[4]"));
		act.moveToElement(Mh_ov).click().perform();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
