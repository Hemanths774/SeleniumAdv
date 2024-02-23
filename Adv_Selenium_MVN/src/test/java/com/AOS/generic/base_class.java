package com.AOS.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class base_class implements frame_work_constant_AOS {
  public WebDriver driver;
  @BeforeMethod
  public void OpenApp() {
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get(url);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// its for selenium 4 onwards
	  


  }

  @AfterMethod
  public void CloseApp(ITestResult result) {
	  if (result.getStatus()==ITestResult.FAILURE) {
		  Getdefect.CaptureScreenShot(driver);

	}
	  driver.close();

  }

}
