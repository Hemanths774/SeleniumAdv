package launch_browser;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourth_locator {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/linkSrc.html");
	Thread.sleep(2000);
	driver.findElement(By.className("facebook")).click();
	Thread.sleep(2000);
	driver.quit();

	}

}
