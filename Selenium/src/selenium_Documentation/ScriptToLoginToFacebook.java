package selenium_Documentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScriptToLoginToFacebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id=email]")).sendKeys("9491743830");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id=pass]")).sendKeys("Mohannani99#@!");
	
	driver.findElement(By.cssSelector("button[name='login']")).click();
	
}
}
