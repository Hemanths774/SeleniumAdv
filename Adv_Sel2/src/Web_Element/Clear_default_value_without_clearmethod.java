package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_default_value_without_clearmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/TextFunction.html");
		WebElement ele = driver.findElement(By.id("user1"));
		Thread.sleep(1000);
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(500);
		ele.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		driver.quit();
	}

}
