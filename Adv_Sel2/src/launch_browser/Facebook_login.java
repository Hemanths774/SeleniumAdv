package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("s.hemanth966@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hemanth@774");
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		driver.quit();
	}

}
