package handling_testng;

import org.testng.annotations.Test;

public class method_enabled {
	@Test(enabled = true)
	public void compose()
	{
		System.out.println("mail is composed ");
	}
	@Test(enabled = false)
	public void sentitems()
	{
		System.out.println("mail is in sent items");
	}

}
