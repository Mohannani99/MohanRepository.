package selenium_Documentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToInstagramUsingRelativeXpathLocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9491743830");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mohannani99#@!");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
