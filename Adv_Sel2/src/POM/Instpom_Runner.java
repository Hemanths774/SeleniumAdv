package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Instpom_Runner {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(1000);
		pom_instagram in= new pom_instagram(driver);
		in.un_Txt("hemanths.rpea27@gmail.com");
		Thread.sleep(1000);
		in.pwd_Txt("hemanth@774");
		Thread.sleep(1000);
		in.login_Btn();
				
	}

}
