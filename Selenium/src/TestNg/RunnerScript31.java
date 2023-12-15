package TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerScript31 extends GenericScript{
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9491743830");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("MOhannani99#@!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
