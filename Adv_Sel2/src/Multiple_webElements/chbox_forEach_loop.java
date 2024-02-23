package Multiple_webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chbox_forEach_loop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/checkbox.html");
		List<WebElement> chbox = driver.findElements(By.xpath("//input"));
		Thread.sleep(1000);
		for (WebElement chb : chbox) {
			chb.click();
			
			
		}
		Thread.sleep(1000);
		driver.quit();

}
}
