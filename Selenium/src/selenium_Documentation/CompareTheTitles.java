package selenium_Documentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompareTheTitles {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9491743830");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mohannani99#@!");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[.='Log in']")).click();
	Thread.sleep(3000);
	String title=driver.getTitle();
	if(title=="Hello World")
	{
		System.out.println("Same");
	}
	else
	{
		System.out.println("different");
	}
	
}
}
