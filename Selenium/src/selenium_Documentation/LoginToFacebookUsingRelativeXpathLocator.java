package selenium_Documentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToFacebookUsingRelativeXpathLocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9491743830");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mohannani99#@!");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
}
}
