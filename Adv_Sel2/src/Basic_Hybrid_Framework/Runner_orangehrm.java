package Basic_Hybrid_Framework;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Runner_orangehrm extends base_class_orangehrm {
	@Test
	public void login() throws InterruptedException 
	{
		pom_orangeHrm p= new pom_orangeHrm(driver);
		WebElement un = p.getUN();
		wait.until(ExpectedConditions.visibilityOf(un)).sendKeys("admin");
		Thread.sleep(1000);
		p.getPASS().sendKeys("admin123");
		Thread.sleep(1000);
		p.getLogin().click();
		Thread.sleep(5000);
		
		
	}

}
