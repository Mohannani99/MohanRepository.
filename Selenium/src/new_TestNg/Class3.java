package new_TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class3 {

	@Test
	public void mtd1()
	{
		Reporter.log("Hi",true);
		
	}
	@Test
	public void mtd2()
	{
		Reporter.log("hellooo",true);
		
	}
	@Test
	public void mtd3()
	{
		Reporter.log("hello",true);
		
	}
}
