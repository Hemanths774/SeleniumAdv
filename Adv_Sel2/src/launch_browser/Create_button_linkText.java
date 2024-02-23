package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Create_button_linkText {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
