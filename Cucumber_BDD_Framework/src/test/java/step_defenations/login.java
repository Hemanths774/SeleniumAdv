package step_defenations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	public WebDriver driver;
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opts= new ChromeOptions();
		opts.addArguments("--headless");
		driver=new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	@Given("navigate to Login page")
	public void navigate_to_login_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@And("^User enter valid Username(.+)$")
	public void enterUsername(String username) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username);
	    
	}

	@And("^Enter valid Password(.+)$")
	public void enterPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	@And("click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@When("Home page should be displayed")
	public void home_page_should_be_displayed() {
         System.out.println("Home Page is displayed");
	}
	
	@Then("click on Logout button")
	public void click_on_logout_button() {
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}


}
