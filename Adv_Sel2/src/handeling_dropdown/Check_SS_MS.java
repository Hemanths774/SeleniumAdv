package handeling_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Check_SS_MS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/DropDown.html");
		WebElement dd = driver.findElement(By.id("hotel"));
		Select sel= new Select(dd);
		boolean b = sel.isMultiple();
		if (b) {
			System.out.println("It is a Multi Select dropdown");
			
		}
		else {
			System.out.println("It is a Single select dropdown");
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
