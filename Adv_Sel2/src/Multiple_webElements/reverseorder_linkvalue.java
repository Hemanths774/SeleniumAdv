package Multiple_webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class reverseorder_linkvalue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println("the Link Count is: "+count);
		Thread.sleep(500);
		for (int i = count-1; i>=0; i--) 
		{
			WebElement link = links.get(i);
			String att = link.getAttribute("href");
			System.out.println(att);
			
			
		}
		
		driver.quit();
		
	}

}
