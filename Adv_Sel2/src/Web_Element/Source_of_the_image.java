package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Source_of_the_image {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./Softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("(//img)[1]"));
		String att = ele.getAttribute("src");
		System.out.println(att);
		driver.quit();
		
		
	}

}
