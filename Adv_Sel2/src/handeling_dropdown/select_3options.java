package handeling_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_3options {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/DropDown%20Multiple.html");
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.id("hotel"));
		Select 	sel = new Select(dd);
		List<WebElement> opts = sel.getOptions();
		int count = opts.size();
		System.out.println("the count of the DropDown is : "+ count);
		Thread.sleep(1000);
		sel.selectByIndex(2);
		Thread.sleep(500);
		sel.selectByValue("c");
		Thread.sleep(500);
		sel.selectByVisibleText("BadyCorn_fry");
		Thread.sleep(2000);
		sel.deselectAll();
		
		driver.quit();
		
	}

}
