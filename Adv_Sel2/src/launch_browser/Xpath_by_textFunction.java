package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_by_textFunction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
