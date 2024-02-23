package Synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EplicitWait_AlertPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebDriverWait wait= new WebDriverWait(driver, 10);
		driver.findElement(By.name("cusid")).sendKeys("1245", Keys.ENTER);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		
	}

}
