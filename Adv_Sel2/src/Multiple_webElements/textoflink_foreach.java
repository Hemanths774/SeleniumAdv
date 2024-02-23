package Multiple_webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textoflink_foreach {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://amazon.in");
			Thread.sleep(1000);
			List<WebElement> ele = driver.findElements(By.xpath("//a"));
			int count = ele.size();
			Thread.sleep(500);
			System.out.println("the count of the text is: "+count);
			Thread.sleep(2000);
			for (WebElement texts : ele) {
				String txt = texts.getAttribute("text");
				System.out.println(txt);
				
			}
			driver.quit();
	}

}
