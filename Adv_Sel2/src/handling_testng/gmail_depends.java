package handling_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class gmail_depends {
	
	@Test(invocationCount = 2)
	public void Compose() {
		System.out.println("mail is Composed");
	}


@Test
public void sentitems()

	{
		Assert.fail();
		System.out.println("mail is present in sent items");
	}

@Test
public void trash() {
	System.out.println("mail is in trash");
}
}
