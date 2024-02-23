package Multiple_webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class reverse_of_linkText {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in");
	 List<WebElement> ele = driver.findElements(By.xpath("//a"));
	 int count = ele.size();
	 Thread.sleep(3000);
	 System.out.println("The Count of div is : " + count);
	 Thread.sleep(500);
	 for (int i = count-1; i>=0; i--) 
	 {
		 WebElement list = ele.get(i);
		 String txt = list.getAttribute("text");
		 System.out.println(txt);
		
	}
	 driver.quit();
 }
}
