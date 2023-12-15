package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends GenericScript {
	@Test
	public void Hard_Assert()
	{
		String title = driver.getTitle();
		//System.out.println(title);
		Assert.assertEquals(title, "Facebook");
		//Assert.fail();
	
	}
	
	@Test
	public void a1()
	{
		System.out.println("Executed");
	}
	
	

}
