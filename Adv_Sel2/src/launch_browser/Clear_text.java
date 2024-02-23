package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clear_text {
	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/linkSrc.html");
		Thread.sleep(2000);
		driver.findElement(By.id("UN-Text")).clear();
//		driver.findElement(By.className("Un")).clear(); // not working 
		Thread.sleep(2000);
		driver.quit();		
	}

}
