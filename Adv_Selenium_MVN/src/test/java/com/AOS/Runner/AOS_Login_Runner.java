package com.AOS.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AOS.generic.base_class_login;
import com.AOS.pom.pom_AOS_Login;

public class AOS_Login_Runner extends base_class_login {
	
	@Test(dataProvider = "login")
	public void testLogin(String Un, String pwd) throws InterruptedException
	{
		pom_AOS_Login lgn= new pom_AOS_Login(driver);
		lgn.getEmail().sendKeys(Un);
		lgn.getpassword().sendKeys(pwd);
		lgn.getLoginBtn();
		WebElement wel_msg = driver.findElement(By.xpath("//i[@class='icon-user fa']/..//span[contains(text(),'')]"));
		String text = wel_msg.getText();
		System.out.println("Welcome Account Name: " + text+ "  Test Is Pass");
	}
	
	@DataProvider(name="login")
	public Object [][] data()
	{
		return new  Object [][]{
			{email,password},
			{"ladarius20@gmail.com","uxwol1wjpr"},
			{email1,password1}
		};
	}
	
	

}
