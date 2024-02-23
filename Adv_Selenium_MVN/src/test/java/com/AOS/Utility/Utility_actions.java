package com.AOS.Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility_actions {
	public static void mouse_houver(WebDriver driver,WebElement element)
	{
		Utility_object.Actions_object(driver).moveToElement(element).perform();
	}
	public static void mouse_hover_click(WebDriver driver,WebElement element)
	{
		Utility_object.Actions_object(driver).moveToElement(element).click().perform();
	}
	public static void right_click(WebDriver driver,WebElement element)
	{
		Utility_object.Actions_object(driver).contextClick(element).perform();
	}
	public static void double_click(WebDriver driver,WebElement element)
	{
		Utility_object.Actions_object(driver).doubleClick(element).perform();
	}
	public static void drag_drop(WebDriver driver,WebElement element,WebElement element1)
	{
		Utility_object.Actions_object(driver).dragAndDrop(element, element1).perform();
	}

}
