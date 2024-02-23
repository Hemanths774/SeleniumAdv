package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copypaste_text {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/TextFunction.html");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.id("user1"));
		ele.sendKeys(Keys.CONTROL + "a");
		ele.sendKeys(Keys.CONTROL + "c");
		Thread.sleep(500);
		WebElement ele1 = driver.findElement(By.id("user2"));
		ele1.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(500);
		ele1.sendKeys(Keys.CONTROL + "v");
		Thread.sleep(1000);	
		driver.quit();

	}

}
