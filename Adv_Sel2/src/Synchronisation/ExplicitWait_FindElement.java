package Synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_FindElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebDriverWait wait= new WebDriverWait(driver,10);
		WebElement ele = driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys("hello");
		driver.findElement(By.id("pass")).sendKeys("world");
		driver.findElement(By.name("login")).click();
	}
	}


