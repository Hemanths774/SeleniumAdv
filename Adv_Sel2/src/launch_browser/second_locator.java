package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class second_locator {
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/linkSrc.html");
	Thread.sleep(2000);
	driver.findElement(By.id("fb")).click();
	Thread.sleep(2000);
	System.out.println( driver.getCurrentUrl());
	driver.close();

	


	

}
}
