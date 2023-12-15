package selenium_Documentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Send_mail_in_yahoo_using_Rxpath {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("mohannani99999@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Madhavi@12345");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='ybarMailLink']")).click();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("mohannani99999@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("SampleSubject");
	}
}
