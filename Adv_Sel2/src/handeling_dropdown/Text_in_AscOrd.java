package handeling_dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Text_in_AscOrd {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/heman/OneDrive/Desktop/Adv_sele/DropDown%20Multiple.html");
		WebElement dd = driver.findElement(By.id("hotel"));
		Select select = new Select(dd);
		List<WebElement> opts = select.getOptions();
		ArrayList<String> ar_li = new ArrayList<String>();
		int count = opts.size();
		System.out.println("The count of drop down is : " + count);
		for (WebElement opt : opts) {
			String txt = opt.getText();
			ar_li.add(txt);
		}
		Collections.sort(ar_li);
		for (String ar : ar_li) {
			System.out.println(ar);
			
		}
		Thread.sleep(1000);
		driver.quit();
			
		}
	}


