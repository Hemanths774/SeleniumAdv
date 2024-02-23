package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DisabledTF {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","./Softwares/msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/DisabledTextField.html");
	Thread.sleep(1000);
	JavascriptExecutor jss=(JavascriptExecutor)driver;
	jss.executeScript("document.getElementById('user').value='AZBY'");
	Thread.sleep(1000);
	driver.quit();
	
}
}
