package ScreenShot;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class geteleSSC1{
	public static void caputreSsc(WebElement ele) {
		Date d= new Date();
		String da = d.toString().replaceAll(":", "-");
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dst = new File("./elephoto/"+da+".jpg");
		try {
			FileHandler.copy(src, dst);
		} catch (IOException e) {
			System.out.println("Error copying screenshot");
		}
	}
	
	
	
}