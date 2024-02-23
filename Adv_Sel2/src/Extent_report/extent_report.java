package Extent_report;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extent_report {
	@Test
	public void run() throws IOException
	{
		ExtentSparkReporter reporter= new ExtentSparkReporter("./Extent_report/report.html");
		ExtentReports reports= new ExtentReports();
		reports.attachReporter(reporter);
		ExtentTest test= reports.createTest("check for Title").assignAuthor("Hemanth.S");
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		test.log(Status.INFO, "Empty Chrome Browser is Lauched");
		driver.get("https://www.zomato.com/india");
		test.log(Status.INFO, "Zomato Application is Lauched");
		String title = driver.getTitle();
		//if (title.equals("azby")) {
		if (title.equals("Best Restaurants in India - Zomato")) {
			test.log(Status.PASS, "title is Matching");
		}
		else {
			test.log(Status.FAIL, "title is In_Correct");
			test.addScreenCaptureFromPath(getPhoto(driver));
		}
		reports.flush();
		driver.close();
		
		
	}
	
	public String getPhoto(WebDriver driver) throws IOException
	{
	String path="./photo/defect.jpg";
	TakesScreenshot tss= (TakesScreenshot)driver;
	File src = tss.getScreenshotAs(OutputType.FILE);
	File dst= new File(path);
	FileHandler.copy(src, dst);
	return "."+path;
	}
	
	
	
	

}
