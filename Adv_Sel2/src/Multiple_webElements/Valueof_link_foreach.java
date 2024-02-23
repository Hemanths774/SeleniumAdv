package Multiple_webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Valueof_link_foreach {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		Thread.sleep(500);
		System.out.println("the Link Count is: "+count);
		Thread.sleep(1000);
		
		for (WebElement link : links) {
			String txt = link.getAttribute("href");
			System.out.println(txt);
		}
		Thread.sleep(1000);
		driver.quit();
			
		}

}
