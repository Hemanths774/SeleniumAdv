package Synchronisation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait_Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Achieved Frames Through Explicitly Wait");
	}

}
