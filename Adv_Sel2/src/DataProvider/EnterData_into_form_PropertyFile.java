package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterData_into_form_PropertyFile {
	@Test
	public void testEnter() throws IOException, InterruptedException
	{
		FileInputStream fis=new FileInputStream("./Properties/Form.properties");
		Properties p= new Properties();
		p.load(fis);
		String Fn = p.getProperty("Name");
		String Ln = p.getProperty("last");
		String Mai = p.getProperty("Email");
		String Mob = p.getProperty("Mobile");
		String Add = p.getProperty("Current_Address");
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("firstName")).sendKeys(Fn);
		driver.findElement(By.id("lastName")).sendKeys(Ln);
		driver.findElement(By.id("userEmail")).sendKeys(Mai);
		driver.findElement(By.id("userNumber")).sendKeys(Mob);
		driver.findElement(By.id("currentAddress")).sendKeys(Add);
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
