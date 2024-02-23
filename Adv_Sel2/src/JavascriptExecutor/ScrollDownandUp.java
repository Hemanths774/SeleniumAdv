package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownandUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		JavascriptExecutor jss=(JavascriptExecutor)driver;
		
		for (int i = 1; i <=3; i++) {
			jss.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
		}
		for (int i = 1; i <=3; i++) {
			jss.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
