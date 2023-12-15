package Handling_pop_Ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden_Division_Popup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.redbus.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.findElement(By.id("onward_cal")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[.='27'])[1]")).click();
	Thread.sleep(4000);
	driver.close();
	}
}
