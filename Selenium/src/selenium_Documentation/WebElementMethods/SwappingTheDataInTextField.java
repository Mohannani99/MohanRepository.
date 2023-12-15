package selenium_Documentation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwappingTheDataInTextField {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/mohan/OneDrive/Desktop/swapping%20data%20in%20textfiled.html");
	WebElement ele1 = driver.findElement(By.xpath("//input[1]"));
	Thread.sleep(2000);
	
	ele1.sendKeys(Keys.CONTROL+"ax");

	WebElement ele3 = driver.findElement(By.xpath("//input[3]"));
	ele3.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(2000);
	WebElement ele2 = driver.findElement(By.xpath("//input[2]"));
	ele2.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(2000);
	
	ele1.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(2000);
	ele3.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(2000);
	
	ele2.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(2000);
	driver.quit();
}
}
