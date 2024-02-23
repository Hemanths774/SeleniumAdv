package Multiple_webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textof_the_link {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		Thread.sleep(1000);
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		int count = ele.size();
		System.out.println("the count of the text is: "+count);
		for (int i = 0; i < count; i++) 
		{
			WebElement texts = ele.get(i);
			String txt = texts.getAttribute("text");
			System.out.println(txt);
			
		}
		driver.quit();
	}

}
