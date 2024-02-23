package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram_enable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://instagram.com");
	    Thread.sleep(3000);
	    WebElement element = driver.findElement(By.xpath("//div[text()='Log in']"));
	    
         boolean b = element.isEnabled();
         if (b) {
        	 System.out.println("Element is Enabled");
		}
         else {
			System.out.println("Element is Disabled");
		}
         
	    driver.quit();
	}

}
