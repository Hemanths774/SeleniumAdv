package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Form {
	@Test(dataProvider="StudentForm")
	public void dataTest(String FN ,String LN, String Eml, String Num, String CA )
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("firstName")).sendKeys(FN);
		driver.findElement(By.id("lastName")).sendKeys(LN);
		driver.findElement(By.id("userEmail")).sendKeys(Eml);
		driver.findElement(By.id("userNumber")).sendKeys(Num);
		driver.findElement(By.id("currentAddress")).sendKeys(CA);
		driver.close();
		
	}
	
	@DataProvider(name="StudentForm")
	public Object[][] data()
	{
		return new Object[][] 
				{
			{"Hemanth","S","s.hemanth666@gmail.com","9663404136","Attur Layout Yelahanka Bangalore"}
				};
	}

}
