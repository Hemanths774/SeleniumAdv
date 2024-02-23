package com.AOS.Runner;


import org.testng.annotations.Test;

import com.AOS.generic.base_class;
import com.AOS.pom.pom_AOS;


public class AOS_Runner  extends base_class{
	@Test
	public void test() throws InterruptedException
	{


		pom_AOS lc= new pom_AOS(driver);
		lc.get_loginlink();
		Thread.sleep(500);
		driver.navigate().back();
		lc.get_signuplink();
		Thread.sleep(500);
		driver.navigate().back();
		lc.get_search("mobile");
		lc.get_location("bangalore");
		Thread.sleep(1000);
		lc.get_Findbtn();
		Thread.sleep(1000);
		
	}

}
