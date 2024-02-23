package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FetchProperties_PropertyFile {
	@Test
	public void data() throws IOException
	{
		FileInputStream fis=new FileInputStream("./Properties/data.properties");
		Properties p=new Properties();
		p.load(fis);
		String v = p.getProperty("Un");
		System.out.println(v);
		
		
	}

}
