package com.AOS.Utility;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_select {
	public static void sele_options(WebElement element,Object data) {
		Select sele = Utility_object.Select_object(element);
		if (data instanceof Integer) {
			sele.selectByIndex((Integer) data);
		}
		else if (data instanceof String) {
			try {
				sele.selectByValue((String)data);
			} catch (Exception e) {
				sele.selectByVisibleText((String)data);
			}
			
		}
	}
	public static void desele_options(WebElement element,Object data)
	{
		Select sele = Utility_object.Select_object(element);
		if (data instanceof Integer) {
			sele.deselectByIndex((Integer)data);
		}
		else if (data instanceof String) {
			try {
				sele.deselectByValue((String)data);
			} catch (Exception e) {
				sele.deselectByVisibleText((String)data);
			}
			
		}
		
	}
	public static void dese_All_Options(WebElement element,Object data) 
	{
		Select sele = Utility_object.Select_object(element);
		sele.deselectAll();
		
	}
	public static List<WebElement> get_Options(WebElement element, Object data) 
	{
		Select sele = Utility_object.Select_object(element);
		return sele.getOptions();
	}

	public static WebElement get_First_Sele_Options(WebElement element)
	{
		Select sele = Utility_object.Select_object(element);
		return sele.getFirstSelectedOption();
	}
	public static List<WebElement> get_All_Sele_Options(WebElement element)
	{
		Select sele = Utility_object.Select_object(element);
		 return sele.getAllSelectedOptions();
		
	}
	
}
