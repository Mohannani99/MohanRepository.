package practice_selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataIntoTextField {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/mohan/OneDrive/Desktop/UserName.html");
	Thread.sleep(2000);
//	driver.findElement(By.tagName("input")).sendKeys("mohan");
//	driver.findElement(By.id("a1")).sendKeys("nani");
//	driver.findElement(By.name("n1")).sendKeys("nayipramod");
	driver.findElement(By.className("c1")).sendKeys("pavi");
}
}

