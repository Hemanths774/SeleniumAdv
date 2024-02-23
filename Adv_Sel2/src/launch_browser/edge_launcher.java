package launch_browser;

import org.openqa.selenium.edge.EdgeDriver;

public class edge_launcher 
{

	public static void main(String[] args) 
	{
		String key="webdriver.edge.driver";
		String value="./Softwares/msedgedriver.exe";
		System.setProperty(key, value);
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.com");
	}
}


