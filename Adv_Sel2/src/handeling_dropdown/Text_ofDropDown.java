package handeling_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Text_ofDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/DropDown%20Multiple.html");
		WebElement dd = driver.findElement(By.id("hotel"));
		Select sel = new Select(dd);
		List<WebElement> opts = sel.getOptions();
		for (WebElement opt : opts) {
            System.out.println(opt.getText());
        }
		driver.quit();
	}

}
