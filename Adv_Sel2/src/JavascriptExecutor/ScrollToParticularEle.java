package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToParticularEle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//a[text()='About Us']"));
        Point loc = ele.getLocation();
		int y = loc.getY();
		JavascriptExecutor jss= (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,arguments[0])",y);
		//jss.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(3000);
		driver.quit();
		
	}
}
