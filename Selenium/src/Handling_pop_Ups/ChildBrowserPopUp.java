package Handling_pop_Ups;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	Set<String> wid = driver.getWindowHandles();
	for( String a:wid)
	{
		System.out.println(a);
	}
	
	
}
}
