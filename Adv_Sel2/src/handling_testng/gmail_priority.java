package handling_testng;

import org.testng.annotations.Test;

public class gmail_priority {
	@Test(priority = 0)
	public void sentitems()
	{
		System.out.println("Checked mail");
	}
	@Test(priority = 1)
	public void compose()
	{
		System.out.println("Mail is Composed ");
	}
	@Test(priority = 2)
	public void againsentitems()
	{
		System.out.println("mail is Prsent in sent items");
	}
	@Test(priority = 3)
	public void trash()
	{
		System.out.println("Mail is present in trash");
	}
}
