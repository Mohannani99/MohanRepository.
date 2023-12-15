package selenium_Documentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptToOpenQspidersDemoApps {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[href='/button']"));
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='name']")).sendKeys("mohannani@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[class='pe-1 py-1 font-semibold flex items-center justify-between w-full text-sm whitespace-nowrap ps-3 flex-wrap']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[id='btn']")).click();	
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[id='btn3']")).click();	
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[id='btn8']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[href='/link']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[href='/link/contact']")).click();
	}
}
