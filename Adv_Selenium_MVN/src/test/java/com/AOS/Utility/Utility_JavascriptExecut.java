package com.AOS.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility_JavascriptExecut {
	public static void scroll_actions(WebDriver driver,WebElement element)
	{
		JavascriptExecutor jss = Utility_object.javascript_object(driver);
		jss.executeScript("arguments[0].scrollIntoView()",element);
	}
	public static void disabled_element(WebElement element,WebDriver driver,String Value)
	{
		 JavascriptExecutor jss=Utility_object.javascript_object(driver);
		 jss.executeScript("arguments[0].value = '" + Value +"'",element);
		
	}
}
