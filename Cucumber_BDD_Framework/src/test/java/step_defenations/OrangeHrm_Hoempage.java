package step_defenations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm_Hoempage {
	public WebDriver driver;
	@Given("I will open the browser and enter the url")
	public void i_will_open_the_browser_and_enter_the_url() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	    
	}

	@When("I will enter the Un and pwd and click on login button")
	public void i_will_enter_the_un_and_pwd_and_click_on_login_button() {
		driver.findElement(By.name("username")).sendKeys("admin");	
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");// import Asset from org.jUnit	    
	}

	@Then("I will logout and close the browser")
	public void i_will_logout_and_close_the_browser() {
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	    
	}


}
