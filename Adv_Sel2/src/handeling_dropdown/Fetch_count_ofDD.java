package handeling_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fetch_count_ofDD {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/DropDown.html");
	WebElement dd = driver.findElement(By.id("hotel"));
	Select sel = new Select(dd);
	List<WebElement> opts = sel.getOptions();
	int count = opts.size();
	System.out.println("The Count of the Drop Down is : "+count);
	Thread.sleep(1000);
	driver.quit();
	}

}
