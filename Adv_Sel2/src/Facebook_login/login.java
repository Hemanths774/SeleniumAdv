package Facebook_login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class login extends Facebook_base_class 
{
	@Test(priority = 0)
	public void testLogin() throws InterruptedException
	{
		driver.findElement(By.name("email")).sendKeys("Hello");
		driver.findElement(By.name("pass")).sendKeys("Hellloooo");
		driver.findElement(By.name("login")).submit();
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	public void testLogin1() throws InterruptedException
	{
		driver.findElement(By.name("email")).sendKeys("feello");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).submit();
		Thread.sleep(2000);
	}
	
	

}
