package Web_Element;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class attribute_title {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.linkText("ಕನ್ನಡ"));
		System.out.println(ele.getAttribute("title"));
		WebElement ele1 = driver.findElement(By.linkText("हिन्दी"));
		System.out.println(ele1.getAttribute("title"));
		driver.quit();
		
		
	}

}
