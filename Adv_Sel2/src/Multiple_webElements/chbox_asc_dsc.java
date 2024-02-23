package Multiple_webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chbox_asc_dsc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/checkbox.html");
		List<WebElement> chbox = driver.findElements(By.xpath("//input"));
		int count = chbox.size();
		Thread.sleep(1000);
		for (int i = 0; i < count; i++) {
			WebElement ch = chbox.get(i);
			ch.click();
			
		}
		Thread.sleep(1000);
		for (int i = count-1; i>=0; i--) {
			WebElement ch = chbox.get(i);
			ch.click();
			
			
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
