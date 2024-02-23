package handeling_dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shaadi.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='lookingFor']/../div/div")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[contains(text(),'Man')]")).click();
		driver.findElement(By.xpath("//div[text()='Man']")).click();
		Thread.sleep(1000);
		
		
		driver.quit();
		
	}

}
