package launch_browser;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 Dimension d = new org.openqa.selenium.Dimension(600, 500);
		 driver.manage().window().setSize(d);
		 Thread.sleep(3000);
		 driver.quit();
		 
	}

}
