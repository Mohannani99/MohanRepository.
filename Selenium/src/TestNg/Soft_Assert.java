package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert extends GenericScript {
	@Test
	public void softAssert()
	{
		String title = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title, "__");
		System.out.println("1");
		sa.assertAll();
		
		
	}
	@Test
	public void sample()
	{
		System.out.println("sh");
	}

}
