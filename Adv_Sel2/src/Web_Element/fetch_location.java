package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetch_location {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Point loc = driver.findElement(By.xpath("//a[text()='Careers']")).getLocation();
		System.out.println(loc);
		int x = loc.getX();
		int y = loc.getY();
		System.out.println("the value of x is : "+x);
		System.out.println("the value of y is : "+y);
		driver.quit();
		

	}

}
