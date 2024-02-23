package Web_Element;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Fetch_Size {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.id("email"));
		Dimension d = ele.getSize();
		int H = d.getHeight();
		int W = d.getWidth();
		System.out.println(d);
		System.out.println("the height is "+ H);
		System.out.println("the width is "+ W);
		driver.quit();
		
		
	}

}
