package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_DotheActionOnlyIfTheURL_is {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		wait.until(ExpectedConditions.urlContains("https://www.youtube.com/"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@id='endpoint' and @title='Shorts'])")).click();

	}

}
