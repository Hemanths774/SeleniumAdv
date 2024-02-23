package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisabledTFRemoveval {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/DisabledTextField.html");
		Thread.sleep(2000);
		JavascriptExecutor jss=(JavascriptExecutor)driver;
		jss.executeScript("document.getElementById('user').value='kpbv'");
		Thread.sleep(4000);
		jss.executeScript("document.getElementById('user').value=''");
		Thread.sleep(1000);
		driver.quit();
		
	}

}
