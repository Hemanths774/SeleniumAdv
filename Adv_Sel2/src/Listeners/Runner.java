package Listeners;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner  extends base_class{
	@Test
	public void run() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("hello");
		Thread.sleep(2000);
		Assert.fail();
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
	}
	

}
