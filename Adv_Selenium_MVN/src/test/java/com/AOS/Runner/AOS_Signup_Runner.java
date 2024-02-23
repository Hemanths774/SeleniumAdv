package com.AOS.Runner;

import org.testng.annotations.Test;

import com.AOS.Utility.Utility_select;
import com.AOS.generic.base_class_signup;
import com.AOS.pom.pom_AOS_Signup;

public class AOS_Signup_Runner extends base_class_signup {
	@Test
	public void test() throws InterruptedException
	{
		pom_AOS_Signup sig= new pom_AOS_Signup(driver);
		Utility_select.sele_options(sig.get_gender(), 1 );
		sig.get_name().sendKeys("TestHemanth");
		sig.get_type();
		Utility_select.sele_options(sig.get_country(), "IN" );
		sig.get_phonenumber().sendKeys("9857478965");
		sig.get_email().sendKeys("testhem@gmail.com");
		sig.get_password().sendKeys("test@123");
		sig.get_passconfirmation().sendKeys("test@123");
		sig.get_terms();
		sig.get_registerbtn();
		
		Thread.sleep(2000);
					
	}

}
