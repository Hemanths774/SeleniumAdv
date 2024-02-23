package com.AOS.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Getdefect {
	public static void CaptureScreenShot(WebDriver driver)
	{
		Date d= new Date();
		String dt = d.toString().replaceAll(":", "-");
		TakesScreenshot tss= (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst= new File("./Screenshot/"+dt+".jpg");
		try {
			FileHandler.copy(src, dst);
		} catch (IOException e) {
			System.out.println("Screenshot not Capture");
		}
	}

}

