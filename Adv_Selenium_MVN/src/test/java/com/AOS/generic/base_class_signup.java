package com.AOS.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class_signup implements frame_work_constant_AOS{
	 public WebDriver driver;
	@BeforeClass
	
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public void openapp()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(signupurl);
	}
	
	@AfterMethod
	public void closeapp(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE) {
			  Getdefect.CaptureScreenShot(driver);

		}
		driver.manage().deleteAllCookies();


	}
	@AfterClass
	public void deletecookie()
	{
		driver.quit();
			}

}
