package launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dualbrowser_Laucher 
{
	public static void main(String[] args)
	{
		String key="webdriver.chrome.driver";
		   String value="./Softwares/chromedriver.exe";
		   System.setProperty(key, value);
		   new ChromeDriver();
		   
		   String key1="webdriver.gecko.driver";
		   String value1="./Softwares/geckodriver.exe";
		   System.setProperty(key1, value1);
		   new FirefoxDriver();
		   
			

		
	}

}
