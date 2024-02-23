package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class instagram_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("s.hemanth966@gmail.com");
		driver.findElement(By.name("password")).sendKeys("9663404136");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[normalize-space()='Show'])[1]")).click(); // password show
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div)[27]")).click(); // login button
		Thread.sleep(2000);
		driver.quit();
		
	}

}
