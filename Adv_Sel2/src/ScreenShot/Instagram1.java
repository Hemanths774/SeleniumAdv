package ScreenShot;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Instagram1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver"	,"./Softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.name("username"));
		ele1.sendKeys("hello");
		geteleSSC1.caputreSsc(ele1);
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("123456");
		geteleSSC1.caputreSsc(pass);
		Thread.sleep(1000);
		WebElement click = driver.findElement(By.xpath("//div[contains (text(),'Log in')]"));
		click.click();
		geteleSSC1.caputreSsc(click);
		Thread.sleep(1000);
		driver.quit();
	
	}

	
}
