package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clickonlink_withoutclickmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/TextFunction.html");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.linkText("google"));
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.quit();
	}

}
