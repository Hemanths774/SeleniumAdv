package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchtheURlandSourcecode {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
