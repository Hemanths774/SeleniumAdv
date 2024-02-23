package Handling_Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AL_CON {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(3000);
	driver.findElement(By.name("cusid")).sendKeys("4567",Keys.ENTER);
	Thread.sleep(2000);
	Alert alt = driver.switchTo().alert();
	String txt = alt.getText();
	System.out.println(txt);
	alt.accept();
	Thread.sleep(2000);
	driver.quit();
}
}
