package handling_testng;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AmazonCart {
	@Test
	public void addtoCart() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@ id='twotabsearchtextbox']")).sendKeys("Apple mac Book", Keys.ENTER);
		WebElement ele1 = driver.findElement(By.xpath("(//img[@alt='Apple 2022 MacBook Air Laptop with M2 chip: 34.46 cm (13.6-inch) Liquid Retina Display, 8GB RAM, 256GB SSD Storage, Backli...'])[1]"));
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", ele1);
		ele1.click();
		Set<String> wh = driver.getWindowHandles();
		ArrayList<String> arrayList= new ArrayList<String>(wh);
		String win = arrayList.get(1);
		driver.switchTo().window(win);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		String Pw = arrayList.get(0);
		driver.switchTo().window(Pw);
		driver.close();
		driver.quit();
	}

}
