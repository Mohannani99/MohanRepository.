package ChildBrowserPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class InGooglePageClickOnKannadaAND_open_it_inNewTabThenClickOnEnglish {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	
	Actions act =new Actions(driver);
	Thread.sleep(2000);
	act.contextClick(ele).perform();
	Thread.sleep(2000);
	Robot r =new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	
	Set<String> allwh = driver.getWindowHandles();
	for (String wh : allwh) {
	driver.switchTo().window(wh);
	
		Thread.sleep(2000);
	}
	driver.findElement(By.xpath("//a[.='English']")).click();
		
}
}
