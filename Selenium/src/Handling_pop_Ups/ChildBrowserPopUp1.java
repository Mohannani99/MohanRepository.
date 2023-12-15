package Handling_pop_Ups;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserPopUp1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	Thread.sleep(3000);

	Set<String> awh = driver.getWindowHandles();
	for(String a:awh)
	{	
		driver.switchTo().window(a);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
			
	}

 }
}
