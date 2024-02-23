package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swapthetext {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/TextFunction.html");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("user1"));
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		ele.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		WebElement ele3 = driver.findElement(By.id("user3"));
		ele3.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.id("user2"));
		ele2.sendKeys(Keys.CONTROL+"a");
		ele2.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		ele.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		ele3.sendKeys(Keys.CONTROL+"a");
		ele3.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		ele2.sendKeys(Keys.CONTROL+"a");
		ele2.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		ele3.sendKeys(Keys.CONTROL+"a");
		ele3.sendKeys(Keys.BACK_SPACE);
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
