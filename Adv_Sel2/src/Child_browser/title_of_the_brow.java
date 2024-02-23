package Child_browser;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title_of_the_brow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/browser?sublist=0");
		driver.findElement(By.id("browserLink1")).click();
		Set<String> all_id = driver.getWindowHandles();
		ArrayList<String> arrli = new ArrayList<String>(all_id);
		String ChBrow = arrli.get(1);
			driver.switchTo().window(ChBrow);
			Thread.sleep(3000);
			String title = driver.getTitle();
			System.out.println(title);
			
			
			
		String ParBro = arrli.get(0);
		driver.switchTo().window(ParBro);
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}

}
