package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("nike shoes");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//h3[@class='product-brand'])[1]"));
		String text = ele.getText();
		System.out.println("The Brand is :" + text);
		WebElement ele1 = driver.findElement(By.xpath("(//h4[@class='product-product'])[1]"));
		String text1 = ele1.getText();
		System.out.println("The Product is :" + text1);
		WebElement ele2 = driver.findElement(By.xpath("(//a/div[2]/div/span[1]/span[1])[1]"));
		String text2 = ele2.getText();
		System.out.println("The Price is :" + text2);
		Thread.sleep(1000);
		driver.quit();

	}

}
