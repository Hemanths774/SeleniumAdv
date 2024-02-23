package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
		String title=driver.getTitle();
		System.out.println("the title is: "+title);
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println("the url is :"+url);
//		String src=driver.getPageSource();
//		System.out.println("the source code is : "+ src);
		Thread.sleep(2000);
		driver.quit();
	

	}
}
