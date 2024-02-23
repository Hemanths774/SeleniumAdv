package Multiple_webElements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Valueof_links {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println("the Link Count is: "+count);
		for (int i = 0; i < count; i++) 
		{
			WebElement link = links.get(i);
			String att = link.getAttribute("href");
			System.out.println(att);
			Thread.sleep(10);
			
		}
		
		driver.quit();
	}
	

}
