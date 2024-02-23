package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VRL_Loader {


	public static void main(String[] args) throws InterruptedException
    {
        
    	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
    	
        String baseUrl = "https://www.vrlgroup.in/vrl_travels_service.aspx";
        String expectedTitle = "VRL Logistics Limited";
        		
        String actualTitle = "";

       
        driver.get(baseUrl);

       
        actualTitle = driver.getTitle();

       
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        
        Thread.sleep(3000);
        driver.close();
    }

}