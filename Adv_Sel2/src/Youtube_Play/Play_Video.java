package Youtube_Play;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Play_Video extends Youtube_Base
{
	@Test(priority = 0)
	public void video() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("innastu beku rama song");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();	
		driver.findElement(By.xpath("//yt-formatted-string[text()='All' and @id='text']/../../../../../../../../following-sibling::ytd-two-column-search-results-renderer//div/ytd-section-list-renderer//div[3]/ytd-video-renderer/div/ytd-thumbnail/following-sibling::div/div/div/h3/a[@id='video-title']//yt-icon[@id='inline-title-icon']/..//following-sibling::yt-formatted-string[@aria-label]")).click();
		Thread.sleep(3000);
		
	}
	@Test(enabled = false)
	public void Video1() throws InterruptedException {
		
	
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Hanuman Trailer");
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();	
	driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
	Thread.sleep(2000);
	}

}
