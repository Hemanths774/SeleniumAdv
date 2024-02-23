package Listeners;

import org.testng.annotations.BeforeMethod;

import ScreenShot.Getdefect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class base_class {
  public WebDriver driver;
  @BeforeMethod
  public void OpenApp() {
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void CloseApp(ITestResult result) {
	  if (result.getStatus()==ITestResult.FAILURE) {
		  Getdefect.CaptureScreenShot(driver);
		
	}
	  driver.close();
	  
  }

}
